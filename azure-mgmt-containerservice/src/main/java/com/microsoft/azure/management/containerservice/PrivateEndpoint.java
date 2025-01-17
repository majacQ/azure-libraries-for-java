/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Private endpoint which a connection belongs to.
 */
public class PrivateEndpoint {
    /**
     * The resource Id for private endpoint.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the resource Id for private endpoint.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the resource Id for private endpoint.
     *
     * @param id the id value to set
     * @return the PrivateEndpoint object itself.
     */
    public PrivateEndpoint withId(String id) {
        this.id = id;
        return this;
    }

}
