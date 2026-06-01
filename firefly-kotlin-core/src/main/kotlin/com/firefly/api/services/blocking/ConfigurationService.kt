// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.configuration.ConfigValueFilter
import com.firefly.api.models.configuration.Configuration
import com.firefly.api.models.configuration.ConfigurationRetrieveParams
import com.firefly.api.models.configuration.ConfigurationRetrieveValueParams
import com.firefly.api.models.configuration.ConfigurationSingle
import com.firefly.api.models.configuration.ConfigurationUpdateValueParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints allow you to manage and update the Firefly III configuration. You need to have
 * the &quot;owner&quot; role to update configuration.
 */
interface ConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigurationService

    /**
     * Returns all editable and not-editable configuration values for this Firefly III installation
     */
    fun retrieve(
        params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Configuration>

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): List<Configuration> =
        retrieve(ConfigurationRetrieveParams.none(), requestOptions)

    /** Returns one configuration variable for this Firefly III installation */
    fun retrieveValue(
        name: ConfigValueFilter,
        params: ConfigurationRetrieveValueParams = ConfigurationRetrieveValueParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationSingle = retrieveValue(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieveValue */
    fun retrieveValue(
        params: ConfigurationRetrieveValueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationSingle

    /** @see retrieveValue */
    fun retrieveValue(
        name: ConfigValueFilter,
        requestOptions: RequestOptions,
    ): ConfigurationSingle =
        retrieveValue(name, ConfigurationRetrieveValueParams.none(), requestOptions)

    /**
     * Set a single configuration value. Not all configuration values can be updated so the list of
     * accepted configuration variables is small.
     */
    fun updateValue(
        name: ConfigurationUpdateValueParams.Name,
        params: ConfigurationUpdateValueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationSingle = updateValue(params.toBuilder().name(name).build(), requestOptions)

    /** @see updateValue */
    fun updateValue(
        params: ConfigurationUpdateValueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationSingle

    /**
     * A view of [ConfigurationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigurationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/configuration`, but is otherwise the same as
         * [ConfigurationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Configuration>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<List<Configuration>> =
            retrieve(ConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/configuration/{name}`, but is otherwise the same
         * as [ConfigurationService.retrieveValue].
         */
        @MustBeClosed
        fun retrieveValue(
            name: ConfigValueFilter,
            params: ConfigurationRetrieveValueParams = ConfigurationRetrieveValueParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationSingle> =
            retrieveValue(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieveValue */
        @MustBeClosed
        fun retrieveValue(
            params: ConfigurationRetrieveValueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationSingle>

        /** @see retrieveValue */
        @MustBeClosed
        fun retrieveValue(
            name: ConfigValueFilter,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigurationSingle> =
            retrieveValue(name, ConfigurationRetrieveValueParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/configuration/{name}`, but is otherwise the same
         * as [ConfigurationService.updateValue].
         */
        @MustBeClosed
        fun updateValue(
            name: ConfigurationUpdateValueParams.Name,
            params: ConfigurationUpdateValueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationSingle> =
            updateValue(params.toBuilder().name(name).build(), requestOptions)

        /** @see updateValue */
        @MustBeClosed
        fun updateValue(
            params: ConfigurationUpdateValueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationSingle>
    }
}
