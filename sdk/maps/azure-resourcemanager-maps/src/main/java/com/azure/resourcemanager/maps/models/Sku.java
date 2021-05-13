// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SKU of the Maps Account. */
@Fluent
public final class Sku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Sku.class);

    /*
     * The name of the SKU, in standard format (such as S0).
     */
    @JsonProperty(value = "name", required = true)
    private Name name;

    /*
     * Gets the sku tier. This is based on the SKU name.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /**
     * Get the name property: The name of the SKU, in standard format (such as S0).
     *
     * @return the name value.
     */
    public Name name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SKU, in standard format (such as S0).
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(Name name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Gets the sku tier. This is based on the SKU name.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Sku"));
        }
    }
}