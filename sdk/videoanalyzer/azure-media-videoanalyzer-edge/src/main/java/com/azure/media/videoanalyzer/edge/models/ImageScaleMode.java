// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ImageScaleMode. */
public final class ImageScaleMode extends ExpandableStringEnum<ImageScaleMode> {
    /** Static value preserveAspectRatio for ImageScaleMode. */
    public static final ImageScaleMode PRESERVE_ASPECT_RATIO = fromString("preserveAspectRatio");

    /** Static value pad for ImageScaleMode. */
    public static final ImageScaleMode PAD = fromString("pad");

    /** Static value stretch for ImageScaleMode. */
    public static final ImageScaleMode STRETCH = fromString("stretch");

    /**
     * Creates or finds a ImageScaleMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImageScaleMode.
     */
    @JsonCreator
    public static ImageScaleMode fromString(String name) {
        return fromString(name, ImageScaleMode.class);
    }

    /** @return known ImageScaleMode values. */
    public static Collection<ImageScaleMode> values() {
        return values(ImageScaleMode.class);
    }
}