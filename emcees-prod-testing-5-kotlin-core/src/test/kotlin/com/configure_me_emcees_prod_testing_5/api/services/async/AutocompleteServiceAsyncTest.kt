// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountTypeFilter
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListAccountsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListBillsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListBudgetsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListCategoriesParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListCurrenciesParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListCurrenciesWithCodeParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListObjectGroupsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListPiggyBanksParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListPiggyBanksWithBalanceParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListRecurringTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListRuleGroupsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListRulesParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListSubscriptionsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTagsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTransactionTypesParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.autocomplete.AutocompleteListTransactionsWithIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AutocompleteServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listAccounts() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
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
