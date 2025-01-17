/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.implementation;

import java.util.List;
import com.microsoft.azure.management.cdn.IpAddressGroup;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Edgenode is a global Point of Presence (POP) location used to deliver CDN
 * content to end users.
 */
@JsonFlatten
public class EdgeNodeInner extends ProxyResource {
    /**
     * List of ip address groups.
     */
    @JsonProperty(value = "properties.ipAddressGroups", required = true)
    private List<IpAddressGroup> ipAddressGroups;

    /**
     * Get list of ip address groups.
     *
     * @return the ipAddressGroups value
     */
    public List<IpAddressGroup> ipAddressGroups() {
        return this.ipAddressGroups;
    }

    /**
     * Set list of ip address groups.
     *
     * @param ipAddressGroups the ipAddressGroups value to set
     * @return the EdgeNodeInner object itself.
     */
    public EdgeNodeInner withIpAddressGroups(List<IpAddressGroup> ipAddressGroups) {
        this.ipAddressGroups = ipAddressGroups;
        return this;
    }

}
