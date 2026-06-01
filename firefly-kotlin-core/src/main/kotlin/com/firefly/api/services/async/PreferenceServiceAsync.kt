// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.preferences.Preference
import com.firefly.api.models.preferences.PreferenceCreateParams
import com.firefly.api.models.preferences.PreferenceListParams
import com.firefly.api.models.preferences.PreferenceListResponse
import com.firefly.api.models.preferences.PreferenceRetrieveParams
import com.firefly.api.models.preferences.PreferenceSingle
import com.firefly.api.models.preferences.PreferenceUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints can be used to manage the user&#039;s preferences, including some hidden ones.
 */
interface PreferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PreferenceServiceAsync

    /**
     * This endpoint creates a new preference. The name and data are free-format, and entirely up to
     * you. If the preference is not used in Firefly III itself it may not be configurable through
     * the user interface, but you can use this endpoint to persist custom data for your own app.
     */
    suspend fun create(
        params: PreferenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle

    /** @see create */
    suspend fun create(
        preference: Preference,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle =
        create(PreferenceCreateParams.builder().preference(preference).build(), requestOptions)

    /** Return a single preference and the value. */
    suspend fun retrieve(
        name: String,
        params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle = retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PreferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle

    /** @see retrieve */
    suspend fun retrieve(name: String, requestOptions: RequestOptions): PreferenceSingle =
        retrieve(name, PreferenceRetrieveParams.none(), requestOptions)

    /** Update a user's preference. */
    suspend fun update(
        name: String,
        params: PreferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle = update(params.toBuilder().name(name).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: PreferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle

    /** List all of the preferences of the user. */
    suspend fun list(
        params: PreferenceListParams = PreferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PreferenceListResponse =
        list(PreferenceListParams.none(), requestOptions)

    /**
     * A view of [PreferenceServiceAsync] that provides access to raw HTTP responses for each
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
        ): PreferenceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/preferences`, but is otherwise the same as
         * [PreferenceServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PreferenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            preference: Preference,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle> =
            create(PreferenceCreateParams.builder().preference(preference).build(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/preferences/{name}`, but is otherwise the same
         * as [PreferenceServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            name: String,
            params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PreferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceSingle> =
            retrieve(name, PreferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/preferences/{name}`, but is otherwise the same
         * as [PreferenceServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            name: String,
            params: PreferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle> =
            update(params.toBuilder().name(name).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: PreferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle>

        /**
         * Returns a raw HTTP response for `get /v1/preferences`, but is otherwise the same as
         * [PreferenceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PreferenceListParams = PreferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PreferenceListResponse> =
            list(PreferenceListParams.none(), requestOptions)
    }
}
