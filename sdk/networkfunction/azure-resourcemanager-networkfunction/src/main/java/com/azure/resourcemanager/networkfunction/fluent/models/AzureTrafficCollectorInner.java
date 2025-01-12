// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.networkfunction.models.ProvisioningState;
import com.azure.resourcemanager.networkfunction.models.ResourceReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Azure Traffic Collector resource. */
@Fluent
public final class AzureTrafficCollectorInner extends Resource {
    /*
     * Properties of the Azure Traffic Collector.
     */
    @JsonProperty(value = "properties")
    private AzureTrafficCollectorPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Properties of the Azure Traffic Collector.
     *
     * @return the innerProperties value.
     */
    private AzureTrafficCollectorPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTrafficCollectorInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTrafficCollectorInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the collectorPolicies property: Collector Policies for Azure Traffic Collector.
     *
     * @return the collectorPolicies value.
     */
    public List<CollectorPolicyInner> collectorPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().collectorPolicies();
    }

    /**
     * Set the collectorPolicies property: Collector Policies for Azure Traffic Collector.
     *
     * @param collectorPolicies the collectorPolicies value to set.
     * @return the AzureTrafficCollectorInner object itself.
     */
    public AzureTrafficCollectorInner withCollectorPolicies(List<CollectorPolicyInner> collectorPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureTrafficCollectorPropertiesFormat();
        }
        this.innerProperties().withCollectorPolicies(collectorPolicies);
        return this;
    }

    /**
     * Get the virtualHub property: The virtualHub to which the Azure Traffic Collector belongs.
     *
     * @return the virtualHub value.
     */
    public ResourceReference virtualHub() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualHub();
    }

    /**
     * Set the virtualHub property: The virtualHub to which the Azure Traffic Collector belongs.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the AzureTrafficCollectorInner object itself.
     */
    public AzureTrafficCollectorInner withVirtualHub(ResourceReference virtualHub) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AzureTrafficCollectorPropertiesFormat();
        }
        this.innerProperties().withVirtualHub(virtualHub);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the application rule collection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
