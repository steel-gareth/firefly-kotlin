// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.accounts.TransactionTypeFilter
import com.firefly.api.models.bills.BillCreateParams
import com.firefly.api.models.bills.BillDeleteParams
import com.firefly.api.models.bills.BillListAttachmentsParams
import com.firefly.api.models.bills.BillListParams
import com.firefly.api.models.bills.BillListRulesParams
import com.firefly.api.models.bills.BillListTransactionsParams
import com.firefly.api.models.bills.BillRepeatFrequency
import com.firefly.api.models.bills.BillRetrieveParams
import com.firefly.api.models.bills.BillUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BillServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = FireflyOkHttpClient.fromEnv()
        val billService = client.bills()

        val billSingle =
            billService.create(
                BillCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .amountMax("123.45")
                    .amountMin("123.45")
                    .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .name("Rent")
                    .repeatFreq(BillRepeatFrequency.MONTHLY)
                    .active(true)
                    .currencyCode("EUR")
                    .currencyId("5")
                    .endDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                    .extensionDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                    .notes("Some example notes")
                    .objectGroupId("5")
                    .objectGroupTitle("Example Group")
                    .skip(0)
                    .build()
            )

        billSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val billService = client.bills()

        val billSingle =
            billService.retrieve(
                BillRetrieveParams.builder()
                    .id("123")
                    .end(LocalDate.parse("2026-04-30"))
                    .start(LocalDate.parse("2026-04-01"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        billSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val billService = client.bills()

        val billSingle =
            billService.update(
                BillUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .name("Rent")
                    .active(true)
                    .amountMax("123.45")
                    .amountMin("123.45")
                    .currencyCode("EUR")
                    .currencyId("5")
                    .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                    .endDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                    .extensionDate(OffsetDateTime.parse("2026-04-30T23:59:59+00:00"))
                    .notes("Some example notes")
                    .objectGroupId("5")
                    .objectGroupTitle("Example Group")
                    .repeatFreq(BillRepeatFrequency.MONTHLY)
                    .skip(0)
                    .build()
            )

        billSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = FireflyOkHttpClient.fromEnv()
        val billService = client.bills()

        val billArray =
            billService.list(
                BillListParams.builder()
                    .end(LocalDate.parse("2026-04-01"))
                    .limit(10)
                    .page(1)
                    .start(LocalDate.parse("2026-04-01"))
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        billArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = FireflyOkHttpClient.fromEnv()
        val billService = client.bills()

        billService.delete(
            BillDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAttachments() {
        val client = FireflyOkHttpClient.fromEnv()
        val billService = client.bills()

        val attachmentArray =
            billService.listAttachments(
                BillListAttachmentsParams.builder()
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
    fun listRules() {
        val client = FireflyOkHttpClient.fromEnv()
        val billService = client.bills()

        val ruleArray =
            billService.listRules(
                BillListRulesParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        ruleArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTransactions() {
        val client = FireflyOkHttpClient.fromEnv()
        val billService = client.bills()

        val transactionArray =
            billService.listTransactions(
                BillListTransactionsParams.builder()
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
