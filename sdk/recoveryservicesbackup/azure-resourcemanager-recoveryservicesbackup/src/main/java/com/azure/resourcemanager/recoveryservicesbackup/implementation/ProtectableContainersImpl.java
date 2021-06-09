// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectableContainersClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectableContainerResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectableContainerResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectableContainers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProtectableContainersImpl implements ProtectableContainers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtectableContainersImpl.class);

    private final ProtectableContainersClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public ProtectableContainersImpl(
        ProtectableContainersClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProtectableContainerResource> list(
        String vaultName, String resourceGroupName, String fabricName) {
        PagedIterable<ProtectableContainerResourceInner> inner =
            this.serviceClient().list(vaultName, resourceGroupName, fabricName);
        return Utils.mapPage(inner, inner1 -> new ProtectableContainerResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ProtectableContainerResource> list(
        String vaultName, String resourceGroupName, String fabricName, String filter, Context context) {
        PagedIterable<ProtectableContainerResourceInner> inner =
            this.serviceClient().list(vaultName, resourceGroupName, fabricName, filter, context);
        return Utils.mapPage(inner, inner1 -> new ProtectableContainerResourceImpl(inner1, this.manager()));
    }

    private ProtectableContainersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}