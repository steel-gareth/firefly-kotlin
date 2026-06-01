// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.piggybanks

import com.firefly.api.core.JsonValue
import com.firefly.api.core.http.Headers
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PiggyBankUpdateParamsTest {

    @Test
    fun create() {
        PiggyBankUpdateParams.builder()
            .id("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .addAccount(
                PiggyBankUpdateParams.Account.builder()
                    .id(JsonValue.from(mapOf<String, Any>()))
                    .accountId("3")
                    .currentAmount("123.45")
                    .name("Checking account")
                    .build()
            )
            .name("New digital camera")
            .notes("Some notes")
            .objectGroupId("5")
            .objectGroupTitle("Example Group")
            .order(5)
            .startDate(LocalDate.parse("2026-04-01"))
            .targetAmount("123.45")
            .targetDate(LocalDate.parse("2026-04-30"))
            .build()
    }

    @Test
    fun pathParams() {
        val params = PiggyBankUpdateParams.builder().id("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            PiggyBankUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .addAccount(
                    PiggyBankUpdateParams.Account.builder()
                        .id(JsonValue.from(mapOf<String, Any>()))
                        .accountId("3")
                        .currentAmount("123.45")
                        .name("Checking account")
                        .build()
                )
                .name("New digital camera")
                .notes("Some notes")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .order(5)
                .startDate(LocalDate.parse("2026-04-01"))
                .targetAmount("123.45")
                .targetDate(LocalDate.parse("2026-04-30"))
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = PiggyBankUpdateParams.builder().id("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            PiggyBankUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .addAccount(
                    PiggyBankUpdateParams.Account.builder()
                        .id(JsonValue.from(mapOf<String, Any>()))
                        .accountId("3")
                        .currentAmount("123.45")
                        .name("Checking account")
                        .build()
                )
                .name("New digital camera")
                .notes("Some notes")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .order(5)
                .startDate(LocalDate.parse("2026-04-01"))
                .targetAmount("123.45")
                .targetDate(LocalDate.parse("2026-04-30"))
                .build()

        val body = params._body()

        assertThat(body.accounts())
            .containsExactly(
                PiggyBankUpdateParams.Account.builder()
                    .id(JsonValue.from(mapOf<String, Any>()))
                    .accountId("3")
                    .currentAmount("123.45")
                    .name("Checking account")
                    .build()
            )
        assertThat(body.name()).isEqualTo("New digital camera")
        assertThat(body.notes()).isEqualTo("Some notes")
        assertThat(body.objectGroupId()).isEqualTo("5")
        assertThat(body.objectGroupTitle()).isEqualTo("Example Group")
        assertThat(body.order()).isEqualTo(5)
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2026-04-01"))
        assertThat(body.targetAmount()).isEqualTo("123.45")
        assertThat(body.targetDate()).isEqualTo(LocalDate.parse("2026-04-30"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PiggyBankUpdateParams.builder().id("123").build()

        val body = params._body()
    }
}
