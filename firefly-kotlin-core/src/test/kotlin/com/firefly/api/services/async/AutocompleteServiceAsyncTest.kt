// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
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

internal class AutocompleteServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listAccounts() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listAccounts(
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
    suspend fun listBills() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val autocompleteBills =
            autocompleteServiceAsync.listBills(
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
    suspend fun listBudgets() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listBudgets(
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
    suspend fun listCategories() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listCategories(
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
    suspend fun listCurrencies() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listCurrencies(
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
    suspend fun listCurrenciesWithCode() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listCurrenciesWithCode(
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
    suspend fun listObjectGroups() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listObjectGroups(
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
    suspend fun listPiggyBanks() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listPiggyBanks(
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
    suspend fun listPiggyBanksWithBalance() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listPiggyBanksWithBalance(
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
    suspend fun listRecurringTransactions() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listRecurringTransactions(
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
    suspend fun listRuleGroups() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listRuleGroups(
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
    suspend fun listRules() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listRules(
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
    suspend fun listSubscriptions() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val autocompleteBills =
            autocompleteServiceAsync.listSubscriptions(
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
    suspend fun listTags() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listTags(
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
    suspend fun listTransactionTypes() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listTransactionTypes(
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
    suspend fun listTransactions() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listTransactions(
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
    suspend fun listTransactionsWithId() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val autocompleteServiceAsync = client.autocomplete()

        val response =
            autocompleteServiceAsync.listTransactionsWithId(
                AutocompleteListTransactionsWithIdParams.builder()
                    .limit(0)
                    .query("query")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        response.forEach { it.validate() }
    }
}
