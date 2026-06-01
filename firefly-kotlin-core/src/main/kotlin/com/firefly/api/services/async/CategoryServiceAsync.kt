// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.RequestOptions
import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponseFor
import com.firefly.api.models.accounts.AttachmentArray
import com.firefly.api.models.accounts.TransactionArray
import com.firefly.api.models.categories.CategoryCreateParams
import com.firefly.api.models.categories.CategoryDeleteParams
import com.firefly.api.models.categories.CategoryListAttachmentsParams
import com.firefly.api.models.categories.CategoryListParams
import com.firefly.api.models.categories.CategoryListResponse
import com.firefly.api.models.categories.CategoryListTransactionsParams
import com.firefly.api.models.categories.CategoryRetrieveParams
import com.firefly.api.models.categories.CategorySingle
import com.firefly.api.models.categories.CategoryUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints to manage a user&#039;s categories and get information on transactions and other
 * related objects.
 */
interface CategoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CategoryServiceAsync

    /**
     * Creates a new category. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    suspend fun create(
        params: CategoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategorySingle

    /** Get a single category. */
    suspend fun retrieve(
        id: String,
        params: CategoryRetrieveParams = CategoryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategorySingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategorySingle

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): CategorySingle =
        retrieve(id, CategoryRetrieveParams.none(), requestOptions)

    /** Update existing category. */
    suspend fun update(
        id: String,
        params: CategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategorySingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: CategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategorySingle

    /** List all categories. */
    suspend fun list(
        params: CategoryListParams = CategoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategoryListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CategoryListResponse =
        list(CategoryListParams.none(), requestOptions)

    /** Delete a category. Transactions will not be removed. */
    suspend fun delete(
        id: String,
        params: CategoryDeleteParams = CategoryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: CategoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, CategoryDeleteParams.none(), requestOptions)

    /** Lists all attachments. */
    suspend fun listAttachments(
        id: String,
        params: CategoryListAttachmentsParams = CategoryListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray = listAttachments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAttachments */
    suspend fun listAttachments(
        params: CategoryListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see listAttachments */
    suspend fun listAttachments(id: String, requestOptions: RequestOptions): AttachmentArray =
        listAttachments(id, CategoryListAttachmentsParams.none(), requestOptions)

    /** List all transactions in a category, optionally limited to the date ranges specified. */
    suspend fun listTransactions(
        id: String,
        params: CategoryListTransactionsParams = CategoryListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTransactions */
    suspend fun listTransactions(
        params: CategoryListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    suspend fun listTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(id, CategoryListTransactionsParams.none(), requestOptions)

    /**
     * A view of [CategoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CategoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/categories`, but is otherwise the same as
         * [CategoryServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CategoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategorySingle>

        /**
         * Returns a raw HTTP response for `get /v1/categories/{id}`, but is otherwise the same as
         * [CategoryServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: CategoryRetrieveParams = CategoryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategorySingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CategoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategorySingle>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CategorySingle> =
            retrieve(id, CategoryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/categories/{id}`, but is otherwise the same as
         * [CategoryServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: CategoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategorySingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: CategoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategorySingle>

        /**
         * Returns a raw HTTP response for `get /v1/categories`, but is otherwise the same as
         * [CategoryServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CategoryListParams = CategoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategoryListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CategoryListResponse> =
            list(CategoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/categories/{id}`, but is otherwise the same
         * as [CategoryServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: CategoryDeleteParams = CategoryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: CategoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, CategoryDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/categories/{id}/attachments`, but is otherwise
         * the same as [CategoryServiceAsync.listAttachments].
         */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            params: CategoryListAttachmentsParams = CategoryListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            params: CategoryListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see listAttachments */
        @MustBeClosed
        suspend fun listAttachments(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(id, CategoryListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/categories/{id}/transactions`, but is otherwise
         * the same as [CategoryServiceAsync.listTransactions].
         */
        @MustBeClosed
        suspend fun listTransactions(
            id: String,
            params: CategoryListTransactionsParams = CategoryListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            params: CategoryListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        suspend fun listTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(id, CategoryListTransactionsParams.none(), requestOptions)
    }
}
