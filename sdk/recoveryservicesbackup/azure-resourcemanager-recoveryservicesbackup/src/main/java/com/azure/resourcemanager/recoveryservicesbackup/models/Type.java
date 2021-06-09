// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Type. */
public final class Type extends ExpandableStringEnum<Type> {
    /** Static value Invalid for Type. */
    public static final Type INVALID = fromString("Invalid");

    /** Static value BackupProtectedItemCountSummary for Type. */
    public static final Type BACKUP_PROTECTED_ITEM_COUNT_SUMMARY = fromString("BackupProtectedItemCountSummary");

    /** Static value BackupProtectionContainerCountSummary for Type. */
    public static final Type BACKUP_PROTECTION_CONTAINER_COUNT_SUMMARY =
        fromString("BackupProtectionContainerCountSummary");

    /**
     * Creates or finds a Type from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Type.
     */
    @JsonCreator
    public static Type fromString(String name) {
        return fromString(name, Type.class);
    }

    /** @return known Type values. */
    public static Collection<Type> values() {
        return values(Type.class);
    }
}