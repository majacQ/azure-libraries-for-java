/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Specifies information about the gallery Image Version that you want to
 * update.
 */
@JsonFlatten
public class GalleryImageVersionUpdate extends UpdateResourceDefinition {
    /**
     * The publishingProfile property.
     */
    @JsonProperty(value = "properties.publishingProfile")
    private GalleryImageVersionPublishingProfile publishingProfile;

    /**
     * The current state of the gallery Image Version.
     * The provisioning state, which only appears in the response. Possible
     * values include: 'Creating', 'Updating', 'Failed', 'Succeeded',
     * 'Deleting', 'Migrating'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The storageProfile property.
     */
    @JsonProperty(value = "properties.storageProfile", required = true)
    private GalleryImageVersionStorageProfile storageProfile;

    /**
     * The replicationStatus property.
     */
    @JsonProperty(value = "properties.replicationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationStatus replicationStatus;

    /**
     * Get the publishingProfile value.
     *
     * @return the publishingProfile value
     */
    public GalleryImageVersionPublishingProfile publishingProfile() {
        return this.publishingProfile;
    }

    /**
     * Set the publishingProfile value.
     *
     * @param publishingProfile the publishingProfile value to set
     * @return the GalleryImageVersionUpdate object itself.
     */
    public GalleryImageVersionUpdate withPublishingProfile(GalleryImageVersionPublishingProfile publishingProfile) {
        this.publishingProfile = publishingProfile;
        return this;
    }

    /**
     * Get the provisioning state, which only appears in the response. Possible values include: 'Creating', 'Updating', 'Failed', 'Succeeded', 'Deleting', 'Migrating'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the storageProfile value.
     *
     * @return the storageProfile value
     */
    public GalleryImageVersionStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile value.
     *
     * @param storageProfile the storageProfile value to set
     * @return the GalleryImageVersionUpdate object itself.
     */
    public GalleryImageVersionUpdate withStorageProfile(GalleryImageVersionStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the replicationStatus value.
     *
     * @return the replicationStatus value
     */
    public ReplicationStatus replicationStatus() {
        return this.replicationStatus;
    }

}
