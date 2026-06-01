// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponse
import com.configure_me_emcees_prod_testing_5.api.core.http.HttpResponseFor
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AttachmentArray
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionArray
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryListParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryListResponse
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategorySingle
import com.configure_me_emcees_prod_testing_5.api.models.categories.CategoryUpdateParams
import com.google.errorprone.annotations.MustBeClosed

/**
 * Endpoints to manage a user&#039;s categories and get information on transactions and other
 * related objects.
 */
interface CategoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CategoryService

    /**
     * Creates a new category. The data required can be submitted as a JSON body or as a list of
     * parameters.
     */
    fun create(
        params: CategoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategorySingle

    /** Get a single category. */
    fun retrieve(
        id: String,
        params: CategoryRetrieveParams = CategoryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategorySingle = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategorySingle

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CategorySingle =
        retrieve(id, CategoryRetrieveParams.none(), requestOptions)

    /** Update existing category. */
    fun update(
        id: String,
        params: CategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategorySingle = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: CategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategorySingle

    /** List all categories. */
    fun list(
        params: CategoryListParams = CategoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CategoryListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): CategoryListResponse =
        list(CategoryListParams.none(), requestOptions)

    /** Delete a category. Transactions will not be removed. */
    fun delete(
        id: String,
        params: CategoryDeleteParams = CategoryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: CategoryDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, CategoryDeleteParams.none(), requestOptions)

    /** Lists all attachments. */
    fun listAttachments(
        id: String,
        params: CategoryListAttachmentsParams = CategoryListAttachmentsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray = listAttachments(params.toBuilder().id(id).build(), requestOptions)

    /** @see listAttachments */
    fun listAttachments(
        params: CategoryListAttachmentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AttachmentArray

    /** @see listAttachments */
    fun listAttachments(id: String, requestOptions: RequestOptions): AttachmentArray =
        listAttachments(id, CategoryListAttachmentsParams.none(), requestOptions)

    /** List all transactions in a category, optionally limited to the date ranges specified. */
    fun listTransactions(
        id: String,
        params: CategoryListTransactionsParams = CategoryListTransactionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray = listTransactions(params.toBuilder().id(id).build(), requestOptions)

    /** @see listTransactions */
    fun listTransactions(
        params: CategoryListTransactionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionArray

    /** @see listTransactions */
    fun listTransactions(id: String, requestOptions: RequestOptions): TransactionArray =
        listTransactions(id, CategoryListTransactionsParams.none(), requestOptions)

    /** A view of [CategoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CategoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/categories`, but is otherwise the same as
         * [CategoryService.create].
         */
        @MustBeClosed
        fun create(
            params: CategoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategorySingle>

        /**
         * Returns a raw HTTP response for `get /v1/categories/{id}`, but is otherwise the same as
         * [CategoryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CategoryRetrieveParams = CategoryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategorySingle> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CategoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategorySingle>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<CategorySingle> =
            retrieve(id, CategoryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /v1/categories/{id}`, but is otherwise the same as
         * [CategoryService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: CategoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategorySingle> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: CategoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategorySingle>

        /**
         * Returns a raw HTTP response for `get /v1/categories`, but is otherwise the same as
         * [CategoryService.list].
         */
        @MustBeClosed
        fun list(
            params: CategoryListParams = CategoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CategoryListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CategoryListResponse> =
            list(CategoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v1/categories/{id}`, but is otherwise the same
         * as [CategoryService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: CategoryDeleteParams = CategoryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CategoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, CategoryDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/categories/{id}/attachments`, but is otherwise
         * the same as [CategoryService.listAttachments].
         */
        @MustBeClosed
        fun listAttachments(
            id: String,
            params: CategoryListAttachmentsParams = CategoryListAttachmentsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(params.toBuilder().id(id).build(), requestOptions)

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            params: CategoryListAttachmentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AttachmentArray>

        /** @see listAttachments */
        @MustBeClosed
        fun listAttachments(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttachmentArray> =
            listAttachments(id, CategoryListAttachmentsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/categories/{id}/transactions`, but is otherwise
         * the same as [CategoryService.listTransactions].
         */
        @MustBeClosed
        fun listTransactions(
            id: String,
            params: CategoryListTransactionsParams = CategoryListTransactionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray> =
            listTransactions(params.toBuilder().id(id).build(), requestOptions)

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            params: CategoryListTransactionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionArray>

        /** @see listTransactions */
        @MustBeClosed
        fun listTransactions(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionArray> =
            listTransactions(id, CategoryListTransactionsParams.none(), requestOptions)
    }
}
