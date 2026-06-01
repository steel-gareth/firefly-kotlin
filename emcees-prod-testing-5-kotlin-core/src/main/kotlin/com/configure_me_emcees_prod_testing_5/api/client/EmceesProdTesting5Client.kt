// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.client

import com.configure_me_emcees_prod_testing_5.api.core.ClientOptions
import com.configure_me_emcees_prod_testing_5.api.services.blocking.AboutService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.AccountService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.AttachmentService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.AutocompleteService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.AvailableBudgetService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.BatchService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.BillService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.BudgetService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.CategoryService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.ChartService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.ConfigurationService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.CronService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.CurrencyService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.DataService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.ExchangeRateService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.InsightService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.LinkTypeService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.ObjectGroupService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.PiggyBankService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.PreferenceService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.RecurrenceService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.RuleGroupService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.RuleService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.SearchService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.SummaryService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.TagService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.TransactionJournalService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.TransactionLinkService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.TransactionService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.UserGroupService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.UserService
import com.configure_me_emcees_prod_testing_5.api.services.blocking.WebhookService

/**
 * A client for interacting with the Emcees Prod Testing 5 REST API synchronously. You can also
 * switch to asynchronous execution via the [async] method.
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
interface EmceesProdTesting5Client {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): EmceesProdTesting5ClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmceesProdTesting5Client

    /**
     * Auto-complete endpoints show basic information about Firefly III models, like the name and
     * maybe some amounts. They all support a search query and can be used to autocomplete data in
     * forms. Autocomplete return values always have a &quot;name&quot;-field.
     */
    fun autocomplete(): AutocompleteService

    fun chart(): ChartService

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    fun data(): DataService

    fun insight(): InsightService

    /**
     * Endpoints that deliver all of the user&#039;s asset, expense and other accounts (and the
     * metadata) together with related transactions, piggy banks and other objects. Also delivers
     * endpoints for CRUD operations for accounts.
     */
    fun accounts(): AccountService

    /**
     * Endpoints to manage the attachments of the authenticated user, including up- and downloading
     * of the files.
     */
    fun attachments(): AttachmentService

    /**
     * Endpoints to manage the total available amount that the user has made available to
     * themselves. Used in periodic budgeting.
     */
    fun availableBudgets(): AvailableBudgetService

    /** Endpoints to manage a user&#039;s bills and all related objects. */
    fun bills(): BillService

    /**
     * Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits.
     */
    fun budgets(): BudgetService

    /**
     * Endpoints to manage a user&#039;s categories and get information on transactions and other
     * related objects.
     */
    fun categories(): CategoryService

    /** All currency exchange rates. */
    fun exchangeRates(): ExchangeRateService

    /** Endpoints to manage links between transactions, and manage the type of links available. */
    fun linkTypes(): LinkTypeService

    /** Endpoints to manage links between transactions, and manage the type of links available. */
    fun transactionLinks(): TransactionLinkService

    /**
     * Endpoints to control and manage all of the user&#039;s object groups. Can only be created in
     * conjunction with another object (for example a piggy bank) and will auto-delete when no other
     * items are linked to it.
     */
    fun objectGroups(): ObjectGroupService

    /**
     * Endpoints to control and manage all of the user&#039;s piggy banks and related objects and
     * information.
     */
    fun piggyBanks(): PiggyBankService

    /**
     * Use these endpoints to manage the user&#039;s recurring transactions, trigger the creation of
     * transactions and manage the settings.
     */
    fun recurrences(): RecurrenceService

    /** Manage all of the user&#039;s groups of rules and trigger the execution of entire groups. */
    fun ruleGroups(): RuleGroupService

    /**
     * These endpoints can be used to manage all of the user&#039;s rules. Also includes triggers to
     * execute or test rules and individual triggers.
     */
    fun rules(): RuleService

    /** This endpoint manages all of the user&#039;s tags. */
    fun tags(): TagService

    /**
     * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you can
     * also disable and enable them, or add new ones.
     */
    fun currencies(): CurrencyService

    /**
     * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
     * transactions.
     */
    fun transactionJournals(): TransactionJournalService

    /**
     * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
     * transactions.
     */
    fun transactions(): TransactionService

    /** User groups are the objects around which &quot;financial administrations&quot; are built. */
    fun userGroups(): UserGroupService

    /**
     * Endpoints that allow you to search through the user&#039;s financial data. Different from the
     * autocomplete endpoints, the search accepts more advanced arguments.
     */
    fun search(): SearchService

    /**
     * These endpoints deliver summaries, like sums, lists of numbers and other processed
     * information. Mainly used for the main dashboard and pretty specific for Firefly III itself.
     */
    fun summary(): SummaryService

    /** These endpoints deliver general system information, version- and meta information. */
    fun about(): AboutService

    /** These endpoints deliver general system information, version- and meta information. */
    fun batch(): BatchService

    /**
     * These endpoints allow you to manage and update the Firefly III configuration. You need to
     * have the &quot;owner&quot; role to update configuration.
     */
    fun configuration(): ConfigurationService

    /** These endpoints deliver general system information, version- and meta information. */
    fun cron(): CronService

    /**
     * Use these endpoints to manage the users registered within Firefly III. You need to have the
     * &quot;owner&quot; role to access these endpoints.
     */
    fun users(): UserService

    /**
     * These endpoints can be used to manage the user&#039;s preferences, including some hidden
     * ones.
     */
    fun preferences(): PreferenceService

    /**
     * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
     * necessary.
     */
    fun webhooks(): WebhookService

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
     * A view of [EmceesProdTesting5Client] that provides access to raw HTTP responses for each
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
        ): EmceesProdTesting5Client.WithRawResponse

        /**
         * Auto-complete endpoints show basic information about Firefly III models, like the name
         * and maybe some amounts. They all support a search query and can be used to autocomplete
         * data in forms. Autocomplete return values always have a &quot;name&quot;-field.
         */
        fun autocomplete(): AutocompleteService.WithRawResponse

        fun chart(): ChartService.WithRawResponse

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        fun data(): DataService.WithRawResponse

        fun insight(): InsightService.WithRawResponse

        /**
         * Endpoints that deliver all of the user&#039;s asset, expense and other accounts (and the
         * metadata) together with related transactions, piggy banks and other objects. Also
         * delivers endpoints for CRUD operations for accounts.
         */
        fun accounts(): AccountService.WithRawResponse

        /**
         * Endpoints to manage the attachments of the authenticated user, including up- and
         * downloading of the files.
         */
        fun attachments(): AttachmentService.WithRawResponse

        /**
         * Endpoints to manage the total available amount that the user has made available to
         * themselves. Used in periodic budgeting.
         */
        fun availableBudgets(): AvailableBudgetService.WithRawResponse

        /** Endpoints to manage a user&#039;s bills and all related objects. */
        fun bills(): BillService.WithRawResponse

        /**
         * Endpoints to manage a user&#039;s budgets and get info on the related objects, like
         * limits.
         */
        fun budgets(): BudgetService.WithRawResponse

        /**
         * Endpoints to manage a user&#039;s categories and get information on transactions and
         * other related objects.
         */
        fun categories(): CategoryService.WithRawResponse

        /** All currency exchange rates. */
        fun exchangeRates(): ExchangeRateService.WithRawResponse

        /**
         * Endpoints to manage links between transactions, and manage the type of links available.
         */
        fun linkTypes(): LinkTypeService.WithRawResponse

        /**
         * Endpoints to manage links between transactions, and manage the type of links available.
         */
        fun transactionLinks(): TransactionLinkService.WithRawResponse

        /**
         * Endpoints to control and manage all of the user&#039;s object groups. Can only be created
         * in conjunction with another object (for example a piggy bank) and will auto-delete when
         * no other items are linked to it.
         */
        fun objectGroups(): ObjectGroupService.WithRawResponse

        /**
         * Endpoints to control and manage all of the user&#039;s piggy banks and related objects
         * and information.
         */
        fun piggyBanks(): PiggyBankService.WithRawResponse

        /**
         * Use these endpoints to manage the user&#039;s recurring transactions, trigger the
         * creation of transactions and manage the settings.
         */
        fun recurrences(): RecurrenceService.WithRawResponse

        /**
         * Manage all of the user&#039;s groups of rules and trigger the execution of entire groups.
         */
        fun ruleGroups(): RuleGroupService.WithRawResponse

        /**
         * These endpoints can be used to manage all of the user&#039;s rules. Also includes
         * triggers to execute or test rules and individual triggers.
         */
        fun rules(): RuleService.WithRawResponse

        /** This endpoint manages all of the user&#039;s tags. */
        fun tags(): TagService.WithRawResponse

        /**
         * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you
         * can also disable and enable them, or add new ones.
         */
        fun currencies(): CurrencyService.WithRawResponse

        /**
         * The most-used endpoints in Firefly III, these endpoints are used to manage the
         * user&#039;s transactions.
         */
        fun transactionJournals(): TransactionJournalService.WithRawResponse

        /**
         * The most-used endpoints in Firefly III, these endpoints are used to manage the
         * user&#039;s transactions.
         */
        fun transactions(): TransactionService.WithRawResponse

        /**
         * User groups are the objects around which &quot;financial administrations&quot; are built.
         */
        fun userGroups(): UserGroupService.WithRawResponse

        /**
         * Endpoints that allow you to search through the user&#039;s financial data. Different from
         * the autocomplete endpoints, the search accepts more advanced arguments.
         */
        fun search(): SearchService.WithRawResponse

        /**
         * These endpoints deliver summaries, like sums, lists of numbers and other processed
         * information. Mainly used for the main dashboard and pretty specific for Firefly III
         * itself.
         */
        fun summary(): SummaryService.WithRawResponse

        /** These endpoints deliver general system information, version- and meta information. */
        fun about(): AboutService.WithRawResponse

        /** These endpoints deliver general system information, version- and meta information. */
        fun batch(): BatchService.WithRawResponse

        /**
         * These endpoints allow you to manage and update the Firefly III configuration. You need to
         * have the &quot;owner&quot; role to update configuration.
         */
        fun configuration(): ConfigurationService.WithRawResponse

        /** These endpoints deliver general system information, version- and meta information. */
        fun cron(): CronService.WithRawResponse

        /**
         * Use these endpoints to manage the users registered within Firefly III. You need to have
         * the &quot;owner&quot; role to access these endpoints.
         */
        fun users(): UserService.WithRawResponse

        /**
         * These endpoints can be used to manage the user&#039;s preferences, including some hidden
         * ones.
         */
        fun preferences(): PreferenceService.WithRawResponse

        /**
         * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
         * necessary.
         */
        fun webhooks(): WebhookService.WithRawResponse
    }
}
