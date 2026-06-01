// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.cron

import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CronRunParamsTest {

    @Test
    fun create() {
        CronRunParams.builder()
            .cliToken("d5ea6b5fb774618dd6ad6ba6e0a7f55c")
            .date(LocalDate.parse("2026-04-01"))
            .force(false)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CronRunParams.builder().cliToken("d5ea6b5fb774618dd6ad6ba6e0a7f55c").build()

        assertThat(params._pathParam(0)).isEqualTo("d5ea6b5fb774618dd6ad6ba6e0a7f55c")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CronRunParams.builder()
                .cliToken("d5ea6b5fb774618dd6ad6ba6e0a7f55c")
                .date(LocalDate.parse("2026-04-01"))
                .force(false)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("X-Trace-Id", "40c71bbb-c676-4f24-83cf-cc725d7d7a00").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = CronRunParams.builder().cliToken("d5ea6b5fb774618dd6ad6ba6e0a7f55c").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            CronRunParams.builder()
                .cliToken("d5ea6b5fb774618dd6ad6ba6e0a7f55c")
                .date(LocalDate.parse("2026-04-01"))
                .force(false)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("date", "2026-04-01").put("force", "false").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CronRunParams.builder().cliToken("d5ea6b5fb774618dd6ad6ba6e0a7f55c").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
