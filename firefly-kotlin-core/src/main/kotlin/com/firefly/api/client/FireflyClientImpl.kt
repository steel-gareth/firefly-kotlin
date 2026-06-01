// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.client

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.getPackageVersion
import com.firefly.api.services.blocking.AboutService
import com.firefly.api.services.blocking.AboutServiceImpl
import com.firefly.api.services.blocking.AccountService
import com.firefly.api.services.blocking.AccountServiceImpl
import com.firefly.api.services.blocking.AttachmentService
import com.firefly.api.services.blocking.AttachmentServiceImpl
import com.firefly.api.services.blocking.AutocompleteService
import com.firefly.api.services.blocking.AutocompleteServiceImpl
import com.firefly.api.services.blocking.AvailableBudgetService
import com.firefly.api.services.blocking.AvailableBudgetServiceImpl
import com.firefly.api.services.blocking.BatchService
import com.firefly.api.services.blocking.BatchServiceImpl
import com.firefly.api.services.blocking.BillService
import com.firefly.api.services.blocking.BillServiceImpl
import com.firefly.api.services.blocking.BudgetService
import com.firefly.api.services.blocking.BudgetServiceImpl
import com.firefly.api.services.blocking.CategoryService
import com.firefly.api.services.blocking.CategoryServiceImpl
import com.firefly.api.services.blocking.ChartService
import com.firefly.api.services.blocking.ChartServiceImpl
import com.firefly.api.services.blocking.ConfigurationService
import com.firefly.api.services.blocking.ConfigurationServiceImpl
import com.firefly.api.services.blocking.CronService
import com.firefly.api.services.blocking.CronServiceImpl
import com.firefly.api.services.blocking.CurrencyService
import com.firefly.api.services.blocking.CurrencyServiceImpl
import com.firefly.api.services.blocking.DataService
import com.firefly.api.services.blocking.DataServiceImpl
import com.firefly.api.services.blocking.ExchangeRateService
import com.firefly.api.services.blocking.ExchangeRateServiceImpl
import com.firefly.api.services.blocking.InsightService
import com.firefly.api.services.blocking.InsightServiceImpl
import com.firefly.api.services.blocking.LinkTypeService
import com.firefly.api.services.blocking.LinkTypeServiceImpl
import com.firefly.api.services.blocking.ObjectGroupService
import com.firefly.api.services.blocking.ObjectGroupServiceImpl
import com.firefly.api.services.blocking.PiggyBankService
import com.firefly.api.services.blocking.PiggyBankServiceImpl
import com.firefly.api.services.blocking.PreferenceService
import com.firefly.api.services.blocking.PreferenceServiceImpl
import com.firefly.api.services.blocking.RecurrenceService
import com.firefly.api.services.blocking.RecurrenceServiceImpl
import com.firefly.api.services.blocking.RuleGroupService
import com.firefly.api.services.blocking.RuleGroupServiceImpl
import com.firefly.api.services.blocking.RuleService
import com.firefly.api.services.blocking.RuleServiceImpl
import com.firefly.api.services.blocking.SearchService
import com.firefly.api.services.blocking.SearchServiceImpl
import com.firefly.api.services.blocking.SummaryService
import com.firefly.api.services.blocking.SummaryServiceImpl
import com.firefly.api.services.blocking.TagService
import com.firefly.api.services.blocking.TagServiceImpl
import com.firefly.api.services.blocking.TransactionJournalService
import com.firefly.api.services.blocking.TransactionJournalServiceImpl
import com.firefly.api.services.blocking.TransactionLinkService
import com.firefly.api.services.blocking.TransactionLinkServiceImpl
import com.firefly.api.services.blocking.TransactionService
import com.firefly.api.services.blocking.TransactionServiceImpl
import com.firefly.api.services.blocking.UserGroupService
import com.firefly.api.services.blocking.UserGroupServiceImpl
import com.firefly.api.services.blocking.UserService
import com.firefly.api.services.blocking.UserServiceImpl
import com.firefly.api.services.blocking.WebhookService
import com.firefly.api.services.blocking.WebhookServiceImpl

