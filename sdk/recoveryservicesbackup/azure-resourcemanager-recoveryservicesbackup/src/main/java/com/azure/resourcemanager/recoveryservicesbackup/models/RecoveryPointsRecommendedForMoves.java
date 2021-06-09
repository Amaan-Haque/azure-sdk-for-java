// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of RecoveryPointsRecommendedForMoves. */
public interface RecoveryPointsRecommendedForMoves {
    /**
     * Lists the recovery points recommended for move to another tier.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName The fabricName parameter.
     * @param containerName The containerName parameter.
     * @param protectedItemName The protectedItemName parameter.
     * @param parameters List Recovery points Recommended for Move Request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RecoveryPoint resources.
     */
    PagedIterable<RecoveryPointResource> list(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        ListRecoveryPointsRecommendedForMoveRequest parameters);

    /**
     * Lists the recovery points recommended for move to another tier.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName The fabricName parameter.
     * @param containerName The containerName parameter.
     * @param protectedItemName The protectedItemName parameter.
     * @param parameters List Recovery points Recommended for Move Request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RecoveryPoint resources.
     */
    PagedIterable<RecoveryPointResource> list(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        ListRecoveryPointsRecommendedForMoveRequest parameters,
        Context context);
}