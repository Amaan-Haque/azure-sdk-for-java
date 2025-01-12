// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.fluent.models.StaticSitesWorkflowPreviewRequestProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request entity for previewing the Static Site workflow. */
@Fluent
public final class StaticSitesWorkflowPreviewRequest extends ProxyOnlyResource {
    /*
     * StaticSitesWorkflowPreviewRequest resource specific properties
     */
    @JsonProperty(value = "properties")
    private StaticSitesWorkflowPreviewRequestProperties innerProperties;

    /**
     * Get the innerProperties property: StaticSitesWorkflowPreviewRequest resource specific properties.
     *
     * @return the innerProperties value.
     */
    private StaticSitesWorkflowPreviewRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSitesWorkflowPreviewRequest withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the repositoryUrl property: URL for the repository of the static site.
     *
     * @return the repositoryUrl value.
     */
    public String repositoryUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().repositoryUrl();
    }

    /**
     * Set the repositoryUrl property: URL for the repository of the static site.
     *
     * @param repositoryUrl the repositoryUrl value to set.
     * @return the StaticSitesWorkflowPreviewRequest object itself.
     */
    public StaticSitesWorkflowPreviewRequest withRepositoryUrl(String repositoryUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSitesWorkflowPreviewRequestProperties();
        }
        this.innerProperties().withRepositoryUrl(repositoryUrl);
        return this;
    }

    /**
     * Get the branch property: The target branch in the repository.
     *
     * @return the branch value.
     */
    public String branch() {
        return this.innerProperties() == null ? null : this.innerProperties().branch();
    }

    /**
     * Set the branch property: The target branch in the repository.
     *
     * @param branch the branch value to set.
     * @return the StaticSitesWorkflowPreviewRequest object itself.
     */
    public StaticSitesWorkflowPreviewRequest withBranch(String branch) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSitesWorkflowPreviewRequestProperties();
        }
        this.innerProperties().withBranch(branch);
        return this;
    }

    /**
     * Get the buildProperties property: Build properties to configure on the repository.
     *
     * @return the buildProperties value.
     */
    public StaticSiteBuildProperties buildProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().buildProperties();
    }

    /**
     * Set the buildProperties property: Build properties to configure on the repository.
     *
     * @param buildProperties the buildProperties value to set.
     * @return the StaticSitesWorkflowPreviewRequest object itself.
     */
    public StaticSitesWorkflowPreviewRequest withBuildProperties(StaticSiteBuildProperties buildProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StaticSitesWorkflowPreviewRequestProperties();
        }
        this.innerProperties().withBuildProperties(buildProperties);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
