package com.zerodev.smsforwarder.data.remote.api

import retrofit2.Response
import retrofit2.http.*

/**
 * Retrofit API service for SMS forwarding to external endpoints.
 * This service provides a generic HTTP client for forwarding SMS data to any API.
 */
interface ForwardingApiService {
    
    /**
     * Send a POST request to a dynamic URL with custom headers.
     * 
     * @param url The full URL to send the request to
     * @param headers Custom headers as a map
     * @param body The request body as a JSON string
     * @return HTTP response
     */
    @POST
    @Headers("Content-Type: application/json")
    suspend fun postToEndpoint(
        @Url url: String,
        @HeaderMap headers: Map<String, String>,
        @Body body: String
    ): Response<String>
    
    /**
     * Send a GET request to a dynamic URL with custom headers.
     * 
     * @param url The full URL to send the request to
     * @param headers Custom headers as a map
     * @param queryParams Query parameters as a map
     * @return HTTP response
     */
    @GET
    suspend fun getFromEndpoint(
        @Url url: String,
        @HeaderMap headers: Map<String, String>,
        @QueryMap queryParams: Map<String, String>
    ): Response<String>
    
    /**
     * Send a PUT request to a dynamic URL with custom headers.
     * 
     * @param url The full URL to send the request to
     * @param headers Custom headers as a map
     * @param body The request body as a JSON string
     * @return HTTP response
     */
    @PUT
    @Headers("Content-Type: application/json")
    suspend fun putToEndpoint(
        @Url url: String,
        @HeaderMap headers: Map<String, String>,
        @Body body: String
    ): Response<String>
    
    /**
     * Send a PATCH request to a dynamic URL with custom headers.
     * 
     * @param url The full URL to send the request to
     * @param headers Custom headers as a map
     * @param body The request body as a JSON string
     * @return HTTP response
     */
    @PATCH
    @Headers("Content-Type: application/json")
    suspend fun patchToEndpoint(
        @Url url: String,
        @HeaderMap headers: Map<String, String>,
        @Body body: String
    ): Response<String>
} 