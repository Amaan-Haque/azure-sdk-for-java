// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.resourcemanager.peering.fluent.models.PeeringLocationInner;
import com.azure.resourcemanager.peering.models.Kind;
import com.azure.resourcemanager.peering.models.PeeringLocation;
import com.azure.resourcemanager.peering.models.PeeringLocationPropertiesDirect;
import com.azure.resourcemanager.peering.models.PeeringLocationPropertiesExchange;

public final class PeeringLocationImpl implements PeeringLocation {
    private PeeringLocationInner innerObject;

    private final com.azure.resourcemanager.peering.PeeringManager serviceManager;

    PeeringLocationImpl(
        PeeringLocationInner innerObject, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Kind kind() {
        return this.innerModel().kind();
    }

    public PeeringLocationPropertiesDirect direct() {
        return this.innerModel().direct();
    }

    public PeeringLocationPropertiesExchange exchange() {
        return this.innerModel().exchange();
    }

    public String peeringLocation() {
        return this.innerModel().peeringLocation();
    }

    public String country() {
        return this.innerModel().country();
    }

    public String azureRegion() {
        return this.innerModel().azureRegion();
    }

    public PeeringLocationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.peering.PeeringManager manager() {
        return this.serviceManager;
    }
}