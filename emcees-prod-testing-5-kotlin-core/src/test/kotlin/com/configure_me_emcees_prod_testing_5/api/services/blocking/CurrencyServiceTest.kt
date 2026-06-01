// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountTypeFilter
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionTypeFilter
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyDisableParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyEnableParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyListAccountsParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyListAvailableBudgetsParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyListBillsParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyListBudgetLimitsParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyListParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyListRecurrencesParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyListRulesParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.currencies.CurrencyUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CurrencyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val currencySingle =
            currencyService.create(
                CurrencyCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .code("AMS")
                    .name("Ankh-Morpork dollar")
                    .symbol("AM\$")
                    .decimalPlaces(2)
                    .enabled(true)
                    .primary(true)
                    .build()
            )

        currencySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val currencySingle =
            currencyService.retrieve(
                CurrencyRetrieveParams.builder()
                    .code("USD")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val currencySingle =
            currencyService.update(
                CurrencyUpdateParams.builder()
                    .pathCode("EUR")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .bodyCode("AMS")
                    .decimalPlaces(2)
                    .enabled(true)
                    .name("Ankh-Morpork dollar")
                    .primary(CurrencyUpdateParams.Primary.TRUE)
                    .symbol("AM\$")
                    .build()
            )

        currencySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val currencies =
            currencyService.list(
                CurrencyListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencies.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        currencyService.delete(
            CurrencyDeleteParams.builder()
                .code("GBP")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun disable() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val currencySingle =
            currencyService.disable(
                CurrencyDisableParams.builder()
                    .code("GBP")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enable() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val currencySingle =
            currencyService.enable(
                CurrencyEnableParams.builder()
                    .code("USD")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAccounts() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val accountArray =
            currencyService.listAccounts(
                CurrencyListAccountsParams.builder()
                    .code("USD")
                    .date(LocalDate.parse("2019-12-27"))
                    .limit(10)
                    .page(1)
                    .type(AccountTypeFilter.ALL)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        accountArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAvailableBudgets() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val availableBudgetArray =
            currencyService.listAvailableBudgets(
                CurrencyListAvailableBudgetsParams.builder()
                    .code("EUR")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        availableBudgetArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBills() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val billArray =
            currencyService.listBills(
                CurrencyListBillsParams.builder()
                    .code("USD")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        billArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBudgetLimits() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val budgetLimitArray =
            currencyService.listBudgetLimits(
                CurrencyListBudgetLimitsParams.builder()
                    .code("USD")
                    .end(LocalDate.parse("2026-04-30"))
                    .limit(10)
                    .page(1)
                    .start(LocalDate.parse("2026-04-01"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        budgetLimitArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRecurrences() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val recurrenceArray =
            currencyService.listRecurrences(
                CurrencyListRecurrencesParams.builder()
                    .code("EUR")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        recurrenceArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRules() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val ruleArray =
            currencyService.listRules(
                CurrencyListRulesParams.builder()
                    .code("USD")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        ruleArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTransactions() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val currencyService = client.currencies()

        val transactionArray =
            currencyService.listTransactions(
                CurrencyListTransactionsParams.builder()
                    .code("USD")
                    .end(LocalDate.parse("2026-04-30"))
                    .limit(10)
                    .page(1)
                    .start(LocalDate.parse("2026-04-01"))
                    .type(TransactionTypeFilter.ALL)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionArray.validate()
    }
}
