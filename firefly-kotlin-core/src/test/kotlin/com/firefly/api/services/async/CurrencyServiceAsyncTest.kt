// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.models.accounts.AccountTypeFilter
import com.firefly.api.models.accounts.TransactionTypeFilter
import com.firefly.api.models.currencies.CurrencyCreateParams
import com.firefly.api.models.currencies.CurrencyDeleteParams
import com.firefly.api.models.currencies.CurrencyDisableParams
import com.firefly.api.models.currencies.CurrencyEnableParams
import com.firefly.api.models.currencies.CurrencyListAccountsParams
import com.firefly.api.models.currencies.CurrencyListAvailableBudgetsParams
import com.firefly.api.models.currencies.CurrencyListBillsParams
import com.firefly.api.models.currencies.CurrencyListBudgetLimitsParams
import com.firefly.api.models.currencies.CurrencyListParams
import com.firefly.api.models.currencies.CurrencyListRecurrencesParams
import com.firefly.api.models.currencies.CurrencyListRulesParams
import com.firefly.api.models.currencies.CurrencyListTransactionsParams
import com.firefly.api.models.currencies.CurrencyRetrieveParams
import com.firefly.api.models.currencies.CurrencyUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CurrencyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val currencySingle =
            currencyServiceAsync.create(
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
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val currencySingle =
            currencyServiceAsync.retrieve(
                CurrencyRetrieveParams.builder()
                    .code("USD")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val currencySingle =
            currencyServiceAsync.update(
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
    suspend fun list() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val currencies =
            currencyServiceAsync.list(
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
    suspend fun delete() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        currencyServiceAsync.delete(
            CurrencyDeleteParams.builder()
                .code("GBP")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun disable() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val currencySingle =
            currencyServiceAsync.disable(
                CurrencyDisableParams.builder()
                    .code("GBP")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun enable() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val currencySingle =
            currencyServiceAsync.enable(
                CurrencyEnableParams.builder()
                    .code("USD")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencySingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listAccounts() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val accountArray =
            currencyServiceAsync.listAccounts(
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
    suspend fun listAvailableBudgets() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val availableBudgetArray =
            currencyServiceAsync.listAvailableBudgets(
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
    suspend fun listBills() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val billArray =
            currencyServiceAsync.listBills(
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
    suspend fun listBudgetLimits() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val budgetLimitArray =
            currencyServiceAsync.listBudgetLimits(
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
    suspend fun listRecurrences() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val recurrenceArray =
            currencyServiceAsync.listRecurrences(
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
    suspend fun listRules() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val ruleArray =
            currencyServiceAsync.listRules(
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
    suspend fun listTransactions() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val currencyServiceAsync = client.currencies()

        val transactionArray =
            currencyServiceAsync.listTransactions(
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
