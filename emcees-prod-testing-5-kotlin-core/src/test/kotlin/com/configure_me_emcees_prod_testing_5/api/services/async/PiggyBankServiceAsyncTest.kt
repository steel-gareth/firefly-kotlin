// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankListEventsParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankListParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.piggybanks.PiggyBankUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PiggyBankServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val piggyBankServiceAsync = client.piggyBanks()

        val piggyBankSingle =
            piggyBankServiceAsync.create(
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
    suspend fun retrieve() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val piggyBankServiceAsync = client.piggyBanks()

        val piggyBankSingle =
            piggyBankServiceAsync.retrieve(
                PiggyBankRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        piggyBankSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val piggyBankServiceAsync = client.piggyBanks()

        val piggyBankSingle =
            piggyBankServiceAsync.update(
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
    suspend fun list() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val piggyBankServiceAsync = client.piggyBanks()

        val piggyBankArray =
            piggyBankServiceAsync.list(
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
    suspend fun delete() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val piggyBankServiceAsync = client.piggyBanks()

        piggyBankServiceAsync.delete(
            PiggyBankDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listAttachments() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val piggyBankServiceAsync = client.piggyBanks()

        val attachmentArray =
            piggyBankServiceAsync.listAttachments(
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
    suspend fun listEvents() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val piggyBankServiceAsync = client.piggyBanks()

        val piggyBankEventArray =
            piggyBankServiceAsync.listEvents(
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
