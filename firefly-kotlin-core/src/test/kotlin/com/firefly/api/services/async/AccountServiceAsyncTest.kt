// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.async

import com.firefly.api.client.okhttp.FireflyOkHttpClientAsync
import com.firefly.api.core.JsonValue
import com.firefly.api.models.accounts.AccountCreateParams
import com.firefly.api.models.accounts.AccountDeleteParams
import com.firefly.api.models.accounts.AccountListAttachmentsParams
import com.firefly.api.models.accounts.AccountListParams
import com.firefly.api.models.accounts.AccountListPiggyBanksParams
import com.firefly.api.models.accounts.AccountListTransactionsParams
import com.firefly.api.models.accounts.AccountRetrieveParams
import com.firefly.api.models.accounts.AccountRoleProperty
import com.firefly.api.models.accounts.AccountTypeFilter
import com.firefly.api.models.accounts.AccountUpdateParams
import com.firefly.api.models.accounts.CreditCardTypeProperty
import com.firefly.api.models.accounts.InterestPeriodProperty
import com.firefly.api.models.accounts.LiabilityDirectionProperty
import com.firefly.api.models.accounts.LiabilityTypeProperty
import com.firefly.api.models.accounts.ShortAccountTypeProperty
import com.firefly.api.models.accounts.TransactionTypeFilter
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val accountServiceAsync = client.accounts()

        val accountSingle =
            accountServiceAsync.create(
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
            )

        accountSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val accountServiceAsync = client.accounts()

        val accountSingle =
            accountServiceAsync.retrieve(
                AccountRetrieveParams.builder()
                    .id("123")
                    .date(LocalDate.parse("2019-12-27"))
                    .end(LocalDate.parse("2019-12-27"))
                    .start(LocalDate.parse("2019-12-27"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        accountSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val accountServiceAsync = client.accounts()

        val accountSingle =
            accountServiceAsync.update(
                AccountUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .name("My checking account")
                    .type(JsonValue.from(mapOf<String, Any>()))
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
            )

        accountSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val accountServiceAsync = client.accounts()

        val accountArray =
            accountServiceAsync.list(
                AccountListParams.builder()
                    .date(LocalDate.parse("2019-12-27"))
                    .end(LocalDate.parse("2019-12-27"))
                    .limit(10)
                    .page(1)
                    .start(LocalDate.parse("2019-12-27"))
                    .type(AccountTypeFilter.ALL)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        accountArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val accountServiceAsync = client.accounts()

        accountServiceAsync.delete(
            AccountDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listAttachments() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val accountServiceAsync = client.accounts()

        val attachmentArray =
            accountServiceAsync.listAttachments(
                AccountListAttachmentsParams.builder()
                    .id("123")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        attachmentArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listPiggyBanks() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val accountServiceAsync = client.accounts()

        val piggyBankArray =
            accountServiceAsync.listPiggyBanks(
                AccountListPiggyBanksParams.builder()
                    .id("123")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        piggyBankArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listTransactions() {
        val client = FireflyOkHttpClientAsync.fromEnv()
        val accountServiceAsync = client.accounts()

        val transactionArray =
            accountServiceAsync.listTransactions(
                AccountListTransactionsParams.builder()
                    .id("123")
                    .end(LocalDate.parse("2026-04-30"))
                    .limit(10)
                    .page(1)
                    .start(LocalDate.parse("2026-04-01"))
                    .type(TransactionTypeFilter.ALL)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionArray.validate()
    }
}
