/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DdosCustomPolicyTriggerSensitivityOverride.
 */
public final class DdosCustomPolicyTriggerSensitivityOverride extends ExpandableStringEnum<DdosCustomPolicyTriggerSensitivityOverride> {
    /** Static value Relaxed for DdosCustomPolicyTriggerSensitivityOverride. */
    public static final DdosCustomPolicyTriggerSensitivityOverride RELAXED = fromString("Relaxed");

    /** Static value Low for DdosCustomPolicyTriggerSensitivityOverride. */
    public static final DdosCustomPolicyTriggerSensitivityOverride LOW = fromString("Low");

    /** Static value Default for DdosCustomPolicyTriggerSensitivityOverride. */
    public static final DdosCustomPolicyTriggerSensitivityOverride DEFAULT = fromString("Default");

    /** Static value High for DdosCustomPolicyTriggerSensitivityOverride. */
    public static final DdosCustomPolicyTriggerSensitivityOverride HIGH = fromString("High");

    /**
     * Creates or finds a DdosCustomPolicyTriggerSensitivityOverride from its string representation.
     * @param name a name to look for
     * @return the corresponding DdosCustomPolicyTriggerSensitivityOverride
     */
    @JsonCreator
    public static DdosCustomPolicyTriggerSensitivityOverride fromString(String name) {
        return fromString(name, DdosCustomPolicyTriggerSensitivityOverride.class);
    }

    /**
     * @return known DdosCustomPolicyTriggerSensitivityOverride values
     */
    public static Collection<DdosCustomPolicyTriggerSensitivityOverride> values() {
        return values(DdosCustomPolicyTriggerSensitivityOverride.class);
    }
}
