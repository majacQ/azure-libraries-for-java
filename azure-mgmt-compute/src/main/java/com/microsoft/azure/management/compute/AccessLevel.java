/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AccessLevel.
 */
public final class AccessLevel extends ExpandableStringEnum<AccessLevel> {
    /** Static value None for AccessLevel. */
    public static final AccessLevel NONE = fromString("None");

    /** Static value Read for AccessLevel. */
    public static final AccessLevel READ = fromString("Read");

    /** Static value Write for AccessLevel. */
    public static final AccessLevel WRITE = fromString("Write");

    /**
     * Creates or finds a AccessLevel from its string representation.
     * @param name a name to look for
     * @return the corresponding AccessLevel
     */
    @JsonCreator
    public static AccessLevel fromString(String name) {
        return fromString(name, AccessLevel.class);
    }

    /**
     * @return known AccessLevel values
     */
    public static Collection<AccessLevel> values() {
        return values(AccessLevel.class);
    }
}
