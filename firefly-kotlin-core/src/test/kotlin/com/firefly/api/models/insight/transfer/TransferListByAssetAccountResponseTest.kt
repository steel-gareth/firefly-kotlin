// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.insight.transfer

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferListByAssetAccountResponseTest {

    @Test
    fun create() {
        val transferListByAssetAccountResponse =
            TransferListByAssetAccountResponse.builder()
                .id("123")
                .currencyCode("EUR")
                .currencyId("5")
                .difference("-123.45")
                .differenceFloat(-123.45)
                .in_("123.45")
                .inFloat(123.45)
                .name("Land lord")
                .out("123.45")
                .outFloat(123.45)
                .build()

        assertThat(transferListByAssetAccountResponse.id()).isEqualTo("123")
        assertThat(transferListByAssetAccountResponse.currencyCode()).isEqualTo("EUR")
        assertThat(transferListByAssetAccountResponse.currencyId()).isEqualTo("5")
        assertThat(transferListByAssetAccountResponse.difference()).isEqualTo("-123.45")
        assertThat(transferListByAssetAccountResponse.differenceFloat()).isEqualTo(-123.45)
        assertThat(transferListByAssetAccountResponse.in_()).isEqualTo("123.45")
        assertThat(transferListByAssetAccountResponse.inFloat()).isEqualTo(123.45)
        assertThat(transferListByAssetAccountResponse.name()).isEqualTo("Land lord")
        assertThat(transferListByAssetAccountResponse.out()).isEqualTo("123.45")
        assertThat(transferListByAssetAccountResponse.outFloat()).isEqualTo(123.45)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transferListByAssetAccountResponse =
            TransferListByAssetAccountResponse.builder()
                .id("123")
                .currencyCode("EUR")
                .currencyId("5")
                .difference("-123.45")
                .differenceFloat(-123.45)
                .in_("123.45")
                .inFloat(123.45)
                .name("Land lord")
                .out("123.45")
                .outFloat(123.45)
                .build()

        val roundtrippedTransferListByAssetAccountResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transferListByAssetAccountResponse),
                jacksonTypeRef<TransferListByAssetAccountResponse>(),
            )

        assertThat(roundtrippedTransferListByAssetAccountResponse)
            .isEqualTo(transferListByAssetAccountResponse)
    }
}
