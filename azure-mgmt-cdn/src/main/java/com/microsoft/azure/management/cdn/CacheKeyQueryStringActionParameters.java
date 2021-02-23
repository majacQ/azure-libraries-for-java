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
 * Defines the parameters for the cache-key query string action.
 */
public class CacheKeyQueryStringActionParameters {
    /**
     * The odatatype property.
     */
    @JsonProperty(value = "@odata\\.type", required = true)
    private String odatatype;

    /**
     * Caching behavior for the requests. Possible values include: 'Include',
     * 'IncludeAll', 'Exclude', 'ExcludeAll'.
     */
    @JsonProperty(value = "queryStringBehavior", required = true)
    private QueryStringBehavior queryStringBehavior;

    /**
     * query parameters to include or exclude (comma separated).
     */
    @JsonProperty(value = "queryParameters")
    private String queryParameters;

    /**
     * Creates an instance of CacheKeyQueryStringActionParameters class.
     */
    public CacheKeyQueryStringActionParameters() {
        odatatype = "#Microsoft.Azure.Cdn.Models.DeliveryRuleCacheKeyQueryStringBehaviorActionParameters";
    }

    /**
     * Get the odatatype value.
     *
     * @return the odatatype value
     */
    public String odatatype() {
        return this.odatatype;
    }

    /**
     * Set the odatatype value.
     *
     * @param odatatype the odatatype value to set
     * @return the CacheKeyQueryStringActionParameters object itself.
     */
    public CacheKeyQueryStringActionParameters withOdatatype(String odatatype) {
        this.odatatype = odatatype;
        return this;
    }

    /**
     * Get caching behavior for the requests. Possible values include: 'Include', 'IncludeAll', 'Exclude', 'ExcludeAll'.
     *
     * @return the queryStringBehavior value
     */
    public QueryStringBehavior queryStringBehavior() {
        return this.queryStringBehavior;
    }

    /**
     * Set caching behavior for the requests. Possible values include: 'Include', 'IncludeAll', 'Exclude', 'ExcludeAll'.
     *
     * @param queryStringBehavior the queryStringBehavior value to set
     * @return the CacheKeyQueryStringActionParameters object itself.
     */
    public CacheKeyQueryStringActionParameters withQueryStringBehavior(QueryStringBehavior queryStringBehavior) {
        this.queryStringBehavior = queryStringBehavior;
        return this;
    }

    /**
     * Get query parameters to include or exclude (comma separated).
     *
     * @return the queryParameters value
     */
    public String queryParameters() {
        return this.queryParameters;
    }

    /**
     * Set query parameters to include or exclude (comma separated).
     *
     * @param queryParameters the queryParameters value to set
     * @return the CacheKeyQueryStringActionParameters object itself.
     */
    public CacheKeyQueryStringActionParameters withQueryParameters(String queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }

}