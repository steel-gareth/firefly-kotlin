// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.models.piggybanks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.firefly.api.core.JsonValue
import com.firefly.api.core.jsonMapper
import com.firefly.api.models.attachments.ObjectLink
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PiggyBankReadTest {

    @Test
    fun create() {
        val piggyBankRead =
            PiggyBankRead.builder()
                .id("2")
                .attributes(
                    PiggyBankRead.Attributes.builder()
                        .accountId(JsonValue.from(mapOf<String, Any>()))
                        .name("New digital camera")
                        .targetAmount("123.45")
                        .addAccount(
                            PiggyBankRead.Attributes.Account.builder()
                                .accountId("3")
                                .currentAmount("123.45")
                                .name("Checking account")
                                .pcCurrentAmount("123.45")
                                .build()
                        )
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .currencyCode("EUR")
                        .currencyDecimalPlaces(2)
                        .currencyId("5")
                        .currencyName("Euro")
                        .currencySymbol("\$")
                        .currentAmount("123.45")
                        .leftToSave("700.00")
                        .notes("Some notes")
                        .objectGroupId("5")
                        .objectGroupOrder(5)
                        .objectGroupTitle("Example Group")
                        .objectHasCurrencySetting(true)
                        .order(5)
                        .pcCurrentAmount("123.45")
                        .pcLeftToSave("700.00")
                        .pcSavePerMonth("12.45")
                        .pcTargetAmount("123.45")
                        .percentage(12)
                        .primaryCurrencyCode("EUR")
                        .primaryCurrencyDecimalPlaces(2)
                        .primaryCurrencyId("5")
                        .primaryCurrencyName("Euro")
                        .primaryCurrencySymbol("\$")
                        .savePerMonth("12.45")
                        .startDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .targetDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .links(
                    ObjectLink.builder()
                        ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                        .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                        .build()
                )
                .type("piggy_banks")
                .build()

        assertThat(piggyBankRead.id()).isEqualTo("2")
        assertThat(piggyBankRead.attributes())
            .isEqualTo(
                PiggyBankRead.Attributes.builder()
                    .accountId(JsonValue.from(mapOf<String, Any>()))
                    .name("New digital camera")
                    .targetAmount("123.45")
                    .addAccount(
                        PiggyBankRead.Attributes.Account.builder()
                            .accountId("3")
                            .currentAmount("123.45")
                            .name("Checking account")
                            .pcCurrentAmount("123.45")
                            .build()
                    )
                    .active(true)
                    .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .currencyCode("EUR")
                    .currencyDecimalPlaces(2)
                    .currencyId("5")
                    .currencyName("Euro")
                    .currencySymbol("\$")
                    .currentAmount("123.45")
                    .leftToSave("700.00")
                    .notes("Some notes")
                    .objectGroupId("5")
                    .objectGroupOrder(5)
                    .objectGroupTitle("Example Group")
                    .objectHasCurrencySetting(true)
                    .order(5)
                    .pcCurrentAmount("123.45")
                    .pcLeftToSave("700.00")
                    .pcSavePerMonth("12.45")
                    .pcTargetAmount("123.45")
                    .percentage(12)
                    .primaryCurrencyCode("EUR")
                    .primaryCurrencyDecimalPlaces(2)
                    .primaryCurrencyId("5")
                    .primaryCurrencyName("Euro")
                    .primaryCurrencySymbol("\$")
                    .savePerMonth("12.45")
                    .startDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .targetDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .build()
            )
        assertThat(piggyBankRead.links())
            .isEqualTo(
                ObjectLink.builder()
                    ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                    .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                    .build()
            )
        assertThat(piggyBankRead.type()).isEqualTo("piggy_banks")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val piggyBankRead =
            PiggyBankRead.builder()
                .id("2")
                .attributes(
                    PiggyBankRead.Attributes.builder()
                        .accountId(JsonValue.from(mapOf<String, Any>()))
                        .name("New digital camera")
                        .targetAmount("123.45")
                        .addAccount(
                            PiggyBankRead.Attributes.Account.builder()
                                .accountId("3")
                                .currentAmount("123.45")
                                .name("Checking account")
                                .pcCurrentAmount("123.45")
                                .build()
                        )
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .currencyCode("EUR")
                        .currencyDecimalPlaces(2)
                        .currencyId("5")
                        .currencyName("Euro")
                        .currencySymbol("\$")
                        .currentAmount("123.45")
                        .leftToSave("700.00")
                        .notes("Some notes")
                        .objectGroupId("5")
                        .objectGroupOrder(5)
                        .objectGroupTitle("Example Group")
                        .objectHasCurrencySetting(true)
                        .order(5)
                        .pcCurrentAmount("123.45")
                        .pcLeftToSave("700.00")
                        .pcSavePerMonth("12.45")
                        .pcTargetAmount("123.45")
                        .percentage(12)
                        .primaryCurrencyCode("EUR")
                        .primaryCurrencyDecimalPlaces(2)
                        .primaryCurrencyId("5")
                        .primaryCurrencyName("Euro")
                        .primaryCurrencySymbol("\$")
                        .savePerMonth("12.45")
                        .startDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .targetDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .updatedAt(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                        .build()
                )
                .links(
                    ObjectLink.builder()
                        ._0(ObjectLink._0.builder().rel("self").uri("/OBJECTS/1").build())
                        .self("https://demo.firefly-iii.org/api/v1/OBJECTS/1")
                        .build()
                )
                .type("piggy_banks")
                .build()

        val roundtrippedPiggyBankRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(piggyBankRead),
                jacksonTypeRef<PiggyBankRead>(),
            )

        assertThat(roundtrippedPiggyBankRead).isEqualTo(piggyBankRead)
    }
}
