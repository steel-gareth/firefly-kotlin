// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.preferences.Preference
import com.configure_me_emcees_prod_testing_5.api.models.preferences.PreferenceCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.preferences.PreferenceListParams
import com.configure_me_emcees_prod_testing_5.api.models.preferences.PreferenceListResponse
import com.configure_me_emcees_prod_testing_5.api.models.preferences.PreferenceRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.preferences.PreferenceSingle
import com.configure_me_emcees_prod_testing_5.api.models.preferences.PreferenceUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * These endpoints can be used to manage the user&#039;s preferences, including some hidden ones.
 */
interface PreferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PreferenceService

    /**
     * This endpoint creates a new preference. The name and data are free-format, and entirely up to
     * you. If the preference is not used in Firefly III itself it may not be configurable through
     * the user interface, but you can use this endpoint to persist custom data for your own app.
     */
    fun create(
        params: PreferenceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle

    /** @see create */
    fun create(
        preference: Preference,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle =
        create(PreferenceCreateParams.builder().preference(preference).build(), requestOptions)

    /** Return a single preference and the value. */
    fun retrieve(
        name: String,
        params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle = retrieve(params.toBuilder().name(name).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PreferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle

    /** @see retrieve */
    fun retrieve(name: String, requestOptions: RequestOptions): PreferenceSingle =
        retrieve(name, PreferenceRetrieveParams.none(), requestOptions)

    /** Update a user's preference. */
    fun update(
        name: String,
        params: PreferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle = update(params.toBuilder().name(name).build(), requestOptions)

    /** @see update */
    fun update(
        params: PreferenceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceSingle

    /** List all of the preferences of the user. */
    fun list(
        params: PreferenceListParams = PreferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PreferenceListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): PreferenceListResponse =
        list(PreferenceListParams.none(), requestOptions)

    /** A view of [PreferenceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PreferenceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/preferences`, but is otherwise the same as
         * [PreferenceService.create].
         */
        @MustBeClosed
        fun create(
            params: PreferenceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle>

        /** @see create */
        @MustBeClosed
        fun create(
            preference: Preference,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle> =
            create(PreferenceCreateParams.builder().preference(preference).build(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/preferences/{name}`, but is otherwise the same
         * as [PreferenceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            name: String,
            params: PreferenceRetrieveParams = PreferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle> =
            retrieve(params.toBuilder().name(name).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PreferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            name: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PreferenceSingle> =
            retrieve(name, PreferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/preferences/{name}`, but is otherwise the same
         * as [PreferenceService.update].
         */
        @MustBeClosed
        fun update(
            name: String,
            params: PreferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle> =
            update(params.toBuilder().name(name).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: PreferenceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceSingle>

        /**
         * Returns a raw HTTP response for `get /v1/preferences`, but is otherwise the same as
         * [PreferenceService.list].
         */
        @MustBeClosed
        fun list(
            params: PreferenceListParams = PreferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PreferenceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PreferenceListResponse> =
            list(PreferenceListParams.none(), requestOptions)
    }
}
