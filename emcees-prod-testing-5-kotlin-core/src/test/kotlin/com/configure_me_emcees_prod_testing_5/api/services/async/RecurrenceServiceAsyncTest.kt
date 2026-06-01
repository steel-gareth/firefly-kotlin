// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionTypeFilter
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceListParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceRepetitionType
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceTransactionType
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceTriggerTransactionParams
import com.configure_me_emcees_prod_testing_5.api.models.recurrences.RecurrenceUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RecurrenceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val recurrenceServiceAsync = client.recurrences()

        val recurrenceSingle =
            recurrenceServiceAsync.create(
                RecurrenceCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .firstDate(LocalDate.parse("2026-04-30"))
                    .repeatUntil(LocalDate.parse("2026-04-30"))
                    .addRepetition(
                        RecurrenceCreateParams.Repetition.builder()
                            .moment("3")
                            .type(RecurrenceRepetitionType.WEEKLY)
                            .skip(0)
                            .weekend(1)
                            .build()
                    )
                    .title("Rent")
                    .addTransaction(
                        RecurrenceCreateParams.Transaction.builder()
                            .amount("123.45")
                            .description("Rent for the current month")
                            .destinationId("258")
                            .sourceId("913")
                            .billId("123")
                            .budgetId("4")
                            .categoryId("211")
                            .currencyCode("EUR")
                            .currencyId("3")
                            .foreignAmount("123.45")
                            .foreignCurrencyCode("GBP")
                            .foreignCurrencyId("17")
                            .piggyBankId("123")
                            .addTag("Barbecue preparation")
                            .build()
                    )
                    .type(RecurrenceTransactionType.WITHDRAWAL)
                    .active(true)
                    .applyRules(true)
                    .description("Recurring transaction for the monthly rent")
                    .notes("Some notes")
                    .nrOfRepetitions(5)
                    .build()
            )

        recurrenceSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val recurrenceServiceAsync = client.recurrences()

        val recurrenceSingle =
            recurrenceServiceAsync.retrieve(
                RecurrenceRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        recurrenceSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val recurrenceServiceAsync = client.recurrences()

        val recurrenceSingle =
            recurrenceServiceAsync.update(
                RecurrenceUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .active(true)
                    .applyRules(true)
                    .description("Recurring transaction for the monthly rent")
                    .firstDate(LocalDate.parse("2026-04-30"))
                    .notes("Some notes")
                    .nrOfRepetitions(5)
                    .repeatUntil(LocalDate.parse("2026-04-30"))
                    .addRepetition(
                        RecurrenceUpdateParams.Repetition.builder()
                            .moment("3")
                            .skip(0)
                            .type(RecurrenceRepetitionType.WEEKLY)
                            .weekend(1)
                            .build()
                    )
                    .title("Rent")
                    .addTransaction(
                        RecurrenceUpdateParams.Transaction.builder()
                            .id(
                                "ID of the recurring transaction. Not to be confused with the ID of the recurrence itself. Is marked as REQUIRED but can be skipped when there is only ONE transaction."
                            )
                            .amount("123.45")
                            .billId("123")
                            .budgetId("4")
                            .categoryId("211")
                            .currencyCode("EUR")
                            .currencyId("3")
                            .description("Rent for the current month")
                            .destinationId("258")
                            .foreignAmount("123.45")
                            .foreignCurrencyId("17")
                            .piggyBankId("123")
                            .sourceId("913")
                            .addTag("Barbecue preparation")
                            .build()
                    )
                    .build()
            )

        recurrenceSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val recurrenceServiceAsync = client.recurrences()

        val recurrenceArray =
            recurrenceServiceAsync.list(
                RecurrenceListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        recurrenceArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val recurrenceServiceAsync = client.recurrences()

        recurrenceServiceAsync.delete(
            RecurrenceDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listTransactions() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val recurrenceServiceAsync = client.recurrences()

        val transactionArray =
            recurrenceServiceAsync.listTransactions(
                RecurrenceListTransactionsParams.builder()
                    .id("123")
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

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun triggerTransaction() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val recurrenceServiceAsync = client.recurrences()

        val transactionArray =
            recurrenceServiceAsync.triggerTransaction(
                RecurrenceTriggerTransactionParams.builder()
                    .id("123")
                    .date(LocalDate.parse("2019-12-27"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionArray.validate()
    }
}
