// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.bills

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillUpdateParamsTest {

    @Test
    fun create() {
        BillUpdateParams.builder()
            .id("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .name("Rent")
            .active(true)
            .amountMax("123.45")
            .amountMin("123.45")
            .currencyCode("EUR")
            .currencyId("5")
            .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
            .endDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
            .extensionDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
            .notes("Some example notes")
            .objectGroupId("5")
            .objectGroupTitle("Example Group")
            .repeatFreq(BillRepeatFrequency.MONTHLY)
            .skip(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params = BillUpdateParams.builder().id("123").name("Rent").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            BillUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .name("Rent")
                .active(true)
                .amountMax("123.45")
                .amountMin("123.45")
                .currencyCode("EUR")
                .currencyId("5")
                .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .endDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .extensionDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .notes("Some example notes")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .repeatFreq(BillRepeatFrequency.MONTHLY)
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
        val params = BillUpdateParams.builder().id("123").name("Rent").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            BillUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .name("Rent")
                .active(true)
                .amountMax("123.45")
                .amountMin("123.45")
                .currencyCode("EUR")
                .currencyId("5")
                .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .endDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .extensionDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .notes("Some example notes")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .repeatFreq(BillRepeatFrequency.MONTHLY)
                .skip(0)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Rent")
        assertThat(body.active()).isEqualTo(true)
        assertThat(body.amountMax()).isEqualTo("123.45")
        assertThat(body.amountMin()).isEqualTo("123.45")
        assertThat(body.currencyCode()).isEqualTo("EUR")
        assertThat(body.currencyId()).isEqualTo("5")
        assertThat(body.date()).isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
        assertThat(body.extensionDate())
            .isEqualTo(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
        assertThat(body.notes()).isEqualTo("Some example notes")
        assertThat(body.objectGroupId()).isEqualTo("5")
        assertThat(body.objectGroupTitle()).isEqualTo("Example Group")
        assertThat(body.repeatFreq()).isEqualTo(BillRepeatFrequency.MONTHLY)
        assertThat(body.skip()).isEqualTo(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BillUpdateParams.builder().id("123").name("Rent").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Rent")
    }
}
