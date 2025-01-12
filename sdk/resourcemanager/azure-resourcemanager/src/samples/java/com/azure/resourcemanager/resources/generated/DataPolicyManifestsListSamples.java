// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for DataPolicyManifests List. */
public final class DataPolicyManifestsListSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2020-09-01/examples/listDataPolicyManifests.json
     */
    /**
     * Sample code: List data policy manifests.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listDataPolicyManifests(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources().manager().policyClient().getDataPolicyManifests().list(null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2020-09-01/examples/listDataPolicyManifestsNamespaceFilter.json
     */
    /**
     * Sample code: List data policy manifests with namespace filter.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listDataPolicyManifestsWithNamespaceFilter(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .policyClient()
            .getDataPolicyManifests()
            .list("namespace eq 'Microsoft.KeyVault'", Context.NONE);
    }
}
