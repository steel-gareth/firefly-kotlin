// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.recurrences

import com.firefly.api.core.http.Headers
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecurrenceCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            RecurrenceCreateParams.builder()
                .firstDate(LocalDate.parse("2026-04-30"))
                .repeatUntil(LocalDate.parse("2026-04-30"))
                .addRepetition(
                    RecurrenceCreateParams.Repetition.builder()
                        .moment("3")
                        .type(RecurrenceRepetitionType.WEEKLY)
                        .build()
                )
                .title("Rent")
                .addTransaction(
                    RecurrenceCreateParams.Transaction.builder()
                        .amount("123.45")
                        .description("Rent for the current month")
                        .destinationId("258")
                        .sourceId("913")
                        .build()
                )
                .type(RecurrenceTransactionType.WITHDRAWAL)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.firstDate()).isEqualTo(LocalDate.parse("2026-04-30"))
        assertThat(body.repeatUntil()).isEqualTo(LocalDate.parse("2026-04-30"))
        assertThat(body.repetitions())
            .containsExactly(
                RecurrenceCreateParams.Repetition.builder()
                    .moment("3")
                    .type(RecurrenceRepetitionType.WEEKLY)
                    .skip(0)
                    .weekend(1)
                    .build()
            )
        assertThat(body.title()).isEqualTo("Rent")
        assertThat(body.transactions())
            .containsExactly(
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
        assertThat(body.type()).isEqualTo(RecurrenceTransactionType.WITHDRAWAL)
        assertThat(body.active()).isEqualTo(true)
        assertThat(body.applyRules()).isEqualTo(true)
        assertThat(body.description()).isEqualTo("Recurring transaction for the monthly rent")
        assertThat(body.notes()).isEqualTo("Some notes")
        assertThat(body.nrOfRepetitions()).isEqualTo(5)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RecurrenceCreateParams.builder()
                .firstDate(LocalDate.parse("2026-04-30"))
                .repeatUntil(LocalDate.parse("2026-04-30"))
                .addRepetition(
                    RecurrenceCreateParams.Repetition.builder()
                        .moment("3")
                        .type(RecurrenceRepetitionType.WEEKLY)
                        .build()
                )
                .title("Rent")
                .addTransaction(
                    RecurrenceCreateParams.Transaction.builder()
                        .amount("123.45")
                        .description("Rent for the current month")
                        .destinationId("258")
                        .sourceId("913")
                        .build()
                )
                .type(RecurrenceTransactionType.WITHDRAWAL)
                .build()

        val body = params._body()

        assertThat(body.firstDate()).isEqualTo(LocalDate.parse("2026-04-30"))
        assertThat(body.repeatUntil()).isEqualTo(LocalDate.parse("2026-04-30"))
        assertThat(body.repetitions())
            .containsExactly(
                RecurrenceCreateParams.Repetition.builder()
                    .moment("3")
                    .type(RecurrenceRepetitionType.WEEKLY)
                    .build()
            )
        assertThat(body.title()).isEqualTo("Rent")
        assertThat(body.transactions())
            .containsExactly(
                RecurrenceCreateParams.Transaction.builder()
                    .amount("123.45")
                    .description("Rent for the current month")
                    .destinationId("258")
                    .sourceId("913")
                    .build()
            )
        assertThat(body.type()).isEqualTo(RecurrenceTransactionType.WITHDRAWAL)
    }
}
