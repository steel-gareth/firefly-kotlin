// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.budgets

import com.firefly.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetCreateParamsTest {

    @Test
    fun create() {
        BudgetCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .name("Bills")
            .active(false)
            .autoBudgetAmount("-1012.12")
            .autoBudgetCurrencyCode("EUR")
            .autoBudgetCurrencyId("12")
            .autoBudgetPeriod(AutoBudgetPeriod.MONTHLY)
            .autoBudgetType(AutoBudgetType.RESET)
            .fireWebhooks(true)
            .notes("Some notes")
            .build()
    }

    @Test
    fun headers() {
        val params =
            BudgetCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .name("Bills")
                .active(false)
                .autoBudgetAmount("-1012.12")
                .autoBudgetCurrencyCode("EUR")
                .autoBudgetCurrencyId("12")
                .autoBudgetPeriod(AutoBudgetPeriod.MONTHLY)
                .autoBudgetType(AutoBudgetType.RESET)
                .fireWebhooks(true)
                .notes("Some notes")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = BudgetCreateParams.builder().name("Bills").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            BudgetCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .name("Bills")
                .active(false)
                .autoBudgetAmount("-1012.12")
                .autoBudgetCurrencyCode("EUR")
                .autoBudgetCurrencyId("12")
                .autoBudgetPeriod(AutoBudgetPeriod.MONTHLY)
                .autoBudgetType(AutoBudgetType.RESET)
                .fireWebhooks(true)
                .notes("Some notes")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Bills")
        assertThat(body.active()).isEqualTo(false)
        assertThat(body.autoBudgetAmount()).isEqualTo("-1012.12")
        assertThat(body.autoBudgetCurrencyCode()).isEqualTo("EUR")
        assertThat(body.autoBudgetCurrencyId()).isEqualTo("12")
        assertThat(body.autoBudgetPeriod()).isEqualTo(AutoBudgetPeriod.MONTHLY)
        assertThat(body.autoBudgetType()).isEqualTo(AutoBudgetType.RESET)
        assertThat(body.fireWebhooks()).isEqualTo(true)
        assertThat(body.notes()).isEqualTo("Some notes")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BudgetCreateParams.builder().name("Bills").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Bills")
    }
}
