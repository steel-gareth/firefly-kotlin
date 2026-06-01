// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.bills

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillCreateParamsTest {

    @Test
    fun create() {
        BillCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .amountMax("123.45")
            .amountMin("123.45")
            .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
            .name("Rent")
            .repeatFreq(BillRepeatFrequency.MONTHLY)
            .active(true)
            .currencyCode("EUR")
            .currencyId("5")
            .endDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
            .extensionDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
            .notes("Some example notes")
            .objectGroupId("5")
            .objectGroupTitle("Example Group")
            .skip(0)
            .build()
    }

    @Test
    fun headers() {
        val params =
            BillCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .amountMax("123.45")
                .amountMin("123.45")
                .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .name("Rent")
                .repeatFreq(BillRepeatFrequency.MONTHLY)
                .active(true)
                .currencyCode("EUR")
                .currencyId("5")
                .endDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .extensionDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .notes("Some example notes")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .skip(0)
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
            BillCreateParams.builder()
                .amountMax("123.45")
                .amountMin("123.45")
                .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .name("Rent")
                .repeatFreq(BillRepeatFrequency.MONTHLY)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            BillCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .amountMax("123.45")
                .amountMin("123.45")
                .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .name("Rent")
                .repeatFreq(BillRepeatFrequency.MONTHLY)
                .active(true)
                .currencyCode("EUR")
                .currencyId("5")
                .endDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .extensionDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .notes("Some example notes")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .skip(0)
                .build()

        val body = params._body()

        assertThat(body.amountMax()).isEqualTo("123.45")
        assertThat(body.amountMin()).isEqualTo("123.45")
        assertThat(body.date()).isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
        assertThat(body.name()).isEqualTo("Rent")
        assertThat(body.repeatFreq()).isEqualTo(BillRepeatFrequency.MONTHLY)
        assertThat(body.active()).isEqualTo(true)
        assertThat(body.currencyCode()).isEqualTo("EUR")
        assertThat(body.currencyId()).isEqualTo("5")
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
        assertThat(body.extensionDate())
            .isEqualTo(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
        assertThat(body.notes()).isEqualTo("Some example notes")
        assertThat(body.objectGroupId()).isEqualTo("5")
        assertThat(body.objectGroupTitle()).isEqualTo("Example Group")
        assertThat(body.skip()).isEqualTo(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BillCreateParams.builder()
                .amountMax("123.45")
                .amountMin("123.45")
                .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .name("Rent")
                .repeatFreq(BillRepeatFrequency.MONTHLY)
                .build()

        val body = params._body()

        assertThat(body.amountMax()).isEqualTo("123.45")
        assertThat(body.amountMin()).isEqualTo("123.45")
        assertThat(body.date()).isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
        assertThat(body.name()).isEqualTo("Rent")
        assertThat(body.repeatFreq()).isEqualTo(BillRepeatFrequency.MONTHLY)
    }
}
