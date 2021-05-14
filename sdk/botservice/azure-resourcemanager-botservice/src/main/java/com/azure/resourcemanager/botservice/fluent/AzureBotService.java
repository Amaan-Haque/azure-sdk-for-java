// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for AzureBotService class. */
public interface AzureBotService {
    /**
     * Gets Azure Subscription ID.
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
     * Gets the BotsClient object to access its operations.
     *
     * @return the BotsClient object.
     */
    BotsClient getBots();

    /**
     * Gets the ChannelsClient object to access its operations.
     *
     * @return the ChannelsClient object.
     */
    ChannelsClient getChannels();

    /**
     * Gets the DirectLinesClient object to access its operations.
     *
     * @return the DirectLinesClient object.
     */
    DirectLinesClient getDirectLines();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the BotConnectionsClient object to access its operations.
     *
     * @return the BotConnectionsClient object.
     */
    BotConnectionsClient getBotConnections();

    /**
     * Gets the HostSettingsClient object to access its operations.
     *
     * @return the HostSettingsClient object.
     */
    HostSettingsClient getHostSettings();
}