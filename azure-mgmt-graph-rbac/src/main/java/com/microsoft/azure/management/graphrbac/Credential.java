/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.graphrbac;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.azure.management.resources.fluentcore.arm.models.HasId;
import com.azure.management.resources.fluentcore.arm.models.HasName;
import com.azure.management.resources.fluentcore.model.Indexable;
import org.joda.time.DateTime;

/**
 * An immutable client-side representation of an Azure AD credential.
 */
@Fluent(ContainerName = "/Microsoft.Azure.Management.Graph.RBAC.Fluent")
public interface Credential extends
        Indexable,
        HasId,
        HasName {
    /**
     * @return start date.
     */
    DateTime startDate();

    /**
     * @return end date.
     */
    DateTime endDate();

    /**
     * @return key value.
     */
    String value();
}