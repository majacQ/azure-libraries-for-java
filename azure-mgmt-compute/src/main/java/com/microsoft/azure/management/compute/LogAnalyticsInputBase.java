/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Api input base class for LogAnalytics Api.
 */
public class LogAnalyticsInputBase {
    /**
     * SAS Uri of the logging blob container to which LogAnalytics Api writes
     * output logs to.
     */
    @JsonProperty(value = "blobContainerSasUri", required = true)
    private String blobContainerSasUri;

    /**
     * From time of the query.
     */
    @JsonProperty(value = "fromTime", required = true)
    private DateTime fromTime;

    /**
     * To time of the query.
     */
    @JsonProperty(value = "toTime", required = true)
    private DateTime toTime;

    /**
     * Group query result by Throttle Policy applied.
     */
    @JsonProperty(value = "groupByThrottlePolicy")
    private Boolean groupByThrottlePolicy;

    /**
     * Group query result by Operation Name.
     */
    @JsonProperty(value = "groupByOperationName")
    private Boolean groupByOperationName;

    /**
     * Group query result by Resource Name.
     */
    @JsonProperty(value = "groupByResourceName")
    private Boolean groupByResourceName;

    /**
     * Group query result by Client Application ID.
     */
    @JsonProperty(value = "groupByClientApplicationId")
    private Boolean groupByClientApplicationId;

    /**
     * Group query result by User Agent.
     */
    @JsonProperty(value = "groupByUserAgent")
    private Boolean groupByUserAgent;

    /**
     * Get sAS Uri of the logging blob container to which LogAnalytics Api writes output logs to.
     *
     * @return the blobContainerSasUri value
     */
    public String blobContainerSasUri() {
        return this.blobContainerSasUri;
    }

    /**
     * Set sAS Uri of the logging blob container to which LogAnalytics Api writes output logs to.
     *
     * @param blobContainerSasUri the blobContainerSasUri value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withBlobContainerSasUri(String blobContainerSasUri) {
        this.blobContainerSasUri = blobContainerSasUri;
        return this;
    }

    /**
     * Get from time of the query.
     *
     * @return the fromTime value
     */
    public DateTime fromTime() {
        return this.fromTime;
    }

    /**
     * Set from time of the query.
     *
     * @param fromTime the fromTime value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withFromTime(DateTime fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    /**
     * Get to time of the query.
     *
     * @return the toTime value
     */
    public DateTime toTime() {
        return this.toTime;
    }

    /**
     * Set to time of the query.
     *
     * @param toTime the toTime value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withToTime(DateTime toTime) {
        this.toTime = toTime;
        return this;
    }

    /**
     * Get group query result by Throttle Policy applied.
     *
     * @return the groupByThrottlePolicy value
     */
    public Boolean groupByThrottlePolicy() {
        return this.groupByThrottlePolicy;
    }

    /**
     * Set group query result by Throttle Policy applied.
     *
     * @param groupByThrottlePolicy the groupByThrottlePolicy value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByThrottlePolicy(Boolean groupByThrottlePolicy) {
        this.groupByThrottlePolicy = groupByThrottlePolicy;
        return this;
    }

    /**
     * Get group query result by Operation Name.
     *
     * @return the groupByOperationName value
     */
    public Boolean groupByOperationName() {
        return this.groupByOperationName;
    }

    /**
     * Set group query result by Operation Name.
     *
     * @param groupByOperationName the groupByOperationName value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByOperationName(Boolean groupByOperationName) {
        this.groupByOperationName = groupByOperationName;
        return this;
    }

    /**
     * Get group query result by Resource Name.
     *
     * @return the groupByResourceName value
     */
    public Boolean groupByResourceName() {
        return this.groupByResourceName;
    }

    /**
     * Set group query result by Resource Name.
     *
     * @param groupByResourceName the groupByResourceName value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByResourceName(Boolean groupByResourceName) {
        this.groupByResourceName = groupByResourceName;
        return this;
    }

    /**
     * Get group query result by Client Application ID.
     *
     * @return the groupByClientApplicationId value
     */
    public Boolean groupByClientApplicationId() {
        return this.groupByClientApplicationId;
    }

    /**
     * Set group query result by Client Application ID.
     *
     * @param groupByClientApplicationId the groupByClientApplicationId value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByClientApplicationId(Boolean groupByClientApplicationId) {
        this.groupByClientApplicationId = groupByClientApplicationId;
        return this;
    }

    /**
     * Get group query result by User Agent.
     *
     * @return the groupByUserAgent value
     */
    public Boolean groupByUserAgent() {
        return this.groupByUserAgent;
    }

    /**
     * Set group query result by User Agent.
     *
     * @param groupByUserAgent the groupByUserAgent value to set
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByUserAgent(Boolean groupByUserAgent) {
        this.groupByUserAgent = groupByUserAgent;
        return this;
    }

}
