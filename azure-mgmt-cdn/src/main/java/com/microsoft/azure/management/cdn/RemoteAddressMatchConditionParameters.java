/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the parameters for RemoteAddress match conditions.
 */
public class RemoteAddressMatchConditionParameters {
    /**
     * The odatatype property.
     */
    @JsonProperty(value = "@odata\\.type", required = true)
    private String odatatype;

    /**
     * Describes operator to be matched. Possible values include: 'Any',
     * 'IPMatch', 'GeoMatch'.
     */
    @JsonProperty(value = "operator", required = true)
    private RemoteAddressOperator operator;

    /**
     * Describes if this is negate condition or not.
     */
    @JsonProperty(value = "negateCondition")
    private Boolean negateCondition;

    /**
     * Match values to match against. The operator will apply to each value in
     * here with OR semantics. If any of them match the variable with the given
     * operator this match condition is considered a match.
     */
    @JsonProperty(value = "matchValues")
    private List<String> matchValues;

    /**
     * List of transforms.
     */
    @JsonProperty(value = "transforms")
    private List<Transform> transforms;

    /**
     * Creates an instance of RemoteAddressMatchConditionParameters class.
     */
    public RemoteAddressMatchConditionParameters() {
        odatatype = "#Microsoft.Azure.Cdn.Models.DeliveryRuleRemoteAddressConditionParameters";
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
     * @return the RemoteAddressMatchConditionParameters object itself.
     */
    public RemoteAddressMatchConditionParameters withOdatatype(String odatatype) {
        this.odatatype = odatatype;
        return this;
    }

    /**
     * Get describes operator to be matched. Possible values include: 'Any', 'IPMatch', 'GeoMatch'.
     *
     * @return the operator value
     */
    public RemoteAddressOperator operator() {
        return this.operator;
    }

    /**
     * Set describes operator to be matched. Possible values include: 'Any', 'IPMatch', 'GeoMatch'.
     *
     * @param operator the operator value to set
     * @return the RemoteAddressMatchConditionParameters object itself.
     */
    public RemoteAddressMatchConditionParameters withOperator(RemoteAddressOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get describes if this is negate condition or not.
     *
     * @return the negateCondition value
     */
    public Boolean negateCondition() {
        return this.negateCondition;
    }

    /**
     * Set describes if this is negate condition or not.
     *
     * @param negateCondition the negateCondition value to set
     * @return the RemoteAddressMatchConditionParameters object itself.
     */
    public RemoteAddressMatchConditionParameters withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     *
     * @return the matchValues value
     */
    public List<String> matchValues() {
        return this.matchValues;
    }

    /**
     * Set match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     *
     * @param matchValues the matchValues value to set
     * @return the RemoteAddressMatchConditionParameters object itself.
     */
    public RemoteAddressMatchConditionParameters withMatchValues(List<String> matchValues) {
        this.matchValues = matchValues;
        return this;
    }

    /**
     * Get list of transforms.
     *
     * @return the transforms value
     */
    public List<Transform> transforms() {
        return this.transforms;
    }

    /**
     * Set list of transforms.
     *
     * @param transforms the transforms value to set
     * @return the RemoteAddressMatchConditionParameters object itself.
     */
    public RemoteAddressMatchConditionParameters withTransforms(List<Transform> transforms) {
        this.transforms = transforms;
        return this;
    }

}
