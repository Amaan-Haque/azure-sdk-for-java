// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Object tracker processor allows for continuous tracking of one of more objects over a finite sequence of video
 * frames. It must be used downstream of an object detector extension node, thus allowing for the extension to be
 * configured to to perform inferences on sparse frames through the use of the 'maximumSamplesPerSecond' sampling
 * property. The object tracker node will then track the detected objects over the frames in which the detector is not
 * invoked resulting on a smother tracking of detected objects across the continuum of video frames. The tracker will
 * stop tracking objects which are not subsequently detected by the upstream detector on the subsequent detections.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.ObjectTrackingProcessor")
@Fluent
public final class ObjectTrackingProcessor extends ProcessorNodeBase {
    /*
     * Object tracker accuracy: low, medium, high. Higher accuracy leads to
     * higher CPU consumption in average.
     */
    @JsonProperty(value = "accuracy")
    private ObjectTrackingAccuracy accuracy;

    /**
     * Creates an instance of ObjectTrackingProcessor class.
     *
     * @param name the name value to set.
     * @param inputs the inputs value to set.
     */
    @JsonCreator
    public ObjectTrackingProcessor(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "inputs", required = true) List<NodeInput> inputs) {
        super(name, inputs);
    }

    /**
     * Get the accuracy property: Object tracker accuracy: low, medium, high. Higher accuracy leads to higher CPU
     * consumption in average.
     *
     * @return the accuracy value.
     */
    public ObjectTrackingAccuracy getAccuracy() {
        return this.accuracy;
    }

    /**
     * Set the accuracy property: Object tracker accuracy: low, medium, high. Higher accuracy leads to higher CPU
     * consumption in average.
     *
     * @param accuracy the accuracy value to set.
     * @return the ObjectTrackingProcessor object itself.
     */
    public ObjectTrackingProcessor setAccuracy(ObjectTrackingAccuracy accuracy) {
        this.accuracy = accuracy;
        return this;
    }
}