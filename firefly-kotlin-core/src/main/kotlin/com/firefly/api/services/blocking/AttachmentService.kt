// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.AttachmentArray
import com.firefly.api.models.attachments.AttachmentCreateParams
import com.firefly.api.models.attachments.AttachmentDeleteParams
import com.firefly.api.models.attachments.AttachmentDownloadParams
import com.firefly.api.models.attachments.AttachmentListParams
import com.firefly.api.models.attachments.AttachmentRetrieveParams
import com.firefly.api.models.attachments.AttachmentSingle
import com.firefly.api.models.attachments.AttachmentUpdateParams
import com.firefly.api.models.attachments.AttachmentUploadParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints to manage the attachments of the authenticated user, including up- and downloading of
 * the files.
 */
interface AttachmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AttachmentService

    /**
     * Creates a new attachment. The data required can be submitted as a JSON body or as a list of
     * parameters. You cannot use this endpoint to upload the actual file data (see below). This
     * endpoint only creates the attachment object.
     */
    fun create(
        params: AttachmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentSingle

    /**
     * Get a single attachment. This endpoint only returns the available metadata for the
     * attachment. Actual file data is handled in two other endpoints (see below).
     */
    fun retrieve(
        id: String,
        params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentSingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: AttachmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentSingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AttachmentSingle =
        retrieve(id, AttachmentRetrieveParams.none(), requestOptions)

    /**
     * Update the meta data for an existing attachment. This endpoint does not allow you to upload
     * or download data. For that, see below.
     */
    fun update(
        id: String,
        params: AttachmentUpdateParams = AttachmentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentSingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: AttachmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentSingle

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): AttachmentSingle =
        update(id, AttachmentUpdateParams.none(), requestOptions)

    /** This endpoint lists all attachments. */
    fun list(
        params: AttachmentListParams = AttachmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see list */
    fun list(requestOptions: RequestOptions): AttachmentArray =
        list(AttachmentListParams.none(), requestOptions)

    /** With this endpoint you delete an attachment, including any stored file data. */
    fun delete(
        id: String,
        params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: AttachmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, AttachmentDeleteParams.none(), requestOptions)

    /**
     * This endpoint allows you to download the binary content of a transaction. It will be sent to
     * you as a download, using the content type "application/octet-stream" and content disposition
     * "attachment; filename=example.pdf".
     */
    @MustBeClosed
    fun download(
        id: String,
        params: AttachmentDownloadParams = AttachmentDownloadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = download(params.toBuilder().id(id).build(), requestOptions)

    /** @see download */
    @MustBeClosed
    fun download(
        params: AttachmentDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see download */
    @MustBeClosed
    fun download(id: String, requestOptions: RequestOptions): HttpResponse =
        download(id, AttachmentDownloadParams.none(), requestOptions)

    /**
     * Use this endpoint to upload (and possible overwrite) the file contents of an attachment.
     * Simply put the entire file in the body as binary data.
     */
    fun upload(
        id: String,
        body: String,
        params: AttachmentUploadParams = AttachmentUploadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = upload(params.toBuilder().id(id).body(body).build(), requestOptions)

    /** @see upload */
    fun upload(
        params: AttachmentUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see upload */
    fun upload(id: String, body: String, requestOptions: RequestOptions) =
        upload(id, body, AttachmentUploadParams.none(), requestOptions)

    /** A view of [AttachmentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AttachmentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/attachments`, but is otherwise the same as
         * [AttachmentService.create].
         */
        @MustBeClosed
        fun create(
            params: AttachmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentSingle>

        /**
         * Returns a raw HTTP response for `get /v1/attachments/{id}`, but is otherwise the same as
         * [AttachmentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AttachmentRetrieveParams = AttachmentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentSingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AttachmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentSingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentSingle> =
            retrieve(id, AttachmentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/attachments/{id}`, but is otherwise the same as
         * [AttachmentService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: AttachmentUpdateParams = AttachmentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentSingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: AttachmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentSingle>

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<AttachmentSingle> =
            update(id, AttachmentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/attachments`, but is otherwise the same as
         * [AttachmentService.list].
         */
        @MustBeClosed
        fun list(
            params: AttachmentListParams = AttachmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AttachmentArray> =
            list(AttachmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/attachments/{id}`, but is otherwise the same
         * as [AttachmentService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: AttachmentDeleteParams = AttachmentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AttachmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, AttachmentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/attachments/{id}/download`, but is otherwise the
         * same as [AttachmentService.download].
         */
        @MustBeClosed
        fun download(
            id: String,
            params: AttachmentDownloadParams = AttachmentDownloadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = download(params.toBuilder().id(id).build(), requestOptions)

        /** @see download */
        @MustBeClosed
        fun download(
            params: AttachmentDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see download */
        @MustBeClosed
        fun download(id: String, requestOptions: RequestOptions): HttpResponse =
            download(id, AttachmentDownloadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/attachments/{id}/upload`, but is otherwise the
         * same as [AttachmentService.upload].
         */
        @MustBeClosed
        fun upload(
            id: String,
            body: String,
            params: AttachmentUploadParams = AttachmentUploadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = upload(params.toBuilder().id(id).body(body).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: AttachmentUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see upload */
        @MustBeClosed
        fun upload(id: String, body: String, requestOptions: RequestOptions): HttpResponse =
            upload(id, body, AttachmentUploadParams.none(), requestOptions)
    }
}
