/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.keyvault.Vault;
import com.microsoft.azure.management.resources.core.TestUtilities;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.rest.RestClient;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class VirtualMachineEncryptionOperationsTests extends ComputeManagementTest {

    private static String RG_NAME = "";
    private final static Region REGION = Region.US_EAST;

    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        RG_NAME = generateRandomResourceName("vmencryptst", 18);
        super.initializeClients(restClient, defaultSubscription, domain);
    }

    @Override
    protected void cleanUpResources() {
        resourceManager.resourceGroups().beginDeleteByName(RG_NAME);
    }

    @Test
    @Ignore("Requires manually creating service principal and setting SP credentials in the test")
    public void canEncryptVirtualMachineLegacy() {
        // https://docs.microsoft.com/azure/virtual-machines/linux/disk-encryption-overview
        //
        // KeyVault Resource ID
        String keyVaultId = "KEY_VAULT_ID_HERE";
        // Azure AD service principal client (application) ID
        String aadClientId = "AAD_APPLICATION_ID_HERE";
        // Azure AD service principal client secret
        String aadSecret  = "AAD_CLIENT_SECRET_HERE";

        final String vmName1 = "myvm1";
        final String publicIpDnsLabel = generateRandomResourceName("pip", 20);
        final String uname = "juser";
        final String password = TestUtilities.createPassword();
        VirtualMachine virtualMachine = computeManager.virtualMachines()
                .define(vmName1)
                .withRegion(REGION)
                .withNewResourceGroup(RG_NAME)
                .withNewPrimaryNetwork("10.0.0.0/28")
                .withPrimaryPrivateIPAddressDynamic()
                .withNewPrimaryPublicIPAddress(publicIpDnsLabel)
                .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_18_04_LTS)
                .withRootUsername(uname)
                .withRootPassword(password)
                .withSize(VirtualMachineSizeTypes.fromString("Standard_D2a_v4"))    // ADE need 8GB
                .withOSDiskCaching(CachingTypes.READ_WRITE)
                .create();

        DiskVolumeEncryptionMonitor monitor1 = virtualMachine.diskEncryption().getMonitor();
        Assert.assertNotNull(monitor1);
        Assert.assertNotNull(monitor1.osDiskStatus());
        Assert.assertNotNull(monitor1.dataDiskStatus());
        Assert.assertEquals(EncryptionStatus.NOT_ENCRYPTED, monitor1.osDiskStatus());
        Assert.assertEquals(EncryptionStatus.NOT_ENCRYPTED, monitor1.dataDiskStatus());
        DiskVolumeEncryptionMonitor monitor2 = virtualMachine
                .diskEncryption()
                .enable(keyVaultId, aadClientId, aadSecret);
        Assert.assertNotNull(monitor2);
        Assert.assertNotNull(monitor2.osDiskStatus());
        Assert.assertNotNull(monitor2.dataDiskStatus());
        monitor1.refresh();
        Assert.assertTrue(monitor1.osDiskStatus().equals(monitor2.osDiskStatus()));
        Assert.assertTrue(monitor1.dataDiskStatus().equals(monitor2.dataDiskStatus()));
        monitor2.refresh();
        Assert.assertEquals(EncryptionStatus.ENCRYPTION_INPROGRESS, monitor2.osDiskStatus());
    }

    @Test
    public void canEncryptVirtualMachine() {
        // https://docs.microsoft.com/azure/virtual-machines/linux/disk-encryption-overview

        final String vmName1 = "myvm1";
        final String uname = "juser";
        VirtualMachine virtualMachine = computeManager.virtualMachines()
                .define(vmName1)
                .withRegion(REGION)
                .withNewResourceGroup(RG_NAME)
                .withNewPrimaryNetwork("10.0.0.0/28")
                .withPrimaryPrivateIPAddressDynamic()
                .withoutPrimaryPublicIPAddress()
                .withPopularLinuxImage(KnownLinuxVirtualMachineImage.UBUNTU_SERVER_18_04_LTS)
                .withRootUsername(uname)
                .withSsh(TestUtilities.createSshPublicKey())
                .withSize(VirtualMachineSizeTypes.fromString("Standard_D2a_v4"))    // ADE need 8GB
                .withOSDiskCaching(CachingTypes.READ_WRITE)
                .create();

        final String vaultName = generateRandomResourceName("vault", 20);
        Vault vault = keyVaultManager.vaults().define(vaultName)
                .withRegion(REGION)
                .withExistingResourceGroup(RG_NAME)
                .withEmptyAccessPolicy()
                .withDiskEncryptionEnabled()
                .create();
        final String vaultId = vault.id();
        final String vaultUri = vault.vaultUri();

        DiskVolumeEncryptionMonitor monitor1 = virtualMachine.diskEncryption().getMonitor();
        Assert.assertNotNull(monitor1);
        Assert.assertNotNull(monitor1.osDiskStatus());
        Assert.assertNotNull(monitor1.dataDiskStatus());
        Assert.assertEquals(EncryptionStatus.NOT_ENCRYPTED, monitor1.osDiskStatus());
        Assert.assertEquals(EncryptionStatus.NOT_ENCRYPTED, monitor1.dataDiskStatus());
        DiskVolumeEncryptionMonitor monitor2 = virtualMachine
                .diskEncryption()
                .enable(new LinuxVMDiskEncryptionConfiguration(vaultId, vaultUri));
        Assert.assertNotNull(monitor2);
        Assert.assertNotNull(monitor2.osDiskStatus());
        Assert.assertNotNull(monitor2.dataDiskStatus());
        monitor1.refresh();
        Assert.assertTrue(monitor1.osDiskStatus().equals(monitor2.osDiskStatus()));
        Assert.assertTrue(monitor1.dataDiskStatus().equals(monitor2.dataDiskStatus()));
        monitor2.refresh();
        Assert.assertNotEquals(EncryptionStatus.NOT_ENCRYPTED, monitor2.osDiskStatus());
    }
}
