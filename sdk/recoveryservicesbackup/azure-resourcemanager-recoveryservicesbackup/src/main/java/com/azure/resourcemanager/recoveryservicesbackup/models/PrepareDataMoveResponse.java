// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.VaultStorageConfigOperationResultResponseInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Prepare DataMove Response. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("PrepareDataMoveResponse")
@Fluent
public final class PrepareDataMoveResponse extends VaultStorageConfigOperationResultResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrepareDataMoveResponse.class);

    /*
     * Co-relationId for move operation
     */
    @JsonProperty(value = "correlationId")
    private String correlationId;

    /*
     * Source Vault Properties
     */
    @JsonProperty(value = "sourceVaultProperties")
    private Map<String, String> sourceVaultProperties;

    /**
     * Get the correlationId property: Co-relationId for move operation.
     *
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: Co-relationId for move operation.
     *
     * @param correlationId the correlationId value to set.
     * @return the PrepareDataMoveResponse object itself.
     */
    public PrepareDataMoveResponse withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the sourceVaultProperties property: Source Vault Properties.
     *
     * @return the sourceVaultProperties value.
     */
    public Map<String, String> sourceVaultProperties() {
        return this.sourceVaultProperties;
    }

    /**
     * Set the sourceVaultProperties property: Source Vault Properties.
     *
     * @param sourceVaultProperties the sourceVaultProperties value to set.
     * @return the PrepareDataMoveResponse object itself.
     */
    public PrepareDataMoveResponse withSourceVaultProperties(Map<String, String> sourceVaultProperties) {
        this.sourceVaultProperties = sourceVaultProperties;
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
    }
}