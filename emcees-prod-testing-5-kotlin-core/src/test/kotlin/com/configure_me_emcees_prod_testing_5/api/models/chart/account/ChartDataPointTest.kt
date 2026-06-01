// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.chart.account

import com.configure_me_emcees_prod_testing_5.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChartDataPointTest {

    @Test
    fun create() {
        val chartDataPoint = ChartDataPoint.builder().key("value").build()

        assertThat(chartDataPoint.key()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chartDataPoint = ChartDataPoint.builder().key("value").build()

        val roundtrippedChartDataPoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chartDataPoint),
                jacksonTypeRef<ChartDataPoint>(),
            )

        assertThat(roundtrippedChartDataPoint).isEqualTo(chartDataPoint)
    }
}
