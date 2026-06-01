// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.configuration.ConfigValueFilter
import com.configure_me_emcees_prod_testing_5.api.models.configuration.Configuration
import com.configure_me_emcees_prod_testing_5.api.models.configuration.ConfigurationRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.configuration.ConfigurationRetrieveValueParams
import com.configure_me_emcees_prod_testing_5.api.models.configuration.ConfigurationSingle
import com.configure_me_emcees_prod_testing_5.api.models.configuration.ConfigurationUpdateValueParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints allow you to manage and update the Firefly III configuration. You need to have
 * the &quot;owner&quot; role to update configuration.
 */
interface ConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigurationServiceAsync

    /**
     * Returns all editable and not-editable configuration values for this Firefly III installation
     */
    suspend fun retrieve(
        params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Configuration>

    /** @see retrieve */
    suspend fun retrieve(requestOptions: RequestOptions): List<Configuration> =
        retrieve(ConfigurationRetrieveParams.none(), requestOptions)

    /** Returns one configuration variable for this Firefly III installation */
    suspend fun retrieveValue(
        name: ConfigValueFilter,
        params: ConfigurationRetrieveValueParams = ConfigurationRetrieveValueParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationSingle = retrieveValue(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieveValue */
    suspend fun retrieveValue(
        params: ConfigurationRetrieveValueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationSingle

    /** @see retrieveValue */
    suspend fun retrieveValue(
        name: ConfigValueFilter,
        requestOptions: RequestOptions,
    ): ConfigurationSingle =
        retrieveValue(name, ConfigurationRetrieveValueParams.none(), requestOptions)

    /**
     * Set a single configuration value. Not all configuration values can be updated so the list of
     * accepted configuration variables is small.
     */
    suspend fun updateValue(
        name: ConfigurationUpdateValueParams.Name,
        params: ConfigurationUpdateValueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationSingle = updateValue(params.toBuilder().name(name).build(), requestOptions)

    /** @see updateValue */
    suspend fun updateValue(
        params: ConfigurationUpdateValueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationSingle

    /**
     * A view of [ConfigurationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/configuration`, but is otherwise the same as
         * [ConfigurationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: ConfigurationRetrieveParams = ConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Configuration>>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(requestOptions: RequestOptions): HttpResponseFor<List<Configuration>> =
            retrieve(ConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/configuration/{name}`, but is otherwise the same
         * as [ConfigurationServiceAsync.retrieveValue].
         */
        @MustBeClosed
        suspend fun retrieveValue(
            name: ConfigValueFilter,
            params: ConfigurationRetrieveValueParams = ConfigurationRetrieveValueParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationSingle> =
            retrieveValue(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieveValue */
        @MustBeClosed
        suspend fun retrieveValue(
            params: ConfigurationRetrieveValueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationSingle>

        /** @see retrieveValue */
        @MustBeClosed
        suspend fun retrieveValue(
            name: ConfigValueFilter,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigurationSingle> =
            retrieveValue(name, ConfigurationRetrieveValueParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/configuration/{name}`, but is otherwise the same
         * as [ConfigurationServiceAsync.updateValue].
         */
        @MustBeClosed
        suspend fun updateValue(
            name: ConfigurationUpdateValueParams.Name,
            params: ConfigurationUpdateValueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationSingle> =
            updateValue(params.toBuilder().name(name).build(), requestOptions)

        /** @see updateValue */
        @MustBeClosed
        suspend fun updateValue(
            params: ConfigurationUpdateValueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationSingle>
    }
}
