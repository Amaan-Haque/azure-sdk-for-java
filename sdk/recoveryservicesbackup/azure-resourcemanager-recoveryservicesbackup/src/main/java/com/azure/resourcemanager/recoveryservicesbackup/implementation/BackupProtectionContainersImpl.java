// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.BackupProtectionContainersClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectionContainerResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupProtectionContainers;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionContainerResource;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class BackupProtectionContainersImpl implements BackupProtectionContainers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackupProtectionContainersImpl.class);

    private final BackupProtectionContainersClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public BackupProtectionContainersImpl(
        BackupProtectionContainersClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProtectionContainerResource> list(String vaultName, String resourceGroupName) {
        PagedIterable<ProtectionContainerResourceInner> inner = this.serviceClient().list(vaultName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ProtectionContainerResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ProtectionContainerResource> list(
        String vaultName, String resourceGroupName, String filter, Context context) {
        PagedIterable<ProtectionContainerResourceInner> inner =
            this.serviceClient().list(vaultName, resourceGroupName, filter, context);
        return Utils.mapPage(inner, inner1 -> new ProtectionContainerResourceImpl(inner1, this.manager()));
    }

    private BackupProtectionContainersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}