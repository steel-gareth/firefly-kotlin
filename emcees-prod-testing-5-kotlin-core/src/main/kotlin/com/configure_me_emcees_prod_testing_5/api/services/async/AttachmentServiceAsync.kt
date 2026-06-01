// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AttachmentArray
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentDownloadParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentListParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentSingle
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentUpdateParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentUploadParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints to manage the attachments of the authenticated user, including up- and downloading of
 * the files.
 */
interface AttachmentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AttachmentServiceAsync

    /**
     * Creates a new attachment. The data required can be submitted as a JSON body or as a list of
     * parameters. You cannot use this endpoint to upload the actual file data (see below). This
     * endpoint only creates the attachment object.
     */
    suspend fun create(
        params: AttachmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentSingle

    /**
     * Get a single attachment. This endpoint only returns the available metadata for the
     * attachment. Actual file data is handled in two other endpoints (see below).
     */
    suspend fun retrieve(
        id: String,
        params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentSingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): AttachmentSingle =
        retrieve(id, AttachmentRetrieveParams.none(), requestOptions)

    /**
     * Update the meta data for an existing attachment. This endpoint does not allow you to upload
     * or download data. For that, see below.
     */
    suspend fun update(
        id: String,
        params: AttachmentUpdateParams = AttachmentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: AttachmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentSingle

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): AttachmentSingle =
        update(id, AttachmentUpdateParams.none(), requestOptions)

    /** This endpoint lists all attachments. */
    suspend fun list(
        params: AttachmentListParams = AttachmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AttachmentArray =
        list(AttachmentListParams.none(), requestOptions)

    /** With this endpoint you delete an attachment, including any stored file data. */
    suspend fun delete(
        id: String,
        params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: AttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, AttachmentDeleteParams.none(), requestOptions)

    /**
     * This endpoint allows you to download the binary content of a transaction. It will be sent to
     * you as a download, using the content type "application/octet-stream" and content disposition
     * "attachment; filename=example.pdf".
     */
    @MustBeClosed
    suspend fun download(
        id: String,
        params: AttachmentDownloadParams = AttachmentDownloadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = download(params.toBuilder().id(id).build(), requestOptions)

    /** @see download */
    @MustBeClosed
    suspend fun download(
        params: AttachmentDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see download */
    @MustBeClosed
    suspend fun download(id: String, requestOptions: RequestOptions): HttpResponse =
        download(id, AttachmentDownloadParams.none(), requestOptions)

    /**
     * Use this endpoint to upload (and possible overwrite) the file contents of an attachment.
     * Simply put the entire file in the body as binary data.
     */
    suspend fun upload(
        id: String,
        body: String,
        params: AttachmentUploadParams = AttachmentUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = upload(params.toBuilder().id(id).body(body).build(), requestOptions)

    /** @see upload */
    suspend fun upload(
        params: AttachmentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see upload */
    suspend fun upload(id: String, body: String, requestOptions: RequestOptions) =
        upload(id, body, AttachmentUploadParams.none(), requestOptions)

    /**
     * A view of [AttachmentServiceAsync] that provides access to raw HTTP responses for each
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
        ): AttachmentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/attachments`, but is otherwise the same as
         * [AttachmentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AttachmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentSingle>

        /**
         * Returns a raw HTTP response for `get /v1/attachments/{id}`, but is otherwise the same as
         * [AttachmentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentSingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentSingle> =
            retrieve(id, AttachmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/attachments/{id}`, but is otherwise the same as
         * [AttachmentServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: AttachmentUpdateParams = AttachmentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: AttachmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentSingle>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentSingle> =
            update(id, AttachmentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/attachments`, but is otherwise the same as
         * [AttachmentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AttachmentListParams = AttachmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AttachmentArray> =
            list(AttachmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/attachments/{id}`, but is otherwise the same
         * as [AttachmentServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, AttachmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/attachments/{id}/download`, but is otherwise the
         * same as [AttachmentServiceAsync.download].
         */
        @MustBeClosed
        suspend fun download(
            id: String,
            params: AttachmentDownloadParams = AttachmentDownloadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = download(params.toBuilder().id(id).build(), requestOptions)

        /** @see download */
        @MustBeClosed
        suspend fun download(
            params: AttachmentDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see download */
        @MustBeClosed
        suspend fun download(id: String, requestOptions: RequestOptions): HttpResponse =
            download(id, AttachmentDownloadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/attachments/{id}/upload`, but is otherwise the
         * same as [AttachmentServiceAsync.upload].
         */
        @MustBeClosed
        suspend fun upload(
            id: String,
            body: String,
            params: AttachmentUploadParams = AttachmentUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = upload(params.toBuilder().id(id).body(body).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        suspend fun upload(
            params: AttachmentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see upload */
        @MustBeClosed
        suspend fun upload(id: String, body: String, requestOptions: RequestOptions): HttpResponse =
            upload(id, body, AttachmentUploadParams.none(), requestOptions)
    }
}
