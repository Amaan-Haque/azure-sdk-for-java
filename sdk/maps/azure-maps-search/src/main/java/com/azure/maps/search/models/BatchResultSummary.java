// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Summary of the results for the batch request. */
@Immutable
public final class BatchResultSummary {
    /*
     * Number of successful requests in the batch
     */
    @JsonProperty(value = "successfulRequests", access = JsonProperty.Access.WRITE_ONLY)
    private Integer successfulRequests;

    /*
     * Total number of requests in the batch
     */
    @JsonProperty(value = "totalRequests", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalRequests;

    /**
     * Get the successfulRequests property: Number of successful requests in the batch.
     *
     * @return the successfulRequests value.
     */
    public Integer getSuccessfulRequests() {
        return this.successfulRequests;
    }

    /**
     * Get the totalRequests property: Total number of requests in the batch.
     *
     * @return the totalRequests value.
     */
    public Integer getTotalRequests() {
        return this.totalRequests;
    }
}
