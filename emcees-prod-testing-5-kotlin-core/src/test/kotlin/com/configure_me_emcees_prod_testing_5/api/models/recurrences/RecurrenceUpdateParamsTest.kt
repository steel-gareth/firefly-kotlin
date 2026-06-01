// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.recurrences

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecurrenceUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = RecurrenceUpdateParams.builder().id("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = RecurrenceUpdateParams.builder().id("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.active()).isEqualTo(true)
        assertThat(body.applyRules()).isEqualTo(true)
        assertThat(body.description()).isEqualTo("Recurring transaction for the monthly rent")
        assertThat(body.firstDate()).isEqualTo(LocalDate.parse("2026-04-30"))
        assertThat(body.notes()).isEqualTo("Some notes")
        assertThat(body.nrOfRepetitions()).isEqualTo(5)
        assertThat(body.repeatUntil()).isEqualTo(LocalDate.parse("2026-04-30"))
        assertThat(body.repetitions())
            .containsExactly(
                RecurrenceUpdateParams.Repetition.builder()
                    .moment("3")
                    .skip(0)
                    .type(RecurrenceRepetitionType.WEEKLY)
                    .weekend(1)
                    .build()
            )
        assertThat(body.title()).isEqualTo("Rent")
        assertThat(body.transactions())
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RecurrenceUpdateParams.builder().id("123").build()

        val body = params._body()
    }
}
