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
 * The ContinentsResponseContinentsItem model.
 */
public class ContinentsResponseContinentsItem {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ContinentsResponseContinentsItem object itself.
     */
    public ContinentsResponseContinentsItem withId(String id) {
        this.id = id;
        return this;
    }

}
