// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DatabaseReadScale. */
public final class DatabaseReadScale extends ExpandableStringEnum<DatabaseReadScale> {
    /** Static value Enabled for DatabaseReadScale. */
    public static final DatabaseReadScale ENABLED = fromString("Enabled");

    /** Static value Disabled for DatabaseReadScale. */
    public static final DatabaseReadScale DISABLED = fromString("Disabled");

    /**
     * Creates or finds a DatabaseReadScale from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DatabaseReadScale.
     */
    @JsonCreator
    public static DatabaseReadScale fromString(String name) {
        return fromString(name, DatabaseReadScale.class);
    }

    /**
     * Gets known DatabaseReadScale values.
     *
     * @return known DatabaseReadScale values.
     */
    public static Collection<DatabaseReadScale> values() {
        return values(DatabaseReadScale.class);
    }
}
