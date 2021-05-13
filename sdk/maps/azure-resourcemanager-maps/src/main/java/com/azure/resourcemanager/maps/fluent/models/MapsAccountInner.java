// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.maps.models.Kind;
import com.azure.resourcemanager.maps.models.MapsAccountProperties;
import com.azure.resourcemanager.maps.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** An Azure resource which represents access to a suite of Maps REST APIs. */
@Fluent
public final class MapsAccountInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MapsAccountInner.class);

    /*
     * The SKU of this account.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Get or Set Kind property.
     */
    @JsonProperty(value = "kind")
    private Kind kind;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The map account properties.
     */
    @JsonProperty(value = "properties")
    private MapsAccountProperties properties;

    /**
     * Get the sku property: The SKU of this account.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of this account.
     *
     * @param sku the sku value to set.
     * @return the MapsAccountInner object itself.
     */
    public MapsAccountInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: Get or Set Kind property.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Get or Set Kind property.
     *
     * @param kind the kind value to set.
     * @return the MapsAccountInner object itself.
     */
    public MapsAccountInner withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the properties property: The map account properties.
     *
     * @return the properties value.
     */
    public MapsAccountProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The map account properties.
     *
     * @param properties the properties value to set.
     * @return the MapsAccountInner object itself.
     */
    public MapsAccountInner withProperties(MapsAccountProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MapsAccountInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MapsAccountInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model MapsAccountInner"));
        } else {
            sku().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}