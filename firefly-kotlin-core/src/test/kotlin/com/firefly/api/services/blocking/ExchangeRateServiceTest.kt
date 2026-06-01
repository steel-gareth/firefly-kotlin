// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.core.JsonValue
import com.firefly.api.models.exchangerates.ExchangeRateCreateByCurrenciesParams
import com.firefly.api.models.exchangerates.ExchangeRateCreateByDateParams
import com.firefly.api.models.exchangerates.ExchangeRateCreateParams
import com.firefly.api.models.exchangerates.ExchangeRateDeleteAllByCurrenciesParams
import com.firefly.api.models.exchangerates.ExchangeRateDeleteByDateParams
import com.firefly.api.models.exchangerates.ExchangeRateDeleteParams
import com.firefly.api.models.exchangerates.ExchangeRateListByCurrenciesParams
import com.firefly.api.models.exchangerates.ExchangeRateListParams
import com.firefly.api.models.exchangerates.ExchangeRateRetrieveByDateParams
import com.firefly.api.models.exchangerates.ExchangeRateRetrieveParams
import com.firefly.api.models.exchangerates.ExchangeRateUpdateByDateParams
import com.firefly.api.models.exchangerates.ExchangeRateUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExchangeRateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        val currencyExchangeRateSingle =
            exchangeRateService.create(
                ExchangeRateCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .date(LocalDate.parse("2026-04-01"))
                    .from("USD")
                    .rates(JsonValue.from(mapOf<String, Any>()))
                    .to("EUR")
                    .rate("2.3456")
                    .build()
            )

        currencyExchangeRateSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        val currencyExchangeRateSingle =
            exchangeRateService.retrieve(
                ExchangeRateRetrieveParams.builder()
                    .id("123")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencyExchangeRateSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        val currencyExchangeRateSingle =
            exchangeRateService.update(
                ExchangeRateUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .date(LocalDate.parse("2026-04-01"))
                    .rate("2.3456")
                    .from("USD")
                    .to("EUR")
                    .build()
            )

        currencyExchangeRateSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        val currencyExchangeRateArray =
            exchangeRateService.list(
                ExchangeRateListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencyExchangeRateArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        exchangeRateService.delete(
            ExchangeRateDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createByCurrencies() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        val currencyExchangeRateArray =
            exchangeRateService.createByCurrencies(
                ExchangeRateCreateByCurrenciesParams.builder()
                    .from("EUR")
                    .to("USD")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .body(
                        ExchangeRateCreateByCurrenciesParams.Body.builder()
                            .putAdditionalProperty("2025-08-01", JsonValue.from("1.2345"))
                            .putAdditionalProperty("2025-08-02", JsonValue.from("6.3456"))
                            .build()
                    )
                    .build()
            )

        currencyExchangeRateArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createByDate() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        val currencyExchangeRateArray =
            exchangeRateService.createByDate(
                ExchangeRateCreateByDateParams.builder()
                    .pathDate("2026-04-01")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .bodyDate(JsonValue.from(mapOf<String, Any>()))
                    .from("EUR")
                    .rates(
                        ExchangeRateCreateByDateParams.Rates.builder()
                            .putAdditionalProperty("USD", JsonValue.from("1.2345"))
                            .putAdditionalProperty("GBP", JsonValue.from("6.3456"))
                            .build()
                    )
                    .build()
            )

        currencyExchangeRateArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAllByCurrencies() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        exchangeRateService.deleteAllByCurrencies(
            ExchangeRateDeleteAllByCurrenciesParams.builder()
                .from("EUR")
                .to("USD")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteByDate() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        exchangeRateService.deleteByDate(
            ExchangeRateDeleteByDateParams.builder()
                .from("EUR")
                .to("USD")
                .date("2026-04-01")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listByCurrencies() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        val currencyExchangeRateArray =
            exchangeRateService.listByCurrencies(
                ExchangeRateListByCurrenciesParams.builder()
                    .from("EUR")
                    .to("USD")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencyExchangeRateArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveByDate() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        val currencyExchangeRateArray =
            exchangeRateService.retrieveByDate(
                ExchangeRateRetrieveByDateParams.builder()
                    .from("EUR")
                    .to("USD")
                    .date("2026-04-01")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        currencyExchangeRateArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateByDate() {
        val client = FireflyOkHttpClient.fromEnv()
        val exchangeRateService = client.exchangeRates()

        val currencyExchangeRateSingle =
            exchangeRateService.updateByDate(
                ExchangeRateUpdateByDateParams.builder()
                    .from("EUR")
                    .to("USD")
                    .date("2026-04-01")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .rate("2.3456")
                    .build()
            )

        currencyExchangeRateSingle.validate()
    }
}
