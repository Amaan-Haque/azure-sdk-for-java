// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Transformations. */
public interface Transformations {
    /**
     * Gets details about the specified transformation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified transformation.
     */
    Transformation get(String resourceGroupName, String jobName, String transformationName);

    /**
     * Gets details about the specified transformation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param jobName The name of the streaming job.
     * @param transformationName The name of the transformation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified transformation.
     */
    Response<Transformation> getWithResponse(
        String resourceGroupName, String jobName, String transformationName, Context context);

    /**
     * Gets details about the specified transformation.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified transformation.
     */
    Transformation getById(String id);

    /**
     * Gets details about the specified transformation.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified transformation.
     */
    Response<Transformation> getByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Transformation resource.
     *
     * @param name resource name.
     * @return the first stage of the new Transformation definition.
     */
    Transformation.DefinitionStages.Blank define(String name);
}