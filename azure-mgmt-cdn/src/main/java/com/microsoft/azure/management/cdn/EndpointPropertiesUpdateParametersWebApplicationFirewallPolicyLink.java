/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the Web Application Firewall policy for the endpoint (if
 * applicable).
 */
public class EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink {
    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink object itself.
     */
    public EndpointPropertiesUpdateParametersWebApplicationFirewallPolicyLink withId(String id) {
        this.id = id;
        return this;
    }

}