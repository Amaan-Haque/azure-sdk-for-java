// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.resourcemanager.peering.fluent.models.PeeringLocationInner;

/** An immutable client-side representation of PeeringLocation. */
public interface PeeringLocation {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: The kind of peering that the peering location supports.
     *
     * @return the kind value.
     */
    Kind kind();

    /**
     * Gets the direct property: The properties that define a direct peering location.
     *
     * @return the direct value.
     */
    PeeringLocationPropertiesDirect direct();

    /**
     * Gets the exchange property: The properties that define an exchange peering location.
     *
     * @return the exchange value.
     */
    PeeringLocationPropertiesExchange exchange();

    /**
     * Gets the peeringLocation property: The name of the peering location.
     *
     * @return the peeringLocation value.
     */
    String peeringLocation();

    /**
     * Gets the country property: The country in which the peering location exists.
     *
     * @return the country value.
     */
    String country();

    /**
     * Gets the azureRegion property: The Azure region associated with the peering location.
     *
     * @return the azureRegion value.
     */
    String azureRegion();

    /**
     * Gets the inner com.azure.resourcemanager.peering.fluent.models.PeeringLocationInner object.
     *
     * @return the inner object.
     */
    PeeringLocationInner innerModel();
}