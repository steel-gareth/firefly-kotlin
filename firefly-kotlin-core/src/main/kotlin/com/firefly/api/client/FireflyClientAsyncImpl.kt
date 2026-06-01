// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.client

import com.firefly.api.core.ClientOptions
import com.firefly.api.core.getPackageVersion
import com.firefly.api.services.async.AboutServiceAsync
import com.firefly.api.services.async.AboutServiceAsyncImpl
import com.firefly.api.services.async.AccountServiceAsync
import com.firefly.api.services.async.AccountServiceAsyncImpl
import com.firefly.api.services.async.AttachmentServiceAsync
import com.firefly.api.services.async.AttachmentServiceAsyncImpl
import com.firefly.api.services.async.AutocompleteServiceAsync
import com.firefly.api.services.async.AutocompleteServiceAsyncImpl
import com.firefly.api.services.async.AvailableBudgetServiceAsync
import com.firefly.api.services.async.AvailableBudgetServiceAsyncImpl
import com.firefly.api.services.async.BatchServiceAsync
import com.firefly.api.services.async.BatchServiceAsyncImpl
import com.firefly.api.services.async.BillServiceAsync
import com.firefly.api.services.async.BillServiceAsyncImpl
import com.firefly.api.services.async.BudgetServiceAsync
import com.firefly.api.services.async.BudgetServiceAsyncImpl
import com.firefly.api.services.async.CategoryServiceAsync
import com.firefly.api.services.async.CategoryServiceAsyncImpl
import com.firefly.api.services.async.ChartServiceAsync
import com.firefly.api.services.async.ChartServiceAsyncImpl
import com.firefly.api.services.async.ConfigurationServiceAsync
import com.firefly.api.services.async.ConfigurationServiceAsyncImpl
import com.firefly.api.services.async.CronServiceAsync
import com.firefly.api.services.async.CronServiceAsyncImpl
import com.firefly.api.services.async.CurrencyServiceAsync
import com.firefly.api.services.async.CurrencyServiceAsyncImpl
import com.firefly.api.services.async.DataServiceAsync
import com.firefly.api.services.async.DataServiceAsyncImpl
import com.firefly.api.services.async.ExchangeRateServiceAsync
import com.firefly.api.services.async.ExchangeRateServiceAsyncImpl
import com.firefly.api.services.async.InsightServiceAsync
import com.firefly.api.services.async.InsightServiceAsyncImpl
import com.firefly.api.services.async.LinkTypeServiceAsync
import com.firefly.api.services.async.LinkTypeServiceAsyncImpl
import com.firefly.api.services.async.ObjectGroupServiceAsync
import com.firefly.api.services.async.ObjectGroupServiceAsyncImpl
import com.firefly.api.services.async.PiggyBankServiceAsync
import com.firefly.api.services.async.PiggyBankServiceAsyncImpl
import com.firefly.api.services.async.PreferenceServiceAsync
import com.firefly.api.services.async.PreferenceServiceAsyncImpl
import com.firefly.api.services.async.RecurrenceServiceAsync
import com.firefly.api.services.async.RecurrenceServiceAsyncImpl
import com.firefly.api.services.async.RuleGroupServiceAsync
import com.firefly.api.services.async.RuleGroupServiceAsyncImpl
import com.firefly.api.services.async.RuleServiceAsync
import com.firefly.api.services.async.RuleServiceAsyncImpl
import com.firefly.api.services.async.SearchServiceAsync
import com.firefly.api.services.async.SearchServiceAsyncImpl
import com.firefly.api.services.async.SummaryServiceAsync
import com.firefly.api.services.async.SummaryServiceAsyncImpl
import com.firefly.api.services.async.TagServiceAsync
import com.firefly.api.services.async.TagServiceAsyncImpl
import com.firefly.api.services.async.TransactionJournalServiceAsync
import com.firefly.api.services.async.TransactionJournalServiceAsyncImpl
import com.firefly.api.services.async.TransactionLinkServiceAsync
import com.firefly.api.services.async.TransactionLinkServiceAsyncImpl
import com.firefly.api.services.async.TransactionServiceAsync
import com.firefly.api.services.async.TransactionServiceAsyncImpl
import com.firefly.api.services.async.UserGroupServiceAsync
import com.firefly.api.services.async.UserGroupServiceAsyncImpl
import com.firefly.api.services.async.UserServiceAsync
import com.firefly.api.services.async.UserServiceAsyncImpl
import com.firefly.api.services.async.WebhookServiceAsync
import com.firefly.api.services.async.WebhookServiceAsyncImpl

