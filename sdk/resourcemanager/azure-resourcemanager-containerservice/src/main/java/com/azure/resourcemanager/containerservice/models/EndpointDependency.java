// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A domain name that AKS agent nodes are reaching at. */
@Fluent
public final class EndpointDependency {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EndpointDependency.class);

    /*
     * The domain name of the dependency.
     */
    @JsonProperty(value = "domainName")
    private String domainName;

    /*
     * The Ports and Protocols used when connecting to domainName.
     */
    @JsonProperty(value = "endpointDetails")
    private List<EndpointDetail> endpointDetails;

    /**
     * Get the domainName property: The domain name of the dependency.
     *
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: The domain name of the dependency.
     *
     * @param domainName the domainName value to set.
     * @return the EndpointDependency object itself.
     */
    public EndpointDependency withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Get the endpointDetails property: The Ports and Protocols used when connecting to domainName.
     *
     * @return the endpointDetails value.
     */
    public List<EndpointDetail> endpointDetails() {
        return this.endpointDetails;
    }

    /**
     * Set the endpointDetails property: The Ports and Protocols used when connecting to domainName.
     *
     * @param endpointDetails the endpointDetails value to set.
     * @return the EndpointDependency object itself.
     */
    public EndpointDependency withEndpointDetails(List<EndpointDetail> endpointDetails) {
        this.endpointDetails = endpointDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpointDetails() != null) {
            endpointDetails().forEach(e -> e.validate());
        }
    }
}