// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Azure Storage workload-specific additional information for job. */
@Fluent
public final class AzureStorageJobExtendedInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureStorageJobExtendedInfo.class);

    /*
     * List of tasks for this job
     */
    @JsonProperty(value = "tasksList")
    private List<AzureStorageJobTaskDetails> tasksList;

    /*
     * Job properties.
     */
    @JsonProperty(value = "propertyBag")
    private Map<String, String> propertyBag;

    /*
     * Non localized error message on job execution.
     */
    @JsonProperty(value = "dynamicErrorMessage")
    private String dynamicErrorMessage;

    /**
     * Get the tasksList property: List of tasks for this job.
     *
     * @return the tasksList value.
     */
    public List<AzureStorageJobTaskDetails> tasksList() {
        return this.tasksList;
    }

    /**
     * Set the tasksList property: List of tasks for this job.
     *
     * @param tasksList the tasksList value to set.
     * @return the AzureStorageJobExtendedInfo object itself.
     */
    public AzureStorageJobExtendedInfo withTasksList(List<AzureStorageJobTaskDetails> tasksList) {
        this.tasksList = tasksList;
        return this;
    }

    /**
     * Get the propertyBag property: Job properties.
     *
     * @return the propertyBag value.
     */
    public Map<String, String> propertyBag() {
        return this.propertyBag;
    }

    /**
     * Set the propertyBag property: Job properties.
     *
     * @param propertyBag the propertyBag value to set.
     * @return the AzureStorageJobExtendedInfo object itself.
     */
    public AzureStorageJobExtendedInfo withPropertyBag(Map<String, String> propertyBag) {
        this.propertyBag = propertyBag;
        return this;
    }

    /**
     * Get the dynamicErrorMessage property: Non localized error message on job execution.
     *
     * @return the dynamicErrorMessage value.
     */
    public String dynamicErrorMessage() {
        return this.dynamicErrorMessage;
    }

    /**
     * Set the dynamicErrorMessage property: Non localized error message on job execution.
     *
     * @param dynamicErrorMessage the dynamicErrorMessage value to set.
     * @return the AzureStorageJobExtendedInfo object itself.
     */
    public AzureStorageJobExtendedInfo withDynamicErrorMessage(String dynamicErrorMessage) {
        this.dynamicErrorMessage = dynamicErrorMessage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tasksList() != null) {
            tasksList().forEach(e -> e.validate());
        }
    }
}