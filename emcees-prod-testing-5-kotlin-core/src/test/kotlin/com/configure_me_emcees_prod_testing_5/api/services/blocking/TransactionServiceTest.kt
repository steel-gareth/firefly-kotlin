// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
import com.configure_me_emcees_prod_testing_5.api.models.accounts.TransactionTypeFilter
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionListAttachmentsParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionListParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionListPiggyBankEventsParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionTypeProperty
import com.configure_me_emcees_prod_testing_5.api.models.transactions.TransactionUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val transactionService = client.transactions()

        val transactionSingle =
            transactionService.create(
                TransactionCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .addTransaction(
                        TransactionCreateParams.Transaction.builder()
                            .amount("123.45")
                            .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .description("Vegetables")
                            .type(TransactionTypeProperty.WITHDRAWAL)
                            .billId("112")
                            .billName("Monthly rent")
                            .bookDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .budgetId("4")
                            .budgetName("Groceries")
                            .categoryId("43")
                            .categoryName("Groceries")
                            .currencyCode("EUR")
                            .currencyId("12")
                            .destinationId("2")
                            .destinationName("Buy and Large")
                            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .externalId("external_id")
                            .externalUrl("external_url")
                            .foreignAmount("123.45")
                            .foreignCurrencyCode("USD")
                            .foreignCurrencyId("17")
                            .interestDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .internalReference("internal_reference")
                            .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .notes("Some example notes")
                            .order(0)
                            .paymentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .piggyBankId(0)
                            .piggyBankName("piggy_bank_name")
                            .processDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .reconciled(false)
                            .sepaBatchId("sepa_batch_id")
                            .sepaCc("sepa_cc")
                            .sepaCi("sepa_ci")
                            .sepaCountry("sepa_country")
                            .sepaCtId("sepa_ct_id")
                            .sepaCtOp("sepa_ct_op")
                            .sepaDb("sepa_db")
                            .sepaEp("sepa_ep")
                            .sourceId("2")
                            .sourceName("Checking account")
                            .addTag("Barbecue preparation")
                            .build()
                    )
                    .applyRules(false)
                    .errorIfDuplicateHash(false)
                    .fireWebhooks(true)
                    .groupTitle("Split transaction title.")
                    .build()
            )

        transactionSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val transactionService = client.transactions()

        val transactionSingle =
            transactionService.retrieve(
                TransactionRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        transactionSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val transactionService = client.transactions()

        val transactionSingle =
            transactionService.update(
                TransactionUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .applyRules(false)
                    .fireWebhooks(true)
                    .groupTitle("Split transaction title.")
                    .addTransaction(
                        TransactionUpdateParams.Transaction.builder()
                            .amount("123.45")
                            .billId("111")
                            .billName("Monthly rent")
                            .bookDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .budgetId("4")
                            .categoryId("43")
                            .categoryName("Groceries")
                            .currencyCode("EUR")
                            .currencyId("12")
                            .date(OffsetDateTime.parse("2026-04-01T00:00:00+00:00"))
                            .description("Vegetables")
                            .destinationIban("NL02ABNA0123456789")
                            .destinationId("2")
                            .destinationName("Buy and Large")
                            .dueDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .externalId("external_id")
                            .externalUrl("external_url")
                            .foreignAmount("123.45")
                            .foreignCurrencyCode("USD")
                            .foreignCurrencyId("17")
                            .interestDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .internalReference("internal_reference")
                            .invoiceDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .notes("Some example notes")
                            .order(0)
                            .paymentDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .processDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .reconciled(false)
                            .sepaBatchId("sepa_batch_id")
                            .sepaCc("sepa_cc")
                            .sepaCi("sepa_ci")
                            .sepaCountry("sepa_country")
                            .sepaCtId("sepa_ct_id")
                            .sepaCtOp("sepa_ct_op")
                            .sepaDb("sepa_db")
                            .sepaEp("sepa_ep")
                            .sourceIban("NL02ABNA0123456789")
                            .sourceId("2")
                            .sourceName("Checking account")
                            .addTag("Barbecue preparation")
                            .transactionJournalId("123")
                            .type(TransactionTypeProperty.WITHDRAWAL)
                            .build()
                    )
                    .build()
            )

        transactionSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val transactionService = client.transactions()

        val transactionArray =
            transactionService.list(
                TransactionListParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val transactionService = client.transactions()

        transactionService.delete(
            TransactionDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listAttachments() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val transactionService = client.transactions()

        val attachmentArray =
            transactionService.listAttachments(
                TransactionListAttachmentsParams.builder()
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
    fun listPiggyBankEvents() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val transactionService = client.transactions()

        val piggyBankEventArray =
            transactionService.listPiggyBankEvents(
                TransactionListPiggyBankEventsParams.builder()
                    .id("123")
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        piggyBankEventArray.validate()
    }
}
