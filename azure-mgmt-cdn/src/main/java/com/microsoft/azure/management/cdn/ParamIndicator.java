/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ParamIndicator.
 */
public final class ParamIndicator extends ExpandableStringEnum<ParamIndicator> {
    /** Static value Expires for ParamIndicator. */
    public static final ParamIndicator EXPIRES = fromString("Expires");

    /** Static value KeyId for ParamIndicator. */
    public static final ParamIndicator KEY_ID = fromString("KeyId");

    /** Static value Signature for ParamIndicator. */
    public static final ParamIndicator SIGNATURE = fromString("Signature");

    /**
     * Creates or finds a ParamIndicator from its string representation.
     * @param name a name to look for
     * @return the corresponding ParamIndicator
     */
    @JsonCreator
    public static ParamIndicator fromString(String name) {
        return fromString(name, ParamIndicator.class);
    }

    /**
     * @return known ParamIndicator values
     */
    public static Collection<ParamIndicator> values() {
        return values(ParamIndicator.class);
    }
}