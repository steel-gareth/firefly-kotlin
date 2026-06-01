// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services

import com.firefly.api.client.FireflyClient
import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.core.JsonValue
import com.firefly.api.core.http.Headers
import com.firefly.api.core.jsonMapper
import com.firefly.api.errors.BadRequestException
import com.firefly.api.errors.FireflyException
import com.firefly.api.errors.InternalServerException
import com.firefly.api.errors.NotFoundException
import com.firefly.api.errors.PermissionDeniedException
import com.firefly.api.errors.RateLimitException
import com.firefly.api.errors.UnauthorizedException
import com.firefly.api.errors.UnexpectedStatusCodeException
import com.firefly.api.errors.UnprocessableEntityException
import com.firefly.api.models.accounts.AccountTypeFilter
import com.firefly.api.models.autocomplete.AutocompleteListAccountsParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: FireflyClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client = FireflyOkHttpClient.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
    }

    @Test
    fun autocompleteListAccounts400() {
        val autocompleteService = client.autocomplete()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts400WithRawResponse() {
        val autocompleteService = client.autocomplete().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts401() {
        val autocompleteService = client.autocomplete()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts401WithRawResponse() {
        val autocompleteService = client.autocomplete().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts403() {
        val autocompleteService = client.autocomplete()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts403WithRawResponse() {
        val autocompleteService = client.autocomplete().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts404() {
        val autocompleteService = client.autocomplete()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts404WithRawResponse() {
        val autocompleteService = client.autocomplete().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts422() {
        val autocompleteService = client.autocomplete()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts422WithRawResponse() {
        val autocompleteService = client.autocomplete().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts429() {
        val autocompleteService = client.autocomplete()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts429WithRawResponse() {
        val autocompleteService = client.autocomplete().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts500() {
        val autocompleteService = client.autocomplete()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts500WithRawResponse() {
        val autocompleteService = client.autocomplete().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts999() {
        val autocompleteService = client.autocomplete()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccounts999WithRawResponse() {
        val autocompleteService = client.autocomplete().withRawResponse()
        stubFor(
            get(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun autocompleteListAccountsInvalidJsonBody() {
        val autocompleteService = client.autocomplete()
        stubFor(
            get(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<FireflyException> {
                autocompleteService.listAccounts(
                    AutocompleteListAccountsParams.builder()
                        .date("date")
                        .limit(0)
                        .query("query")
                        .addType(AccountTypeFilter.ALL)
                        .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
