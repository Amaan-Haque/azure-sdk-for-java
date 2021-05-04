// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.resourcemanager.videoanalyzer.fluent.models.EdgeModuleProvisioningTokenInner;
import com.azure.resourcemanager.videoanalyzer.models.EdgeModuleProvisioningToken;
import java.time.OffsetDateTime;

public final class EdgeModuleProvisioningTokenImpl implements EdgeModuleProvisioningToken {
    private EdgeModuleProvisioningTokenInner innerObject;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    EdgeModuleProvisioningTokenImpl(
        EdgeModuleProvisioningTokenInner innerObject,
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OffsetDateTime expirationDate() {
        return this.innerModel().expirationDate();
    }

    public String token() {
        return this.innerModel().token();
    }

    public EdgeModuleProvisioningTokenInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }
}