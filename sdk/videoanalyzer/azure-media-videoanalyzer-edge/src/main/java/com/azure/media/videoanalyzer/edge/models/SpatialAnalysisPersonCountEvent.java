// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines a Spatial Analysis person count operation eventing configuration. */
@Fluent
public final class SpatialAnalysisPersonCountEvent extends SpatialAnalysisOperationEventBase {
    /*
     * The event trigger type.
     */
    @JsonProperty(value = "trigger")
    private SpatialAnalysisPersonCountEventTrigger trigger;

    /*
     * The event or interval output frequency.
     */
    @JsonProperty(value = "outputFrequency")
    private String outputFrequency;

    /**
     * Get the trigger property: The event trigger type.
     *
     * @return the trigger value.
     */
    public SpatialAnalysisPersonCountEventTrigger getTrigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: The event trigger type.
     *
     * @param trigger the trigger value to set.
     * @return the SpatialAnalysisPersonCountEvent object itself.
     */
    public SpatialAnalysisPersonCountEvent setTrigger(SpatialAnalysisPersonCountEventTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the outputFrequency property: The event or interval output frequency.
     *
     * @return the outputFrequency value.
     */
    public String getOutputFrequency() {
        return this.outputFrequency;
    }

    /**
     * Set the outputFrequency property: The event or interval output frequency.
     *
     * @param outputFrequency the outputFrequency value to set.
     * @return the SpatialAnalysisPersonCountEvent object itself.
     */
    public SpatialAnalysisPersonCountEvent setOutputFrequency(String outputFrequency) {
        this.outputFrequency = outputFrequency;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonCountEvent setThreshold(String threshold) {
        super.setThreshold(threshold);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonCountEvent setFocus(SpatialAnalysisOperationFocus focus) {
        super.setFocus(focus);
        return this;
    }
}