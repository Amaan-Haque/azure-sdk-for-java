// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Disk configuration. */
@Fluent
public final class RecoveryPointDiskConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoveryPointDiskConfiguration.class);

    /*
     * Number of disks included in backup
     */
    @JsonProperty(value = "numberOfDisksIncludedInBackup")
    private Integer numberOfDisksIncludedInBackup;

    /*
     * Number of disks attached to the VM
     */
    @JsonProperty(value = "numberOfDisksAttachedToVm")
    private Integer numberOfDisksAttachedToVm;

    /*
     * Information of disks included in backup
     */
    @JsonProperty(value = "includedDiskList")
    private List<DiskInformation> includedDiskList;

    /*
     * Information of disks excluded from backup
     */
    @JsonProperty(value = "excludedDiskList")
    private List<DiskInformation> excludedDiskList;

    /**
     * Get the numberOfDisksIncludedInBackup property: Number of disks included in backup.
     *
     * @return the numberOfDisksIncludedInBackup value.
     */
    public Integer numberOfDisksIncludedInBackup() {
        return this.numberOfDisksIncludedInBackup;
    }

    /**
     * Set the numberOfDisksIncludedInBackup property: Number of disks included in backup.
     *
     * @param numberOfDisksIncludedInBackup the numberOfDisksIncludedInBackup value to set.
     * @return the RecoveryPointDiskConfiguration object itself.
     */
    public RecoveryPointDiskConfiguration withNumberOfDisksIncludedInBackup(Integer numberOfDisksIncludedInBackup) {
        this.numberOfDisksIncludedInBackup = numberOfDisksIncludedInBackup;
        return this;
    }

    /**
     * Get the numberOfDisksAttachedToVm property: Number of disks attached to the VM.
     *
     * @return the numberOfDisksAttachedToVm value.
     */
    public Integer numberOfDisksAttachedToVm() {
        return this.numberOfDisksAttachedToVm;
    }

    /**
     * Set the numberOfDisksAttachedToVm property: Number of disks attached to the VM.
     *
     * @param numberOfDisksAttachedToVm the numberOfDisksAttachedToVm value to set.
     * @return the RecoveryPointDiskConfiguration object itself.
     */
    public RecoveryPointDiskConfiguration withNumberOfDisksAttachedToVm(Integer numberOfDisksAttachedToVm) {
        this.numberOfDisksAttachedToVm = numberOfDisksAttachedToVm;
        return this;
    }

    /**
     * Get the includedDiskList property: Information of disks included in backup.
     *
     * @return the includedDiskList value.
     */
    public List<DiskInformation> includedDiskList() {
        return this.includedDiskList;
    }

    /**
     * Set the includedDiskList property: Information of disks included in backup.
     *
     * @param includedDiskList the includedDiskList value to set.
     * @return the RecoveryPointDiskConfiguration object itself.
     */
    public RecoveryPointDiskConfiguration withIncludedDiskList(List<DiskInformation> includedDiskList) {
        this.includedDiskList = includedDiskList;
        return this;
    }

    /**
     * Get the excludedDiskList property: Information of disks excluded from backup.
     *
     * @return the excludedDiskList value.
     */
    public List<DiskInformation> excludedDiskList() {
        return this.excludedDiskList;
    }

    /**
     * Set the excludedDiskList property: Information of disks excluded from backup.
     *
     * @param excludedDiskList the excludedDiskList value to set.
     * @return the RecoveryPointDiskConfiguration object itself.
     */
    public RecoveryPointDiskConfiguration withExcludedDiskList(List<DiskInformation> excludedDiskList) {
        this.excludedDiskList = excludedDiskList;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (includedDiskList() != null) {
            includedDiskList().forEach(e -> e.validate());
        }
        if (excludedDiskList() != null) {
            excludedDiskList().forEach(e -> e.validate());
        }
    }
}