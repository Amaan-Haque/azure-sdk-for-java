// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for AzureMapsManagementClient class. */
public interface AzureMapsManagementClient {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the AccountsClient object to access its operations.
     *
     * @return the AccountsClient object.
     */
    AccountsClient getAccounts();

    /**
     * Gets the MapsClient object to access its operations.
     *
     * @return the MapsClient object.
     */
    MapsClient getMaps();

    /**
     * Gets the CreatorsClient object to access its operations.
     *
     * @return the CreatorsClient object.
     */
    CreatorsClient getCreators();
}