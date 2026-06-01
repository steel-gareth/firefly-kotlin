// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.chart.account

import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChartDataSetTest {

    @Test
    fun create() {
        val chartDataSet =
            ChartDataSet.builder()
                .currencyCode("EUR")
                .currencyDecimalPlaces(2)
                .currencyId("5")
                .currencyName("Euro")
                .currencySymbol("\$")
                .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .endDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .entries(JsonValue.from(mapOf<String, Any>()))
                .label("Checking account")
                .pcEntries(JsonValue.from(mapOf<String, Any>()))
                .period(ChartDataSet.Period._1_M)
                .primaryCurrencyCode("EUR")
                .primaryCurrencyDecimalPlaces(2)
                .primaryCurrencyId("5")
                .primaryCurrencyName("Euro")
                .primaryCurrencySymbol("\$")
                .startDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .type("line")
                .yAxisId(0)
                .build()

        assertThat(chartDataSet.currencyCode()).isEqualTo("EUR")
        assertThat(chartDataSet.currencyDecimalPlaces()).isEqualTo(2)
        assertThat(chartDataSet.currencyId()).isEqualTo("5")
        assertThat(chartDataSet.currencyName()).isEqualTo("Euro")
        assertThat(chartDataSet.currencySymbol()).isEqualTo("\$")
        assertThat(chartDataSet.date()).isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
        assertThat(chartDataSet.endDate())
            .isEqualTo(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
        assertThat(chartDataSet._entries()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(chartDataSet.label()).isEqualTo("Checking account")
        assertThat(chartDataSet._pcEntries()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(chartDataSet.period()).isEqualTo(ChartDataSet.Period._1_M)
        assertThat(chartDataSet.primaryCurrencyCode()).isEqualTo("EUR")
        assertThat(chartDataSet.primaryCurrencyDecimalPlaces()).isEqualTo(2)
        assertThat(chartDataSet.primaryCurrencyId()).isEqualTo("5")
        assertThat(chartDataSet.primaryCurrencyName()).isEqualTo("Euro")
        assertThat(chartDataSet.primaryCurrencySymbol()).isEqualTo("\$")
        assertThat(chartDataSet.startDate())
            .isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
        assertThat(chartDataSet.type()).isEqualTo("line")
        assertThat(chartDataSet.yAxisId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chartDataSet =
            ChartDataSet.builder()
                .currencyCode("EUR")
                .currencyDecimalPlaces(2)
                .currencyId("5")
                .currencyName("Euro")
                .currencySymbol("\$")
                .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .endDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                .entries(JsonValue.from(mapOf<String, Any>()))
                .label("Checking account")
                .pcEntries(JsonValue.from(mapOf<String, Any>()))
                .period(ChartDataSet.Period._1_M)
                .primaryCurrencyCode("EUR")
                .primaryCurrencyDecimalPlaces(2)
                .primaryCurrencyId("5")
                .primaryCurrencyName("Euro")
                .primaryCurrencySymbol("\$")
                .startDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .type("line")
                .yAxisId(0)
                .build()

        val roundtrippedChartDataSet =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chartDataSet),
                jacksonTypeRef<ChartDataSet>(),
            )

        assertThat(roundtrippedChartDataSet).isEqualTo(chartDataSet)
    }
}
