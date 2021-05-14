// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of HostSettings. */
public interface HostSettings {
    /**
     * Get per subscription settings needed to host bot in compute resource such as Azure App Service.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return per subscription settings needed to host bot in compute resource such as Azure App Service.
     */
    HostSettingsResponse get();

    /**
     * Get per subscription settings needed to host bot in compute resource such as Azure App Service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return per subscription settings needed to host bot in compute resource such as Azure App Service.
     */
    Response<HostSettingsResponse> getWithResponse(Context context);
}