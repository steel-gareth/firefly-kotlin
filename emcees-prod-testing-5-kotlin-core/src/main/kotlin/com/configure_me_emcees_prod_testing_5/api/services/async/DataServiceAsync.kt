// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.models.data.DataDestroyParams
import com.configure_me_emcees_prod_testing_5.api.models.data.DataPurgeParams
import com.configure_me_emcees_prod_testing_5.api.services.async.data.BulkServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.data.ExportServiceAsync
import com.google.errorprone.annotations.MustBeClosed

/** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
interface DataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DataServiceAsync

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    fun bulk(): BulkServiceAsync

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    fun export(): ExportServiceAsync

    /**
     * A call to this endpoint deletes the requested data type. Use it with care and always with
     * user permission. The demo user is incapable of using this endpoint.
     */
    suspend fun destroy(
        params: DataDestroyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A call to this endpoint purges all previously deleted data. Use it with care and always with
     * user permission. The demo user is incapable of using this endpoint.
     */
    suspend fun purge(
        params: DataPurgeParams = DataPurgeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see purge */
    suspend fun purge(requestOptions: RequestOptions) =
        purge(DataPurgeParams.none(), requestOptions)

    /** A view of [DataServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DataServiceAsync.WithRawResponse

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        fun bulk(): BulkServiceAsync.WithRawResponse

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        fun export(): ExportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /v1/data/destroy`, but is otherwise the same as
         * [DataServiceAsync.destroy].
         */
        @MustBeClosed
        suspend fun destroy(
            params: DataDestroyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /v1/data/purge`, but is otherwise the same as
         * [DataServiceAsync.purge].
         */
        @MustBeClosed
        suspend fun purge(
            params: DataPurgeParams = DataPurgeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see purge */
        @MustBeClosed
        suspend fun purge(requestOptions: RequestOptions): HttpResponse =
            purge(DataPurgeParams.none(), requestOptions)
    }
}
