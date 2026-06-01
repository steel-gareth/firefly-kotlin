// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateCreateByCurrenciesParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateCreateByDateParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateDeleteAllByCurrenciesParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateDeleteByDateParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateListByCurrenciesParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateListParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateRetrieveByDateParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateUpdateByDateParams
import com.configure_me_emcees_prod_testing_5.api.models.exchangerates.ExchangeRateUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExchangeRateServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
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
