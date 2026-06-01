// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.core.JsonValue
import com.firefly.api.models.piggybanks.PiggyBankCreateParams
import com.firefly.api.models.piggybanks.PiggyBankDeleteParams
import com.firefly.api.models.piggybanks.PiggyBankListAttachmentsParams
import com.firefly.api.models.piggybanks.PiggyBankListEventsParams
import com.firefly.api.models.piggybanks.PiggyBankListParams
import com.firefly.api.models.piggybanks.PiggyBankRetrieveParams
import com.firefly.api.models.piggybanks.PiggyBankUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PiggyBankServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = FireflyOkHttpClient.fromEnv()
        val piggyBankService = client.piggyBanks()

        val piggyBankSingle =
            piggyBankService.create(
                PiggyBankCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .accountId(JsonValue.from(mapOf<String, Any>()))
                    .name("New digital camera")
                    .startDate(LocalDate.parse("2026-04-01"))
                    .targetAmount("123.45")
                    .addAccount(
                        PiggyBankCreateParams.Account.builder()
                            .id("3")
                            .currentAmount("123.45")
                            .name("Checking account")
                            .build()
                    )
                    .currentAmount("123.45")
                    .notes("Some notes")
                    .objectGroupId("5")
                    .objectGroupTitle("Example Group")
                    .order(5)
                    .targetDate(LocalDate.parse("2026-04-30"))
                    .build()
            )

        piggyBankSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = FireflyOkHttpClient.fromEnv()
        val piggyBankService = client.piggyBanks()

        val piggyBankSingle =
            piggyBankService.retrieve(
                PiggyBankRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        piggyBankSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = FireflyOkHttpClient.fromEnv()
        val piggyBankService = client.piggyBanks()

        val piggyBankSingle =
            piggyBankService.update(
                PiggyBankUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .addAccount(
                        PiggyBankUpdateParams.Account.builder()
                            .id(JsonValue.from(mapOf<String, Any>()))
                            .accountId("3")
                            .currentAmount("123.45")
                            .name("Checking account")
                            .build()
                    )
                    .name("New digital camera")
                    .notes("Some notes")
                    .objectGroupId("5")
                    .objectGroupTitle("Example Group")
                    .order(5)
                    .startDate(LocalDate.parse("2026-04-01"))
                    .targetAmount("123.45")
                    .targetDate(LocalDate.parse("2026-04-30"))
                    .build()
            )

        piggyBankSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = FireflyOkHttpClient.fromEnv()
        val piggyBankService = client.piggyBanks()

        val piggyBankArray =
            piggyBankService.list(
                PiggyBankListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        piggyBankArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = FireflyOkHttpClient.fromEnv()
        val piggyBankService = client.piggyBanks()

        piggyBankService.delete(
            PiggyBankDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAttachments() {
        val client = FireflyOkHttpClient.fromEnv()
        val piggyBankService = client.piggyBanks()

        val attachmentArray =
            piggyBankService.listAttachments(
                PiggyBankListAttachmentsParams.builder()
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
    fun listEvents() {
        val client = FireflyOkHttpClient.fromEnv()
        val piggyBankService = client.piggyBanks()

        val piggyBankEventArray =
            piggyBankService.listEvents(
                PiggyBankListEventsParams.builder()
                    .id("123")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        piggyBankEventArray.validate()
    }
}
