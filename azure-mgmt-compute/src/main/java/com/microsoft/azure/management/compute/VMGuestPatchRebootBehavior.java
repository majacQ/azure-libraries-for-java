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
 * Defines values for VMGuestPatchRebootBehavior.
 */
public final class VMGuestPatchRebootBehavior extends ExpandableStringEnum<VMGuestPatchRebootBehavior> {
    /** Static value Unknown for VMGuestPatchRebootBehavior. */
    public static final VMGuestPatchRebootBehavior UNKNOWN = fromString("Unknown");

    /** Static value NeverReboots for VMGuestPatchRebootBehavior. */
    public static final VMGuestPatchRebootBehavior NEVER_REBOOTS = fromString("NeverReboots");

    /** Static value AlwaysRequiresReboot for VMGuestPatchRebootBehavior. */
    public static final VMGuestPatchRebootBehavior ALWAYS_REQUIRES_REBOOT = fromString("AlwaysRequiresReboot");

    /** Static value CanRequestReboot for VMGuestPatchRebootBehavior. */
    public static final VMGuestPatchRebootBehavior CAN_REQUEST_REBOOT = fromString("CanRequestReboot");

    /**
     * Creates or finds a VMGuestPatchRebootBehavior from its string representation.
     * @param name a name to look for
     * @return the corresponding VMGuestPatchRebootBehavior
     */
    @JsonCreator
    public static VMGuestPatchRebootBehavior fromString(String name) {
        return fromString(name, VMGuestPatchRebootBehavior.class);
    }

    /**
     * @return known VMGuestPatchRebootBehavior values
     */
    public static Collection<VMGuestPatchRebootBehavior> values() {
        return values(VMGuestPatchRebootBehavior.class);
    }
}
