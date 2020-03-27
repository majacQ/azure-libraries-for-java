// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.management.monitor.ErrorResponseException;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * EventCategories.
 */
public final class EventCategoriesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private EventCategoriesService service;

    /**
     * The service client containing this operation class.
     */
    private MonitorClientImpl client;

    /**
     * Initializes an instance of EventCategoriesInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    EventCategoriesInner(MonitorClientImpl client) {
        this.service = RestProxy.create(EventCategoriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientEventCategories
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientEventCategories")
    private interface EventCategoriesService {
        @Headers({ "Accept: application/json", "Content-Type: application/json" })
        @Get("/providers/microsoft.insights/eventcategories")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<SimpleResponse<EventCategoryCollectionInner>> list(@HostParam("$host") String host, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     * 
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LocalizableStringInner>> listSinglePageAsync() {
        final String apiVersion = "2015-04-01";
        return service.list(this.client.getHost(), apiVersion)
            .map(res -> new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                res.getValue().value(),
                null,
                null));
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     * 
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LocalizableStringInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync());
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     * 
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LocalizableStringInner> list() {
        return new PagedIterable<>(listAsync());
    }
}