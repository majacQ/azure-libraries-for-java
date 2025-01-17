/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management;

import com.microsoft.azure.management.containerservice.ContainerService;
import com.microsoft.azure.management.containerservice.ContainerServiceMasterProfileCount;
import com.microsoft.azure.management.containerservice.ContainerServiceOrchestratorTypes;
import com.microsoft.azure.management.containerservice.ContainerServiceVMSizeTypes;
import com.microsoft.azure.management.containerservice.ContainerServices;
import com.microsoft.azure.management.resources.core.TestUtilities;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import org.junit.Assert;

import java.util.ArrayList;

public class TestContainerService extends TestTemplate<ContainerService, ContainerServices> {

    @Override
    public ContainerService createResource(ContainerServices containerServices) throws Exception {
        final String sshKeyData = TestUtilities.createSshPublicKey();

        final String newName = "as" + this.testId;
        final String dnsPrefix = "dns" + newName;
        ContainerService resource = containerServices.define(newName)
                .withRegion(Region.US_EAST)
                .withNewResourceGroup()
                .withDcosOrchestration()
                .withLinux()
                .withRootUsername("testUserName")
                .withSshKey(sshKeyData)
                .withMasterNodeCount(ContainerServiceMasterProfileCount.MIN)
                .defineAgentPool("agentPool0" + newName)
                    .withVirtualMachineCount(1)
                    .withVirtualMachineSize(ContainerServiceVMSizeTypes.STANDARD_A1)
                    .withDnsPrefix("ap0" + dnsPrefix)
                    .attach()
                .withMasterDnsPrefix("mp1" + dnsPrefix)
                .withDiagnostics()
                .withTag("tag1", "value1")
                .create();
        Assert.assertNotNull("Container service not found.", resource.id());
        Assert.assertEquals(resource.region(), Region.US_EAST);
        Assert.assertEquals(resource.masterNodeCount(), ContainerServiceMasterProfileCount.MIN.count());
        Assert.assertEquals(resource.linuxRootUsername(), "testUserName");
        Assert.assertEquals(resource.agentPools().size(), 1);
        Assert.assertNotNull(resource.agentPools().get("agentPool0" + newName));
        Assert.assertEquals(resource.agentPools().get("agentPool0" + newName).count(), 1);
        Assert.assertEquals(resource.agentPools().get("agentPool0" + newName).dnsPrefix(), "ap0" + dnsPrefix);
        Assert.assertEquals(resource.agentPools().get("agentPool0" + newName).vmSize(), ContainerServiceVMSizeTypes.STANDARD_A1);
        Assert.assertEquals(resource.orchestratorType(), ContainerServiceOrchestratorTypes.DCOS);
        Assert.assertTrue(resource.isDiagnosticsEnabled());
        Assert.assertTrue(resource.tags().containsKey("tag1"));
        return resource;
    }

    @Override
    public ContainerService updateResource(ContainerService resource) throws Exception {
        // Modify existing container service
        resource =  resource.update()
                .withAgentVirtualMachineCount(5)
                .withTag("tag2", "value2")
                .withTag("tag3", "value3")
                .withoutTag("tag1")
                .apply();

        Assert.assertEquals(resource.agentPools().size(), 1);
        String agentPoolName = new ArrayList<>(resource.agentPools().keySet()).get(0);
        Assert.assertTrue("Agent pool count was not updated.", resource.agentPools().get(agentPoolName).count() == 5);
        Assert.assertTrue(resource.tags().containsKey("tag2"));
        Assert.assertTrue(!resource.tags().containsKey("tag1"));
        return resource;
    }

    @Override
    public void print(ContainerService resource) {
        System.out.println(new StringBuilder().append("Container Service: ").append(resource.id())
                .append("Name: ").append(resource.name())
                .append("\n\tResource group: ").append(resource.resourceGroupName())
                .append("\n\tRegion: ").append(resource.region())
                .append("\n\tTags: ").append(resource.tags())
                .toString());
    }
}