// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.data.export

import com.firefly.api.core.http.Headers
import com.firefly.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExportExportTransactionsParamsTest {

    @Test
    fun create() {
        ExportExportTransactionsParams.builder()
            .end(LocalDate.parse("2019-12-27"))
            .start(LocalDate.parse("2019-12-27"))
            .accounts("accounts")
            .type(ExportFileFilter.CSV)
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .build()
    }

    @Test
    fun headers() {
        val params =
            ExportExportTransactionsParams.builder()
                .end(LocalDate.parse("2019-12-27"))
                .start(LocalDate.parse("2019-12-27"))
                .accounts("accounts")
                .type(ExportFileFilter.CSV)
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
        val params =
            ExportExportTransactionsParams.builder()
                .end(LocalDate.parse("2019-12-27"))
                .start(LocalDate.parse("2019-12-27"))
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            ExportExportTransactionsParams.builder()
                .end(LocalDate.parse("2019-12-27"))
                .start(LocalDate.parse("2019-12-27"))
                .accounts("accounts")
                .type(ExportFileFilter.CSV)
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end", "2019-12-27")
                    .put("start", "2019-12-27")
                    .put("accounts", "accounts")
                    .put("type", "csv")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ExportExportTransactionsParams.builder()
                .end(LocalDate.parse("2019-12-27"))
                .start(LocalDate.parse("2019-12-27"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("end", "2019-12-27").put("start", "2019-12-27").build()
            )
    }
}
