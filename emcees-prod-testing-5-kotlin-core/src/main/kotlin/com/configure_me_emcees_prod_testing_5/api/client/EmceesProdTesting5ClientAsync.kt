// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.client

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.services.async.AboutServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.AccountServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.AttachmentServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.AutocompleteServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.AvailableBudgetServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.BatchServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.BillServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.BudgetServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.CategoryServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.ChartServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.ConfigurationServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.CronServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.CurrencyServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.DataServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.ExchangeRateServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.InsightServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.LinkTypeServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.ObjectGroupServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.PiggyBankServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.PreferenceServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.RecurrenceServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.RuleGroupServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.RuleServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.SearchServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.SummaryServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.TagServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.TransactionJournalServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.TransactionLinkServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.TransactionServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.UserGroupServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.UserServiceAsync
import com.configure_me_emcees_prod_testing_5.api.services.async.WebhookServiceAsync

/**
 * A client for interacting with the Emcees Prod Testing 5 REST API asynchronously. You can also
 * switch to synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface EmceesProdTesting5ClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): EmceesProdTesting5Client

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmceesProdTesting5ClientAsync

    /**
     * Auto-complete endpoints show basic information about Firefly III models, like the name and
     * maybe some amounts. They all support a search query and can be used to autocomplete data in
     * forms. Autocomplete return values always have a &quot;name&quot;-field.
     */
    fun autocomplete(): AutocompleteServiceAsync

    fun chart(): ChartServiceAsync

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    fun data(): DataServiceAsync

    fun insight(): InsightServiceAsync

    /**
     * Endpoints that deliver all of the user&#039;s asset, expense and other accounts (and the
     * metadata) together with related transactions, piggy banks and other objects. Also delivers
     * endpoints for CRUD operations for accounts.
     */
    fun accounts(): AccountServiceAsync

    /**
     * Endpoints to manage the attachments of the authenticated user, including up- and downloading
     * of the files.
     */
    fun attachments(): AttachmentServiceAsync

    /**
     * Endpoints to manage the total available amount that the user has made available to
     * themselves. Used in periodic budgeting.
     */
    fun availableBudgets(): AvailableBudgetServiceAsync

    /** Endpoints to manage a user&#039;s bills and all related objects. */
    fun bills(): BillServiceAsync

    /**
     * Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits.
     */
    fun budgets(): BudgetServiceAsync

    /**
     * Endpoints to manage a user&#039;s categories and get information on transactions and other
     * related objects.
     */
    fun categories(): CategoryServiceAsync

    /** All currency exchange rates. */
    fun exchangeRates(): ExchangeRateServiceAsync

    /** Endpoints to manage links between transactions, and manage the type of links available. */
    fun linkTypes(): LinkTypeServiceAsync

    /** Endpoints to manage links between transactions, and manage the type of links available. */
    fun transactionLinks(): TransactionLinkServiceAsync

    /**
     * Endpoints to control and manage all of the user&#039;s object groups. Can only be created in
     * conjunction with another object (for example a piggy bank) and will auto-delete when no other
     * items are linked to it.
     */
    fun objectGroups(): ObjectGroupServiceAsync

    /**
     * Endpoints to control and manage all of the user&#039;s piggy banks and related objects and
     * information.
     */
    fun piggyBanks(): PiggyBankServiceAsync

    /**
     * Use these endpoints to manage the user&#039;s recurring transactions, trigger the creation of
     * transactions and manage the settings.
     */
    fun recurrences(): RecurrenceServiceAsync

    /** Manage all of the user&#039;s groups of rules and trigger the execution of entire groups. */
    fun ruleGroups(): RuleGroupServiceAsync

    /**
     * These endpoints can be used to manage all of the user&#039;s rules. Also includes triggers to
     * execute or test rules and individual triggers.
     */
    fun rules(): RuleServiceAsync

    /** This endpoint manages all of the user&#039;s tags. */
    fun tags(): TagServiceAsync

    /**
     * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you can
     * also disable and enable them, or add new ones.
     */
    fun currencies(): CurrencyServiceAsync

    /**
     * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
     * transactions.
     */
    fun transactionJournals(): TransactionJournalServiceAsync

    /**
     * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
     * transactions.
     */
    fun transactions(): TransactionServiceAsync

    /** User groups are the objects around which &quot;financial administrations&quot; are built. */
    fun userGroups(): UserGroupServiceAsync

    /**
     * Endpoints that allow you to search through the user&#039;s financial data. Different from the
     * autocomplete endpoints, the search accepts more advanced arguments.
     */
    fun search(): SearchServiceAsync

    /**
     * These endpoints deliver summaries, like sums, lists of numbers and other processed
     * information. Mainly used for the main dashboard and pretty specific for Firefly III itself.
     */
    fun summary(): SummaryServiceAsync

    /** These endpoints deliver general system information, version- and meta information. */
    fun about(): AboutServiceAsync

    /** These endpoints deliver general system information, version- and meta information. */
    fun batch(): BatchServiceAsync

    /**
     * These endpoints allow you to manage and update the Firefly III configuration. You need to
     * have the &quot;owner&quot; role to update configuration.
     */
    fun configuration(): ConfigurationServiceAsync

    /** These endpoints deliver general system information, version- and meta information. */
    fun cron(): CronServiceAsync

    /**
     * Use these endpoints to manage the users registered within Firefly III. You need to have the
     * &quot;owner&quot; role to access these endpoints.
     */
    fun users(): UserServiceAsync

    /**
     * These endpoints can be used to manage the user&#039;s preferences, including some hidden
     * ones.
     */
    fun preferences(): PreferenceServiceAsync

    /**
     * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
     * necessary.
     */
    fun webhooks(): WebhookServiceAsync

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /**
     * A view of [EmceesProdTesting5ClientAsync] that provides access to raw HTTP responses for each
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
        ): EmceesProdTesting5ClientAsync.WithRawResponse

        /**
         * Auto-complete endpoints show basic information about Firefly III models, like the name
         * and maybe some amounts. They all support a search query and can be used to autocomplete
         * data in forms. Autocomplete return values always have a &quot;name&quot;-field.
         */
        fun autocomplete(): AutocompleteServiceAsync.WithRawResponse

        fun chart(): ChartServiceAsync.WithRawResponse

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        fun data(): DataServiceAsync.WithRawResponse

        fun insight(): InsightServiceAsync.WithRawResponse

        /**
         * Endpoints that deliver all of the user&#039;s asset, expense and other accounts (and the
         * metadata) together with related transactions, piggy banks and other objects. Also
         * delivers endpoints for CRUD operations for accounts.
         */
        fun accounts(): AccountServiceAsync.WithRawResponse

        /**
         * Endpoints to manage the attachments of the authenticated user, including up- and
         * downloading of the files.
         */
        fun attachments(): AttachmentServiceAsync.WithRawResponse

        /**
         * Endpoints to manage the total available amount that the user has made available to
         * themselves. Used in periodic budgeting.
         */
        fun availableBudgets(): AvailableBudgetServiceAsync.WithRawResponse

        /** Endpoints to manage a user&#039;s bills and all related objects. */
        fun bills(): BillServiceAsync.WithRawResponse

        /**
         * Endpoints to manage a user&#039;s budgets and get info on the related objects, like
         * limits.
         */
        fun budgets(): BudgetServiceAsync.WithRawResponse

        /**
         * Endpoints to manage a user&#039;s categories and get information on transactions and
         * other related objects.
         */
        fun categories(): CategoryServiceAsync.WithRawResponse

        /** All currency exchange rates. */
        fun exchangeRates(): ExchangeRateServiceAsync.WithRawResponse

        /**
         * Endpoints to manage links between transactions, and manage the type of links available.
         */
        fun linkTypes(): LinkTypeServiceAsync.WithRawResponse

        /**
         * Endpoints to manage links between transactions, and manage the type of links available.
         */
        fun transactionLinks(): TransactionLinkServiceAsync.WithRawResponse

        /**
         * Endpoints to control and manage all of the user&#039;s object groups. Can only be created
         * in conjunction with another object (for example a piggy bank) and will auto-delete when
         * no other items are linked to it.
         */
        fun objectGroups(): ObjectGroupServiceAsync.WithRawResponse

        /**
         * Endpoints to control and manage all of the user&#039;s piggy banks and related objects
         * and information.
         */
        fun piggyBanks(): PiggyBankServiceAsync.WithRawResponse

        /**
         * Use these endpoints to manage the user&#039;s recurring transactions, trigger the
         * creation of transactions and manage the settings.
         */
        fun recurrences(): RecurrenceServiceAsync.WithRawResponse

        /**
         * Manage all of the user&#039;s groups of rules and trigger the execution of entire groups.
         */
        fun ruleGroups(): RuleGroupServiceAsync.WithRawResponse

        /**
         * These endpoints can be used to manage all of the user&#039;s rules. Also includes
         * triggers to execute or test rules and individual triggers.
         */
        fun rules(): RuleServiceAsync.WithRawResponse

        /** This endpoint manages all of the user&#039;s tags. */
        fun tags(): TagServiceAsync.WithRawResponse

        /**
         * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you
         * can also disable and enable them, or add new ones.
         */
        fun currencies(): CurrencyServiceAsync.WithRawResponse

        /**
         * The most-used endpoints in Firefly III, these endpoints are used to manage the
         * user&#039;s transactions.
         */
        fun transactionJournals(): TransactionJournalServiceAsync.WithRawResponse

        /**
         * The most-used endpoints in Firefly III, these endpoints are used to manage the
         * user&#039;s transactions.
         */
        fun transactions(): TransactionServiceAsync.WithRawResponse

        /**
         * User groups are the objects around which &quot;financial administrations&quot; are built.
         */
        fun userGroups(): UserGroupServiceAsync.WithRawResponse

        /**
         * Endpoints that allow you to search through the user&#039;s financial data. Different from
         * the autocomplete endpoints, the search accepts more advanced arguments.
         */
        fun search(): SearchServiceAsync.WithRawResponse

        /**
         * These endpoints deliver summaries, like sums, lists of numbers and other processed
         * information. Mainly used for the main dashboard and pretty specific for Firefly III
         * itself.
         */
        fun summary(): SummaryServiceAsync.WithRawResponse

        /** These endpoints deliver general system information, version- and meta information. */
        fun about(): AboutServiceAsync.WithRawResponse

        /** These endpoints deliver general system information, version- and meta information. */
        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * These endpoints allow you to manage and update the Firefly III configuration. You need to
         * have the &quot;owner&quot; role to update configuration.
         */
        fun configuration(): ConfigurationServiceAsync.WithRawResponse

        /** These endpoints deliver general system information, version- and meta information. */
        fun cron(): CronServiceAsync.WithRawResponse

        /**
         * Use these endpoints to manage the users registered within Firefly III. You need to have
         * the &quot;owner&quot; role to access these endpoints.
         */
        fun users(): UserServiceAsync.WithRawResponse

        /**
         * These endpoints can be used to manage the user&#039;s preferences, including some hidden
         * ones.
         */
        fun preferences(): PreferenceServiceAsync.WithRawResponse

        /**
         * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
         * necessary.
         */
        fun webhooks(): WebhookServiceAsync.WithRawResponse
    }
}
