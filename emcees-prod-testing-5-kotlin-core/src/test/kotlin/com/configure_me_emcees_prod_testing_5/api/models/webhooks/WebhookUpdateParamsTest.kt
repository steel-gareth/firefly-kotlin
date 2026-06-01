// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.webhooks

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookUpdateParamsTest {

    @Test
    fun create() {
        WebhookUpdateParams.builder()
            .id("123")
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .active(false)
            .addDelivery(WebhookDelivery.JSON)
            .addResponse(WebhookResponse.TRANSACTIONS)
            .secret("iMLZLtLx2JHWhK9Dtyuoqyir")
            .title("Update magic mirror on new transaction")
            .addTrigger(WebhookTrigger.STORE_TRANSACTION)
            .addTrigger(WebhookTrigger.UPDATE_TRANSACTION)
            .url("https://example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params = WebhookUpdateParams.builder().id("123").build()

        assertThat(params._pathParam(0)).isEqualTo("123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            WebhookUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .active(false)
                .addDelivery(WebhookDelivery.JSON)
                .addResponse(WebhookResponse.TRANSACTIONS)
                .secret("iMLZLtLx2JHWhK9Dtyuoqyir")
                .title("Update magic mirror on new transaction")
                .addTrigger(WebhookTrigger.STORE_TRANSACTION)
                .addTrigger(WebhookTrigger.UPDATE_TRANSACTION)
                .url("https://example.com")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = WebhookUpdateParams.builder().id("123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            WebhookUpdateParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .active(false)
                .addDelivery(WebhookDelivery.JSON)
                .addResponse(WebhookResponse.TRANSACTIONS)
                .secret("iMLZLtLx2JHWhK9Dtyuoqyir")
                .title("Update magic mirror on new transaction")
                .addTrigger(WebhookTrigger.STORE_TRANSACTION)
                .addTrigger(WebhookTrigger.UPDATE_TRANSACTION)
                .url("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.active()).isEqualTo(false)
        assertThat(body.deliveries()).containsExactly(WebhookDelivery.JSON)
        assertThat(body.responses()).containsExactly(WebhookResponse.TRANSACTIONS)
        assertThat(body.secret()).isEqualTo("iMLZLtLx2JHWhK9Dtyuoqyir")
        assertThat(body.title()).isEqualTo("Update magic mirror on new transaction")
        assertThat(body.triggers())
            .containsExactly(WebhookTrigger.STORE_TRANSACTION, WebhookTrigger.UPDATE_TRANSACTION)
        assertThat(body.url()).isEqualTo("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WebhookUpdateParams.builder().id("123").build()

        val body = params._body()
    }
}
