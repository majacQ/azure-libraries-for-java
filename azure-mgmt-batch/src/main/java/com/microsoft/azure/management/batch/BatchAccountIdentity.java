/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The identity of the Batch account, if configured. This is only used when the
 * user specifies 'Microsoft.KeyVault' as their Batch account encryption
 * configuration.
 */
public class BatchAccountIdentity {
    /**
     * The principal id of the Batch account. This property will only be
     * provided for a system assigned identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /**
     * The tenant id associated with the Batch account. This property will only
     * be provided for a system assigned identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * The type of identity used for the Batch account. Possible values
     * include: 'SystemAssigned', 'UserAssigned', 'None'.
     */
    @JsonProperty(value = "type", required = true)
    private ResourceIdentityType type;

    /**
     * The list of user identities associated with the Batch account. The user
     * identity dictionary key references will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private Map<String, BatchAccountIdentityUserAssignedIdentitiesValue> userAssignedIdentities;

    /**
     * Get the principal id of the Batch account. This property will only be provided for a system assigned identity.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenant id associated with the Batch account. This property will only be provided for a system assigned identity.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type of identity used for the Batch account. Possible values include: 'SystemAssigned', 'UserAssigned', 'None'.
     *
     * @return the type value
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type of identity used for the Batch account. Possible values include: 'SystemAssigned', 'UserAssigned', 'None'.
     *
     * @param type the type value to set
     * @return the BatchAccountIdentity object itself.
     */
    public BatchAccountIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the list of user identities associated with the Batch account. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value
     */
    public Map<String, BatchAccountIdentityUserAssignedIdentitiesValue> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the list of user identities associated with the Batch account. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set
     * @return the BatchAccountIdentity object itself.
     */
    public BatchAccountIdentity withUserAssignedIdentities(Map<String, BatchAccountIdentityUserAssignedIdentitiesValue> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

}
