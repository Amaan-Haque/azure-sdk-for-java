// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for MonthOfYear. */
public enum MonthOfYear {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value January. */
    JANUARY("January"),

    /** Enum value February. */
    FEBRUARY("February"),

    /** Enum value March. */
    MARCH("March"),

    /** Enum value April. */
    APRIL("April"),

    /** Enum value May. */
    MAY("May"),

    /** Enum value June. */
    JUNE("June"),

    /** Enum value July. */
    JULY("July"),

    /** Enum value August. */
    AUGUST("August"),

    /** Enum value September. */
    SEPTEMBER("September"),

    /** Enum value October. */
    OCTOBER("October"),

    /** Enum value November. */
    NOVEMBER("November"),

    /** Enum value December. */
    DECEMBER("December");

    /** The actual serialized value for a MonthOfYear instance. */
    private final String value;

    MonthOfYear(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MonthOfYear instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MonthOfYear object, or null if unable to parse.
     */
    @JsonCreator
    public static MonthOfYear fromString(String value) {
        MonthOfYear[] items = MonthOfYear.values();
        for (MonthOfYear item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}