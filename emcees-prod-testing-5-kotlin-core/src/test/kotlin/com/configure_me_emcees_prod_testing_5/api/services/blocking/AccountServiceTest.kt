// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountListParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountListPiggyBanksParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountListTransactionsParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountRoleProperty
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountTypeFilter
import com.configure_me_emcees_prod_testing_5.api.models.accounts.AccountUpdateParams
import com.configure_me_emcees_prod_testing_5.api.models.accounts.CreditCardTypeProperty
import com.configure_me_emcees_prod_testing_5.api.models.accounts.InterestPeriodProperty
import com.configure_me_emcees_prod_testing_5.api.models.accounts.LiabilityDirectionProperty
import com.configure_me_emcees_prod_testing_5.api.models.accounts.LiabilityTypeProperty
import com.configure_me_emcees_prod_testing_5.api.models.accounts.ShortAccountTypeProperty
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionTypeFilter
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val accountService = client.accounts()

        val accountSingle =
            accountService.create(
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
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val accountService = client.accounts()

        val accountSingle =
            accountService.retrieve(
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
    fun update() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val accountService = client.accounts()

        val accountSingle =
            accountService.update(
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
    fun list() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val accountService = client.accounts()

        val accountArray =
            accountService.list(
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
    fun delete() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val accountService = client.accounts()

        accountService.delete(
            AccountDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAttachments() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val accountService = client.accounts()

        val attachmentArray =
            accountService.listAttachments(
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
    fun listPiggyBanks() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val accountService = client.accounts()

        val piggyBankArray =
            accountService.listPiggyBanks(
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
    fun listTransactions() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val accountService = client.accounts()

        val transactionArray =
            accountService.listTransactions(
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
