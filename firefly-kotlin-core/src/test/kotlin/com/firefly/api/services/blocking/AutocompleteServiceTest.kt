// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.accounts.AccountTypeFilter
import com.firefly.api.models.autocomplete.AutocompleteListAccountsParams
import com.firefly.api.models.autocomplete.AutocompleteListBillsParams
import com.firefly.api.models.autocomplete.AutocompleteListBudgetsParams
import com.firefly.api.models.autocomplete.AutocompleteListCategoriesParams
import com.firefly.api.models.autocomplete.AutocompleteListCurrenciesParams
import com.firefly.api.models.autocomplete.AutocompleteListCurrenciesWithCodeParams
import com.firefly.api.models.autocomplete.AutocompleteListObjectGroupsParams
import com.firefly.api.models.autocomplete.AutocompleteListPiggyBanksParams
import com.firefly.api.models.autocomplete.AutocompleteListPiggyBanksWithBalanceParams
import com.firefly.api.models.autocomplete.AutocompleteListRecurringTransactionsParams
import com.firefly.api.models.autocomplete.AutocompleteListRuleGroupsParams
import com.firefly.api.models.autocomplete.AutocompleteListRulesParams
import com.firefly.api.models.autocomplete.AutocompleteListSubscriptionsParams
import com.firefly.api.models.autocomplete.AutocompleteListTagsParams
import com.firefly.api.models.autocomplete.AutocompleteListTransactionTypesParams
import com.firefly.api.models.autocomplete.AutocompleteListTransactionsParams
import com.firefly.api.models.autocomplete.AutocompleteListTransactionsWithIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AutocompleteServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAccounts() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listAccounts(
                AutocompleteListAccountsParams.builder()
                    .date("date")
                    .limit(0)
                    .query("query")
                    .addType(AccountTypeFilter.ALL)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBills() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val autocompleteBills =
            autocompleteService.listBills(
                AutocompleteListBillsParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        autocompleteBills.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBudgets() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listBudgets(
                AutocompleteListBudgetsParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCategories() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listCategories(
                AutocompleteListCategoriesParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCurrencies() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listCurrencies(
                AutocompleteListCurrenciesParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listCurrenciesWithCode() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listCurrenciesWithCode(
                AutocompleteListCurrenciesWithCodeParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listObjectGroups() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listObjectGroups(
                AutocompleteListObjectGroupsParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPiggyBanks() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listPiggyBanks(
                AutocompleteListPiggyBanksParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listPiggyBanksWithBalance() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listPiggyBanksWithBalance(
                AutocompleteListPiggyBanksWithBalanceParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRecurringTransactions() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listRecurringTransactions(
                AutocompleteListRecurringTransactionsParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRuleGroups() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listRuleGroups(
                AutocompleteListRuleGroupsParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRules() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listRules(
                AutocompleteListRulesParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSubscriptions() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val autocompleteBills =
            autocompleteService.listSubscriptions(
                AutocompleteListSubscriptionsParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        autocompleteBills.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTags() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listTags(
                AutocompleteListTagsParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTransactionTypes() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listTransactionTypes(
                AutocompleteListTransactionTypesParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTransactions() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listTransactions(
                AutocompleteListTransactionsParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTransactionsWithId() {
        val client = FireflyOkHttpClient.fromEnv()
        val autocompleteService = client.autocomplete()

        val response =
            autocompleteService.listTransactionsWithId(
                AutocompleteListTransactionsWithIdParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }
}
