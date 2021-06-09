// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HealthStatus. */
public final class HealthStatus extends ExpandableStringEnum<HealthStatus> {
    /** Static value Passed for HealthStatus. */
    public static final HealthStatus PASSED = fromString("Passed");

    /** Static value ActionRequired for HealthStatus. */
    public static final HealthStatus ACTION_REQUIRED = fromString("ActionRequired");

    /** Static value ActionSuggested for HealthStatus. */
    public static final HealthStatus ACTION_SUGGESTED = fromString("ActionSuggested");

    /** Static value Invalid for HealthStatus. */
    public static final HealthStatus INVALID = fromString("Invalid");

    /**
     * Creates or finds a HealthStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HealthStatus.
     */
    @JsonCreator
    public static HealthStatus fromString(String name) {
        return fromString(name, HealthStatus.class);
    }

    /** @return known HealthStatus values. */
    public static Collection<HealthStatus> values() {
        return values(HealthStatus.class);
    }
}