class FireflyClientImpl(private val clientOptions: ClientOptions) : FireflyClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: FireflyClientAsync by lazy { FireflyClientAsyncImpl(clientOptions) }

    private val withRawResponse: FireflyClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val autocomplete: AutocompleteService by lazy {
        AutocompleteServiceImpl(clientOptionsWithUserAgent)
    }

    private val chart: ChartService by lazy { ChartServiceImpl(clientOptionsWithUserAgent) }

    private val data: DataService by lazy { DataServiceImpl(clientOptionsWithUserAgent) }

    private val insight: InsightService by lazy { InsightServiceImpl(clientOptionsWithUserAgent) }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val attachments: AttachmentService by lazy {
        AttachmentServiceImpl(clientOptionsWithUserAgent)
    }

    private val availableBudgets: AvailableBudgetService by lazy {
        AvailableBudgetServiceImpl(clientOptionsWithUserAgent)
    }

    private val bills: BillService by lazy { BillServiceImpl(clientOptionsWithUserAgent) }

    private val budgets: BudgetService by lazy { BudgetServiceImpl(clientOptionsWithUserAgent) }

    private val categories: CategoryService by lazy {
        CategoryServiceImpl(clientOptionsWithUserAgent)
    }

    private val exchangeRates: ExchangeRateService by lazy {
        ExchangeRateServiceImpl(clientOptionsWithUserAgent)
    }

    private val linkTypes: LinkTypeService by lazy {
        LinkTypeServiceImpl(clientOptionsWithUserAgent)
    }

    private val transactionLinks: TransactionLinkService by lazy {
        TransactionLinkServiceImpl(clientOptionsWithUserAgent)
    }

    private val objectGroups: ObjectGroupService by lazy {
        ObjectGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val piggyBanks: PiggyBankService by lazy {
        PiggyBankServiceImpl(clientOptionsWithUserAgent)
    }

    private val recurrences: RecurrenceService by lazy {
        RecurrenceServiceImpl(clientOptionsWithUserAgent)
    }

    private val ruleGroups: RuleGroupService by lazy {
        RuleGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val rules: RuleService by lazy { RuleServiceImpl(clientOptionsWithUserAgent) }

    private val tags: TagService by lazy { TagServiceImpl(clientOptionsWithUserAgent) }

    private val currencies: CurrencyService by lazy {
        CurrencyServiceImpl(clientOptionsWithUserAgent)
    }

    private val transactionJournals: TransactionJournalService by lazy {
        TransactionJournalServiceImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionService by lazy {
        TransactionServiceImpl(clientOptionsWithUserAgent)
    }

    private val userGroups: UserGroupService by lazy {
        UserGroupServiceImpl(clientOptionsWithUserAgent)
    }

    private val search: SearchService by lazy { SearchServiceImpl(clientOptionsWithUserAgent) }

    private val summary: SummaryService by lazy { SummaryServiceImpl(clientOptionsWithUserAgent) }

    private val about: AboutService by lazy { AboutServiceImpl(clientOptionsWithUserAgent) }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptionsWithUserAgent) }

    private val configuration: ConfigurationService by lazy {
        ConfigurationServiceImpl(clientOptionsWithUserAgent)
    }

    private val cron: CronService by lazy { CronServiceImpl(clientOptionsWithUserAgent) }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    private val preferences: PreferenceService by lazy {
        PreferenceServiceImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): FireflyClientAsync = async

    override fun withRawResponse(): FireflyClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FireflyClient =
        FireflyClientImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Auto-complete endpoints show basic information about Firefly III models, like the name and
     * maybe some amounts. They all support a search query and can be used to autocomplete data in
     * forms. Autocomplete return values always have a &quot;name&quot;-field.
     */
    override fun autocomplete(): AutocompleteService = autocomplete

    override fun chart(): ChartService = chart

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    override fun data(): DataService = data

    override fun insight(): InsightService = insight

    /**
     * Endpoints that deliver all of the user&#039;s asset, expense and other accounts (and the
     * metadata) together with related transactions, piggy banks and other objects. Also delivers
     * endpoints for CRUD operations for accounts.
     */
    override fun accounts(): AccountService = accounts

    /**
     * Endpoints to manage the attachments of the authenticated user, including up- and downloading
     * of the files.
     */
    override fun attachments(): AttachmentService = attachments

    /**
     * Endpoints to manage the total available amount that the user has made available to
     * themselves. Used in periodic budgeting.
     */
    override fun availableBudgets(): AvailableBudgetService = availableBudgets

    /** Endpoints to manage a user&#039;s bills and all related objects. */
    override fun bills(): BillService = bills

    /**
     * Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits.
     */
    override fun budgets(): BudgetService = budgets

    /**
     * Endpoints to manage a user&#039;s categories and get information on transactions and other
     * related objects.
     */
    override fun categories(): CategoryService = categories

    /** All currency exchange rates. */
    override fun exchangeRates(): ExchangeRateService = exchangeRates

    /** Endpoints to manage links between transactions, and manage the type of links available. */
    override fun linkTypes(): LinkTypeService = linkTypes

    /** Endpoints to manage links between transactions, and manage the type of links available. */
    override fun transactionLinks(): TransactionLinkService = transactionLinks

    /**
     * Endpoints to control and manage all of the user&#039;s object groups. Can only be created in
     * conjunction with another object (for example a piggy bank) and will auto-delete when no other
     * items are linked to it.
     */
    override fun objectGroups(): ObjectGroupService = objectGroups

    /**
     * Endpoints to control and manage all of the user&#039;s piggy banks and related objects and
     * information.
     */
    override fun piggyBanks(): PiggyBankService = piggyBanks

    /**
     * Use these endpoints to manage the user&#039;s recurring transactions, trigger the creation of
     * transactions and manage the settings.
     */
    override fun recurrences(): RecurrenceService = recurrences

    /** Manage all of the user&#039;s groups of rules and trigger the execution of entire groups. */
    override fun ruleGroups(): RuleGroupService = ruleGroups

    /**
     * These endpoints can be used to manage all of the user&#039;s rules. Also includes triggers to
     * execute or test rules and individual triggers.
     */
    override fun rules(): RuleService = rules

    /** This endpoint manages all of the user&#039;s tags. */
    override fun tags(): TagService = tags

    /**
     * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you can
     * also disable and enable them, or add new ones.
     */
    override fun currencies(): CurrencyService = currencies

    /**
     * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
     * transactions.
     */
    override fun transactionJournals(): TransactionJournalService = transactionJournals

    /**
     * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
     * transactions.
     */
    override fun transactions(): TransactionService = transactions

    /** User groups are the objects around which &quot;financial administrations&quot; are built. */
    override fun userGroups(): UserGroupService = userGroups

    /**
     * Endpoints that allow you to search through the user&#039;s financial data. Different from the
     * autocomplete endpoints, the search accepts more advanced arguments.
     */
    override fun search(): SearchService = search

    /**
     * These endpoints deliver summaries, like sums, lists of numbers and other processed
     * information. Mainly used for the main dashboard and pretty specific for Firefly III itself.
     */
    override fun summary(): SummaryService = summary

    /** These endpoints deliver general system information, version- and meta information. */
    override fun about(): AboutService = about

    /** These endpoints deliver general system information, version- and meta information. */
    override fun batch(): BatchService = batch

    /**
     * These endpoints allow you to manage and update the Firefly III configuration. You need to
     * have the &quot;owner&quot; role to update configuration.
     */
    override fun configuration(): ConfigurationService = configuration

    /** These endpoints deliver general system information, version- and meta information. */
    override fun cron(): CronService = cron

    /**
     * Use these endpoints to manage the users registered within Firefly III. You need to have the
     * &quot;owner&quot; role to access these endpoints.
     */
    override fun users(): UserService = users

    /**
     * These endpoints can be used to manage the user&#039;s preferences, including some hidden
     * ones.
     */
    override fun preferences(): PreferenceService = preferences

    /**
     * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
     * necessary.
     */
    override fun webhooks(): WebhookService = webhooks

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FireflyClient.WithRawResponse {

        private val autocomplete: AutocompleteService.WithRawResponse by lazy {
            AutocompleteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chart: ChartService.WithRawResponse by lazy {
            ChartServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val data: DataService.WithRawResponse by lazy {
            DataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val insight: InsightService.WithRawResponse by lazy {
            InsightServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val attachments: AttachmentService.WithRawResponse by lazy {
            AttachmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val availableBudgets: AvailableBudgetService.WithRawResponse by lazy {
            AvailableBudgetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bills: BillService.WithRawResponse by lazy {
            BillServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val budgets: BudgetService.WithRawResponse by lazy {
            BudgetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val categories: CategoryService.WithRawResponse by lazy {
            CategoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val exchangeRates: ExchangeRateService.WithRawResponse by lazy {
            ExchangeRateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkTypes: LinkTypeService.WithRawResponse by lazy {
            LinkTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactionLinks: TransactionLinkService.WithRawResponse by lazy {
            TransactionLinkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val objectGroups: ObjectGroupService.WithRawResponse by lazy {
            ObjectGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val piggyBanks: PiggyBankService.WithRawResponse by lazy {
            PiggyBankServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val recurrences: RecurrenceService.WithRawResponse by lazy {
            RecurrenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ruleGroups: RuleGroupService.WithRawResponse by lazy {
            RuleGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rules: RuleService.WithRawResponse by lazy {
            RuleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tags: TagService.WithRawResponse by lazy {
            TagServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val currencies: CurrencyService.WithRawResponse by lazy {
            CurrencyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactionJournals: TransactionJournalService.WithRawResponse by lazy {
            TransactionJournalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionService.WithRawResponse by lazy {
            TransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val userGroups: UserGroupService.WithRawResponse by lazy {
            UserGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val search: SearchService.WithRawResponse by lazy {
            SearchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val summary: SummaryService.WithRawResponse by lazy {
            SummaryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val about: AboutService.WithRawResponse by lazy {
            AboutServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val configuration: ConfigurationService.WithRawResponse by lazy {
            ConfigurationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cron: CronService.WithRawResponse by lazy {
            CronServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val preferences: PreferenceService.WithRawResponse by lazy {
            PreferenceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FireflyClient.WithRawResponse =
            FireflyClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        /**
         * Auto-complete endpoints show basic information about Firefly III models, like the name
         * and maybe some amounts. They all support a search query and can be used to autocomplete
         * data in forms. Autocomplete return values always have a &quot;name&quot;-field.
         */
        override fun autocomplete(): AutocompleteService.WithRawResponse = autocomplete

        override fun chart(): ChartService.WithRawResponse = chart

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        override fun data(): DataService.WithRawResponse = data

        override fun insight(): InsightService.WithRawResponse = insight

        /**
         * Endpoints that deliver all of the user&#039;s asset, expense and other accounts (and the
         * metadata) together with related transactions, piggy banks and other objects. Also
         * delivers endpoints for CRUD operations for accounts.
         */
        override fun accounts(): AccountService.WithRawResponse = accounts

        /**
         * Endpoints to manage the attachments of the authenticated user, including up- and
         * downloading of the files.
         */
        override fun attachments(): AttachmentService.WithRawResponse = attachments

        /**
         * Endpoints to manage the total available amount that the user has made available to
         * themselves. Used in periodic budgeting.
         */
        override fun availableBudgets(): AvailableBudgetService.WithRawResponse = availableBudgets

        /** Endpoints to manage a user&#039;s bills and all related objects. */
        override fun bills(): BillService.WithRawResponse = bills

        /**
         * Endpoints to manage a user&#039;s budgets and get info on the related objects, like
         * limits.
         */
        override fun budgets(): BudgetService.WithRawResponse = budgets

        /**
         * Endpoints to manage a user&#039;s categories and get information on transactions and
         * other related objects.
         */
        override fun categories(): CategoryService.WithRawResponse = categories

        /** All currency exchange rates. */
        override fun exchangeRates(): ExchangeRateService.WithRawResponse = exchangeRates

        /**
         * Endpoints to manage links between transactions, and manage the type of links available.
         */
        override fun linkTypes(): LinkTypeService.WithRawResponse = linkTypes

        /**
         * Endpoints to manage links between transactions, and manage the type of links available.
         */
        override fun transactionLinks(): TransactionLinkService.WithRawResponse = transactionLinks

        /**
         * Endpoints to control and manage all of the user&#039;s object groups. Can only be created
         * in conjunction with another object (for example a piggy bank) and will auto-delete when
         * no other items are linked to it.
         */
        override fun objectGroups(): ObjectGroupService.WithRawResponse = objectGroups

        /**
         * Endpoints to control and manage all of the user&#039;s piggy banks and related objects
         * and information.
         */
        override fun piggyBanks(): PiggyBankService.WithRawResponse = piggyBanks

        /**
         * Use these endpoints to manage the user&#039;s recurring transactions, trigger the
         * creation of transactions and manage the settings.
         */
        override fun recurrences(): RecurrenceService.WithRawResponse = recurrences

        /**
         * Manage all of the user&#039;s groups of rules and trigger the execution of entire groups.
         */
        override fun ruleGroups(): RuleGroupService.WithRawResponse = ruleGroups

        /**
         * These endpoints can be used to manage all of the user&#039;s rules. Also includes
         * triggers to execute or test rules and individual triggers.
         */
        override fun rules(): RuleService.WithRawResponse = rules

        /** This endpoint manages all of the user&#039;s tags. */
        override fun tags(): TagService.WithRawResponse = tags

        /**
         * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you
         * can also disable and enable them, or add new ones.
         */
        override fun currencies(): CurrencyService.WithRawResponse = currencies

        /**
         * The most-used endpoints in Firefly III, these endpoints are used to manage the
         * user&#039;s transactions.
         */
        override fun transactionJournals(): TransactionJournalService.WithRawResponse =
            transactionJournals

        /**
         * The most-used endpoints in Firefly III, these endpoints are used to manage the
         * user&#039;s transactions.
         */
        override fun transactions(): TransactionService.WithRawResponse = transactions

        /**
         * User groups are the objects around which &quot;financial administrations&quot; are built.
         */
        override fun userGroups(): UserGroupService.WithRawResponse = userGroups

        /**
         * Endpoints that allow you to search through the user&#039;s financial data. Different from
         * the autocomplete endpoints, the search accepts more advanced arguments.
         */
        override fun search(): SearchService.WithRawResponse = search

        /**
         * These endpoints deliver summaries, like sums, lists of numbers and other processed
         * information. Mainly used for the main dashboard and pretty specific for Firefly III
         * itself.
         */
        override fun summary(): SummaryService.WithRawResponse = summary

        /** These endpoints deliver general system information, version- and meta information. */
        override fun about(): AboutService.WithRawResponse = about

        /** These endpoints deliver general system information, version- and meta information. */
        override fun batch(): BatchService.WithRawResponse = batch

        /**
         * These endpoints allow you to manage and update the Firefly III configuration. You need to
         * have the &quot;owner&quot; role to update configuration.
         */
        override fun configuration(): ConfigurationService.WithRawResponse = configuration

        /** These endpoints deliver general system information, version- and meta information. */
        override fun cron(): CronService.WithRawResponse = cron

        /**
         * Use these endpoints to manage the users registered within Firefly III. You need to have
         * the &quot;owner&quot; role to access these endpoints.
         */
        override fun users(): UserService.WithRawResponse = users

        /**
         * These endpoints can be used to manage the user&#039;s preferences, including some hidden
         * ones.
         */
        override fun preferences(): PreferenceService.WithRawResponse = preferences

        /**
         * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
         * necessary.
         */
        override fun webhooks(): WebhookService.WithRawResponse = webhooks
    }
}
