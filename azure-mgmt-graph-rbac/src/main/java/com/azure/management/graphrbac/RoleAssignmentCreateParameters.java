// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The RoleAssignmentCreateParameters model.
 */
@Fluent
public final class RoleAssignmentCreateParameters {
    /*
     * The role definition ID used in the role assignment.
     */
    @JsonProperty(value = "properties.roleDefinitionId", required = true)
    private String roleDefinitionId;

    /*
     * The principal ID assigned to the role. This maps to the ID inside the
     * Active Directory. It can point to a user, service principal, or security
     * group.
     */
    @JsonProperty(value = "properties.principalId", required = true)
    private String principalId;

    /*
     * The delegation flag used for creating a role assignment
     */
    @JsonProperty(value = "properties.canDelegate")
    private Boolean canDelegate;

    /**
     * Get the roleDefinitionId property: The role definition ID used in the
     * role assignment.
     * 
     * @return the roleDefinitionId value.
     */
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The role definition ID used in the
     * role assignment.
     * 
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters setRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId property: The principal ID assigned to the role.
     * This maps to the ID inside the Active Directory. It can point to a user,
     * service principal, or security group.
     * 
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID assigned to the role.
     * This maps to the ID inside the Active Directory. It can point to a user,
     * service principal, or security group.
     * 
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the canDelegate property: The delegation flag used for creating a
     * role assignment.
     * 
     * @return the canDelegate value.
     */
    public Boolean isCanDelegate() {
        return this.canDelegate;
    }

    /**
     * Set the canDelegate property: The delegation flag used for creating a
     * role assignment.
     * 
     * @param canDelegate the canDelegate value to set.
     * @return the RoleAssignmentCreateParameters object itself.
     */
    public RoleAssignmentCreateParameters setCanDelegate(Boolean canDelegate) {
        this.canDelegate = canDelegate;
        return this;
    }
}