class FireflyClientAsyncImpl(private val clientOptions: ClientOptions) : FireflyClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: FireflyClient by lazy { FireflyClientImpl(clientOptions) }

    private val withRawResponse: FireflyClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val autocomplete: AutocompleteServiceAsync by lazy {
        AutocompleteServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val chart: ChartServiceAsync by lazy {
        ChartServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val data: DataServiceAsync by lazy { DataServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val insight: InsightServiceAsync by lazy {
        InsightServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accounts: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val attachments: AttachmentServiceAsync by lazy {
        AttachmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val availableBudgets: AvailableBudgetServiceAsync by lazy {
        AvailableBudgetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bills: BillServiceAsync by lazy { BillServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val budgets: BudgetServiceAsync by lazy {
        BudgetServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val categories: CategoryServiceAsync by lazy {
        CategoryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val exchangeRates: ExchangeRateServiceAsync by lazy {
        ExchangeRateServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val linkTypes: LinkTypeServiceAsync by lazy {
        LinkTypeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transactionLinks: TransactionLinkServiceAsync by lazy {
        TransactionLinkServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val objectGroups: ObjectGroupServiceAsync by lazy {
        ObjectGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val piggyBanks: PiggyBankServiceAsync by lazy {
        PiggyBankServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val recurrences: RecurrenceServiceAsync by lazy {
        RecurrenceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ruleGroups: RuleGroupServiceAsync by lazy {
        RuleGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val rules: RuleServiceAsync by lazy { RuleServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val tags: TagServiceAsync by lazy { TagServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val currencies: CurrencyServiceAsync by lazy {
        CurrencyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transactionJournals: TransactionJournalServiceAsync by lazy {
        TransactionJournalServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val userGroups: UserGroupServiceAsync by lazy {
        UserGroupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val search: SearchServiceAsync by lazy {
        SearchServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val summary: SummaryServiceAsync by lazy {
        SummaryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val about: AboutServiceAsync by lazy {
        AboutServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val batch: BatchServiceAsync by lazy {
        BatchServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val configuration: ConfigurationServiceAsync by lazy {
        ConfigurationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cron: CronServiceAsync by lazy { CronServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val preferences: PreferenceServiceAsync by lazy {
        PreferenceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): FireflyClient = sync

    override fun withRawResponse(): FireflyClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FireflyClientAsync =
        FireflyClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /**
     * Auto-complete endpoints show basic information about Firefly III models, like the name and
     * maybe some amounts. They all support a search query and can be used to autocomplete data in
     * forms. Autocomplete return values always have a &quot;name&quot;-field.
     */
    override fun autocomplete(): AutocompleteServiceAsync = autocomplete

    override fun chart(): ChartServiceAsync = chart

    /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
    override fun data(): DataServiceAsync = data

    override fun insight(): InsightServiceAsync = insight

    /**
     * Endpoints that deliver all of the user&#039;s asset, expense and other accounts (and the
     * metadata) together with related transactions, piggy banks and other objects. Also delivers
     * endpoints for CRUD operations for accounts.
     */
    override fun accounts(): AccountServiceAsync = accounts

    /**
     * Endpoints to manage the attachments of the authenticated user, including up- and downloading
     * of the files.
     */
    override fun attachments(): AttachmentServiceAsync = attachments

    /**
     * Endpoints to manage the total available amount that the user has made available to
     * themselves. Used in periodic budgeting.
     */
    override fun availableBudgets(): AvailableBudgetServiceAsync = availableBudgets

    /** Endpoints to manage a user&#039;s bills and all related objects. */
    override fun bills(): BillServiceAsync = bills

    /**
     * Endpoints to manage a user&#039;s budgets and get info on the related objects, like limits.
     */
    override fun budgets(): BudgetServiceAsync = budgets

    /**
     * Endpoints to manage a user&#039;s categories and get information on transactions and other
     * related objects.
     */
    override fun categories(): CategoryServiceAsync = categories

    /** All currency exchange rates. */
    override fun exchangeRates(): ExchangeRateServiceAsync = exchangeRates

    /** Endpoints to manage links between transactions, and manage the type of links available. */
    override fun linkTypes(): LinkTypeServiceAsync = linkTypes

    /** Endpoints to manage links between transactions, and manage the type of links available. */
    override fun transactionLinks(): TransactionLinkServiceAsync = transactionLinks

    /**
     * Endpoints to control and manage all of the user&#039;s object groups. Can only be created in
     * conjunction with another object (for example a piggy bank) and will auto-delete when no other
     * items are linked to it.
     */
    override fun objectGroups(): ObjectGroupServiceAsync = objectGroups

    /**
     * Endpoints to control and manage all of the user&#039;s piggy banks and related objects and
     * information.
     */
    override fun piggyBanks(): PiggyBankServiceAsync = piggyBanks

    /**
     * Use these endpoints to manage the user&#039;s recurring transactions, trigger the creation of
     * transactions and manage the settings.
     */
    override fun recurrences(): RecurrenceServiceAsync = recurrences

    /** Manage all of the user&#039;s groups of rules and trigger the execution of entire groups. */
    override fun ruleGroups(): RuleGroupServiceAsync = ruleGroups

    /**
     * These endpoints can be used to manage all of the user&#039;s rules. Also includes triggers to
     * execute or test rules and individual triggers.
     */
    override fun rules(): RuleServiceAsync = rules

    /** This endpoint manages all of the user&#039;s tags. */
    override fun tags(): TagServiceAsync = tags

    /**
     * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you can
     * also disable and enable them, or add new ones.
     */
    override fun currencies(): CurrencyServiceAsync = currencies

    /**
     * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
     * transactions.
     */
    override fun transactionJournals(): TransactionJournalServiceAsync = transactionJournals

    /**
     * The most-used endpoints in Firefly III, these endpoints are used to manage the user&#039;s
     * transactions.
     */
    override fun transactions(): TransactionServiceAsync = transactions

    /** User groups are the objects around which &quot;financial administrations&quot; are built. */
    override fun userGroups(): UserGroupServiceAsync = userGroups

    /**
     * Endpoints that allow you to search through the user&#039;s financial data. Different from the
     * autocomplete endpoints, the search accepts more advanced arguments.
     */
    override fun search(): SearchServiceAsync = search

    /**
     * These endpoints deliver summaries, like sums, lists of numbers and other processed
     * information. Mainly used for the main dashboard and pretty specific for Firefly III itself.
     */
    override fun summary(): SummaryServiceAsync = summary

    /** These endpoints deliver general system information, version- and meta information. */
    override fun about(): AboutServiceAsync = about

    /** These endpoints deliver general system information, version- and meta information. */
    override fun batch(): BatchServiceAsync = batch

    /**
     * These endpoints allow you to manage and update the Firefly III configuration. You need to
     * have the &quot;owner&quot; role to update configuration.
     */
    override fun configuration(): ConfigurationServiceAsync = configuration

    /** These endpoints deliver general system information, version- and meta information. */
    override fun cron(): CronServiceAsync = cron

    /**
     * Use these endpoints to manage the users registered within Firefly III. You need to have the
     * &quot;owner&quot; role to access these endpoints.
     */
    override fun users(): UserServiceAsync = users

    /**
     * These endpoints can be used to manage the user&#039;s preferences, including some hidden
     * ones.
     */
    override fun preferences(): PreferenceServiceAsync = preferences

    /**
     * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
     * necessary.
     */
    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FireflyClientAsync.WithRawResponse {

        private val autocomplete: AutocompleteServiceAsync.WithRawResponse by lazy {
            AutocompleteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chart: ChartServiceAsync.WithRawResponse by lazy {
            ChartServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val data: DataServiceAsync.WithRawResponse by lazy {
            DataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val insight: InsightServiceAsync.WithRawResponse by lazy {
            InsightServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val accounts: AccountServiceAsync.WithRawResponse by lazy {
            AccountServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val attachments: AttachmentServiceAsync.WithRawResponse by lazy {
            AttachmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val availableBudgets: AvailableBudgetServiceAsync.WithRawResponse by lazy {
            AvailableBudgetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val bills: BillServiceAsync.WithRawResponse by lazy {
            BillServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val budgets: BudgetServiceAsync.WithRawResponse by lazy {
            BudgetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val categories: CategoryServiceAsync.WithRawResponse by lazy {
            CategoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val exchangeRates: ExchangeRateServiceAsync.WithRawResponse by lazy {
            ExchangeRateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkTypes: LinkTypeServiceAsync.WithRawResponse by lazy {
            LinkTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactionLinks: TransactionLinkServiceAsync.WithRawResponse by lazy {
            TransactionLinkServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val objectGroups: ObjectGroupServiceAsync.WithRawResponse by lazy {
            ObjectGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val piggyBanks: PiggyBankServiceAsync.WithRawResponse by lazy {
            PiggyBankServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val recurrences: RecurrenceServiceAsync.WithRawResponse by lazy {
            RecurrenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ruleGroups: RuleGroupServiceAsync.WithRawResponse by lazy {
            RuleGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val rules: RuleServiceAsync.WithRawResponse by lazy {
            RuleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val tags: TagServiceAsync.WithRawResponse by lazy {
            TagServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val currencies: CurrencyServiceAsync.WithRawResponse by lazy {
            CurrencyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactionJournals: TransactionJournalServiceAsync.WithRawResponse by lazy {
            TransactionJournalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionServiceAsync.WithRawResponse by lazy {
            TransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val userGroups: UserGroupServiceAsync.WithRawResponse by lazy {
            UserGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val search: SearchServiceAsync.WithRawResponse by lazy {
            SearchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val summary: SummaryServiceAsync.WithRawResponse by lazy {
            SummaryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val about: AboutServiceAsync.WithRawResponse by lazy {
            AboutServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val configuration: ConfigurationServiceAsync.WithRawResponse by lazy {
            ConfigurationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val cron: CronServiceAsync.WithRawResponse by lazy {
            CronServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val preferences: PreferenceServiceAsync.WithRawResponse by lazy {
            PreferenceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FireflyClientAsync.WithRawResponse =
            FireflyClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /**
         * Auto-complete endpoints show basic information about Firefly III models, like the name
         * and maybe some amounts. They all support a search query and can be used to autocomplete
         * data in forms. Autocomplete return values always have a &quot;name&quot;-field.
         */
        override fun autocomplete(): AutocompleteServiceAsync.WithRawResponse = autocomplete

        override fun chart(): ChartServiceAsync.WithRawResponse = chart

        /** The &quot;data&quot;-endpoints manage generic Firefly III and user-specific data. */
        override fun data(): DataServiceAsync.WithRawResponse = data

        override fun insight(): InsightServiceAsync.WithRawResponse = insight

        /**
         * Endpoints that deliver all of the user&#039;s asset, expense and other accounts (and the
         * metadata) together with related transactions, piggy banks and other objects. Also
         * delivers endpoints for CRUD operations for accounts.
         */
        override fun accounts(): AccountServiceAsync.WithRawResponse = accounts

        /**
         * Endpoints to manage the attachments of the authenticated user, including up- and
         * downloading of the files.
         */
        override fun attachments(): AttachmentServiceAsync.WithRawResponse = attachments

        /**
         * Endpoints to manage the total available amount that the user has made available to
         * themselves. Used in periodic budgeting.
         */
        override fun availableBudgets(): AvailableBudgetServiceAsync.WithRawResponse =
            availableBudgets

        /** Endpoints to manage a user&#039;s bills and all related objects. */
        override fun bills(): BillServiceAsync.WithRawResponse = bills

        /**
         * Endpoints to manage a user&#039;s budgets and get info on the related objects, like
         * limits.
         */
        override fun budgets(): BudgetServiceAsync.WithRawResponse = budgets

        /**
         * Endpoints to manage a user&#039;s categories and get information on transactions and
         * other related objects.
         */
        override fun categories(): CategoryServiceAsync.WithRawResponse = categories

        /** All currency exchange rates. */
        override fun exchangeRates(): ExchangeRateServiceAsync.WithRawResponse = exchangeRates

        /**
         * Endpoints to manage links between transactions, and manage the type of links available.
         */
        override fun linkTypes(): LinkTypeServiceAsync.WithRawResponse = linkTypes

        /**
         * Endpoints to manage links between transactions, and manage the type of links available.
         */
        override fun transactionLinks(): TransactionLinkServiceAsync.WithRawResponse =
            transactionLinks

        /**
         * Endpoints to control and manage all of the user&#039;s object groups. Can only be created
         * in conjunction with another object (for example a piggy bank) and will auto-delete when
         * no other items are linked to it.
         */
        override fun objectGroups(): ObjectGroupServiceAsync.WithRawResponse = objectGroups

        /**
         * Endpoints to control and manage all of the user&#039;s piggy banks and related objects
         * and information.
         */
        override fun piggyBanks(): PiggyBankServiceAsync.WithRawResponse = piggyBanks

        /**
         * Use these endpoints to manage the user&#039;s recurring transactions, trigger the
         * creation of transactions and manage the settings.
         */
        override fun recurrences(): RecurrenceServiceAsync.WithRawResponse = recurrences

        /**
         * Manage all of the user&#039;s groups of rules and trigger the execution of entire groups.
         */
        override fun ruleGroups(): RuleGroupServiceAsync.WithRawResponse = ruleGroups

        /**
         * These endpoints can be used to manage all of the user&#039;s rules. Also includes
         * triggers to execute or test rules and individual triggers.
         */
        override fun rules(): RuleServiceAsync.WithRawResponse = rules

        /** This endpoint manages all of the user&#039;s tags. */
        override fun tags(): TagServiceAsync.WithRawResponse = tags

        /**
         * Endpoints to manage the currencies in Firefly III. Depending on the user&#039;s role you
         * can also disable and enable them, or add new ones.
         */
        override fun currencies(): CurrencyServiceAsync.WithRawResponse = currencies

        /**
         * The most-used endpoints in Firefly III, these endpoints are used to manage the
         * user&#039;s transactions.
         */
        override fun transactionJournals(): TransactionJournalServiceAsync.WithRawResponse =
            transactionJournals

        /**
         * The most-used endpoints in Firefly III, these endpoints are used to manage the
         * user&#039;s transactions.
         */
        override fun transactions(): TransactionServiceAsync.WithRawResponse = transactions

        /**
         * User groups are the objects around which &quot;financial administrations&quot; are built.
         */
        override fun userGroups(): UserGroupServiceAsync.WithRawResponse = userGroups

        /**
         * Endpoints that allow you to search through the user&#039;s financial data. Different from
         * the autocomplete endpoints, the search accepts more advanced arguments.
         */
        override fun search(): SearchServiceAsync.WithRawResponse = search

        /**
         * These endpoints deliver summaries, like sums, lists of numbers and other processed
         * information. Mainly used for the main dashboard and pretty specific for Firefly III
         * itself.
         */
        override fun summary(): SummaryServiceAsync.WithRawResponse = summary

        /** These endpoints deliver general system information, version- and meta information. */
        override fun about(): AboutServiceAsync.WithRawResponse = about

        /** These endpoints deliver general system information, version- and meta information. */
        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        /**
         * These endpoints allow you to manage and update the Firefly III configuration. You need to
         * have the &quot;owner&quot; role to update configuration.
         */
        override fun configuration(): ConfigurationServiceAsync.WithRawResponse = configuration

        /** These endpoints deliver general system information, version- and meta information. */
        override fun cron(): CronServiceAsync.WithRawResponse = cron

        /**
         * Use these endpoints to manage the users registered within Firefly III. You need to have
         * the &quot;owner&quot; role to access these endpoints.
         */
        override fun users(): UserServiceAsync.WithRawResponse = users

        /**
         * These endpoints can be used to manage the user&#039;s preferences, including some hidden
         * ones.
         */
        override fun preferences(): PreferenceServiceAsync.WithRawResponse = preferences

        /**
         * These endpoints can be used to manage the user&#039;s webhooks and triggers them if
         * necessary.
         */
        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks
    }
}
