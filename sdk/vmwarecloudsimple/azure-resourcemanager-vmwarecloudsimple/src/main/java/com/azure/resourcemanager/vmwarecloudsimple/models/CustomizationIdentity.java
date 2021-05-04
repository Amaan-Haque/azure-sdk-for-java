// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CustomizationIdentity model. */
@Fluent
public class CustomizationIdentity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomizationIdentity.class);

    /*
     * Windows Text Identity. Prepared data
     */
    @JsonProperty(value = "data")
    private String data;

    /*
     * Virtual machine host name settings
     */
    @JsonProperty(value = "hostName")
    private CustomizationHostname hostname;

    /*
     * Identity type
     */
    @JsonProperty(value = "type")
    private CustomizationIdentityType type;

    /*
     * Windows Identity. User data customization
     */
    @JsonProperty(value = "userData")
    private CustomizationIdentityUserData userData;

    /**
     * Get the data property: Windows Text Identity. Prepared data.
     *
     * @return the data value.
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data property: Windows Text Identity. Prepared data.
     *
     * @param data the data value to set.
     * @return the CustomizationIdentity object itself.
     */
    public CustomizationIdentity withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get the hostname property: Virtual machine host name settings.
     *
     * @return the hostname value.
     */
    public CustomizationHostname hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: Virtual machine host name settings.
     *
     * @param hostname the hostname value to set.
     * @return the CustomizationIdentity object itself.
     */
    public CustomizationIdentity withHostname(CustomizationHostname hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the type property: Identity type.
     *
     * @return the type value.
     */
    public CustomizationIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: Identity type.
     *
     * @param type the type value to set.
     * @return the CustomizationIdentity object itself.
     */
    public CustomizationIdentity withType(CustomizationIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userData property: Windows Identity. User data customization.
     *
     * @return the userData value.
     */
    public CustomizationIdentityUserData userData() {
        return this.userData;
    }

    /**
     * Set the userData property: Windows Identity. User data customization.
     *
     * @param userData the userData value to set.
     * @return the CustomizationIdentity object itself.
     */
    public CustomizationIdentity withUserData(CustomizationIdentityUserData userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostname() != null) {
            hostname().validate();
        }
        if (userData() != null) {
            userData().validate();
        }
    }
}