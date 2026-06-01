// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.piggybanks

import com.firefly.api.core.JsonValue
import com.firefly.api.core.http.Headers
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PiggyBankCreateParamsTest {

    @Test
    fun create() {
        PiggyBankCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .accountId(JsonValue.from(mapOf<String, Any>()))
            .name("New digital camera")
            .startDate(LocalDate.parse("2026-04-01"))
            .targetAmount("123.45")
            .addAccount(
                PiggyBankCreateParams.Account.builder()
                    .id("3")
                    .currentAmount("123.45")
                    .name("Checking account")
                    .build()
            )
            .currentAmount("123.45")
            .notes("Some notes")
            .objectGroupId("5")
            .objectGroupTitle("Example Group")
            .order(5)
            .targetDate(LocalDate.parse("2026-04-30"))
            .build()
    }

    @Test
    fun headers() {
        val params =
            PiggyBankCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .accountId(JsonValue.from(mapOf<String, Any>()))
                .name("New digital camera")
                .startDate(LocalDate.parse("2026-04-01"))
                .targetAmount("123.45")
                .addAccount(
                    PiggyBankCreateParams.Account.builder()
                        .id("3")
                        .currentAmount("123.45")
                        .name("Checking account")
                        .build()
                )
                .currentAmount("123.45")
                .notes("Some notes")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .order(5)
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
        val params =
            PiggyBankCreateParams.builder()
                .accountId(JsonValue.from(mapOf<String, Any>()))
                .name("New digital camera")
                .startDate(LocalDate.parse("2026-04-01"))
                .targetAmount("123.45")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            PiggyBankCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .accountId(JsonValue.from(mapOf<String, Any>()))
                .name("New digital camera")
                .startDate(LocalDate.parse("2026-04-01"))
                .targetAmount("123.45")
                .addAccount(
                    PiggyBankCreateParams.Account.builder()
                        .id("3")
                        .currentAmount("123.45")
                        .name("Checking account")
                        .build()
                )
                .currentAmount("123.45")
                .notes("Some notes")
                .objectGroupId("5")
                .objectGroupTitle("Example Group")
                .order(5)
                .targetDate(LocalDate.parse("2026-04-30"))
                .build()

        val body = params._body()

        assertThat(body._accountId()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.name()).isEqualTo("New digital camera")
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2026-04-01"))
        assertThat(body.targetAmount()).isEqualTo("123.45")
        assertThat(body.accounts())
            .containsExactly(
                PiggyBankCreateParams.Account.builder()
                    .id("3")
                    .currentAmount("123.45")
                    .name("Checking account")
                    .build()
            )
        assertThat(body.currentAmount()).isEqualTo("123.45")
        assertThat(body.notes()).isEqualTo("Some notes")
        assertThat(body.objectGroupId()).isEqualTo("5")
        assertThat(body.objectGroupTitle()).isEqualTo("Example Group")
        assertThat(body.order()).isEqualTo(5)
        assertThat(body.targetDate()).isEqualTo(LocalDate.parse("2026-04-30"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PiggyBankCreateParams.builder()
                .accountId(JsonValue.from(mapOf<String, Any>()))
                .name("New digital camera")
                .startDate(LocalDate.parse("2026-04-01"))
                .targetAmount("123.45")
                .build()

        val body = params._body()

        assertThat(body._accountId()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.name()).isEqualTo("New digital camera")
        assertThat(body.startDate()).isEqualTo(LocalDate.parse("2026-04-01"))
        assertThat(body.targetAmount()).isEqualTo("123.45")
    }
}
