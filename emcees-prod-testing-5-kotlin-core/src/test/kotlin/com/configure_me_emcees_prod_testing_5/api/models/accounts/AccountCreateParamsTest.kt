// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.models.accounts

import com.configure_me_emcees_prod_testing_5.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCreateParamsTest {

    @Test
    fun create() {
        AccountCreateParams.builder()
            .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
            .name("My checking account")
            .type(ShortAccountTypeProperty.ASSET)
            .accountNumber("7009312345678")
            .accountRole(AccountRoleProperty.DEFAULT_ASSET)
            .active(false)
            .bic("BOFAUS3N")
            .creditCardType(CreditCardTypeProperty.MONTHLY_FULL)
            .currencyCode("EUR")
            .currencyId("12")
            .iban("GB98MIDL07009312345678")
            .includeNetWorth(true)
            .interest("5.3")
            .interestPeriod(InterestPeriodProperty.MONTHLY)
            .latitude(51.983333)
            .liabilityDirection(LiabilityDirectionProperty.CREDIT)
            .liabilityType(LiabilityTypeProperty.LOAN)
            .longitude(5.916667)
            .monthlyPaymentDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
            .notes("Some example notes")
            .openingBalance("-1012.12")
            .openingBalanceDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
            .order(1)
            .virtualBalance("123.45")
            .zoomLevel(6)
            .build()
    }

    @Test
    fun headers() {
        val params =
            AccountCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .name("My checking account")
                .type(ShortAccountTypeProperty.ASSET)
                .accountNumber("7009312345678")
                .accountRole(AccountRoleProperty.DEFAULT_ASSET)
                .active(false)
                .bic("BOFAUS3N")
                .creditCardType(CreditCardTypeProperty.MONTHLY_FULL)
                .currencyCode("EUR")
                .currencyId("12")
                .iban("GB98MIDL07009312345678")
                .includeNetWorth(true)
                .interest("5.3")
                .interestPeriod(InterestPeriodProperty.MONTHLY)
                .latitude(51.983333)
                .liabilityDirection(LiabilityDirectionProperty.CREDIT)
                .liabilityType(LiabilityTypeProperty.LOAN)
                .longitude(5.916667)
                .monthlyPaymentDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .notes("Some example notes")
                .openingBalance("-1012.12")
                .openingBalanceDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .order(1)
                .virtualBalance("123.45")
                .zoomLevel(6)
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
            AccountCreateParams.builder()
                .name("My checking account")
                .type(ShortAccountTypeProperty.ASSET)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            AccountCreateParams.builder()
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .name("My checking account")
                .type(ShortAccountTypeProperty.ASSET)
                .accountNumber("7009312345678")
                .accountRole(AccountRoleProperty.DEFAULT_ASSET)
                .active(false)
                .bic("BOFAUS3N")
                .creditCardType(CreditCardTypeProperty.MONTHLY_FULL)
                .currencyCode("EUR")
                .currencyId("12")
                .iban("GB98MIDL07009312345678")
                .includeNetWorth(true)
                .interest("5.3")
                .interestPeriod(InterestPeriodProperty.MONTHLY)
                .latitude(51.983333)
                .liabilityDirection(LiabilityDirectionProperty.CREDIT)
                .liabilityType(LiabilityTypeProperty.LOAN)
                .longitude(5.916667)
                .monthlyPaymentDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .notes("Some example notes")
                .openingBalance("-1012.12")
                .openingBalanceDate(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                .order(1)
                .virtualBalance("123.45")
                .zoomLevel(6)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My checking account")
        assertThat(body.type()).isEqualTo(ShortAccountTypeProperty.ASSET)
        assertThat(body.accountNumber()).isEqualTo("7009312345678")
        assertThat(body.accountRole()).isEqualTo(AccountRoleProperty.DEFAULT_ASSET)
        assertThat(body.active()).isEqualTo(false)
        assertThat(body.bic()).isEqualTo("BOFAUS3N")
        assertThat(body.creditCardType()).isEqualTo(CreditCardTypeProperty.MONTHLY_FULL)
        assertThat(body.currencyCode()).isEqualTo("EUR")
        assertThat(body.currencyId()).isEqualTo("12")
        assertThat(body.iban()).isEqualTo("GB98MIDL07009312345678")
        assertThat(body.includeNetWorth()).isEqualTo(true)
        assertThat(body.interest()).isEqualTo("5.3")
        assertThat(body.interestPeriod()).isEqualTo(InterestPeriodProperty.MONTHLY)
        assertThat(body.latitude()).isEqualTo(51.983333)
        assertThat(body.liabilityDirection()).isEqualTo(LiabilityDirectionProperty.CREDIT)
        assertThat(body.liabilityType()).isEqualTo(LiabilityTypeProperty.LOAN)
        assertThat(body.longitude()).isEqualTo(5.916667)
        assertThat(body.monthlyPaymentDate())
            .isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
        assertThat(body.notes()).isEqualTo("Some example notes")
        assertThat(body.openingBalance()).isEqualTo("-1012.12")
        assertThat(body.openingBalanceDate())
            .isEqualTo(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
        assertThat(body.order()).isEqualTo(1)
        assertThat(body.virtualBalance()).isEqualTo("123.45")
        assertThat(body.zoomLevel()).isEqualTo(6)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountCreateParams.builder()
                .name("My checking account")
                .type(ShortAccountTypeProperty.ASSET)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My checking account")
        assertThat(body.type()).isEqualTo(ShortAccountTypeProperty.ASSET)
    }
}
