// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.models.data.DataDestroyParams
import com.configure_me_emcees_prod_testing_5.api.models.data.DataPurgeParams
import com.configure_me_emcees_prod_testing_5.api.services.blocking.data.BulkService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.data.ExportService
import com.google.errorprone.annotations.MustBeClosed

/** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
interface DataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DataService

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    fun bulk(): BulkService

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    fun export(): ExportService

    /**
     * A call to this endpoint deletes the requested data type. Use it with care and always with
     * user permission. The demo user is incapable of using this endpoint.
     */
    fun destroy(params: DataDestroyParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * A call to this endpoint purges all previously deleted data. Use it with care and always with
     * user permission. The demo user is incapable of using this endpoint.
     */
    fun purge(
        params: DataPurgeParams = DataPurgeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see purge */
    fun purge(requestOptions: RequestOptions) = purge(DataPurgeParams.none(), requestOptions)

    /** A view of [DataService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DataService.WithRawResponse

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        fun bulk(): BulkService.WithRawResponse

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        fun export(): ExportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /v1/data/destroy`, but is otherwise the same as
         * [DataService.destroy].
         */
        @MustBeClosed
        fun destroy(
            params: DataDestroyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete /v1/data/purge`, but is otherwise the same as
         * [DataService.purge].
         */
        @MustBeClosed
        fun purge(
            params: DataPurgeParams = DataPurgeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see purge */
        @MustBeClosed
        fun purge(requestOptions: RequestOptions): HttpResponse =
            purge(DataPurgeParams.none(), requestOptions)
    }
}
