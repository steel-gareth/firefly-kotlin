// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.async

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClientAsync
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachableType
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentCreateParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentDeleteParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentDownloadParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentListParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentRetrieveParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentUpdateParams
import com.configure_me_emcees_prod_testing_5.api.models.attachments.AttachmentUploadParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class AttachmentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val attachmentServiceAsync = client.attachments()

        val attachmentSingle =
            attachmentServiceAsync.create(
                AttachmentCreateParams.builder()
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .attachableId("134")
                    .attachableType(AttachableType.BILL)
                    .filename("file.pdf")
                    .notes("Some notes")
                    .title("Some PDF file")
                    .build()
            )

        attachmentSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val attachmentServiceAsync = client.attachments()

        val attachmentSingle =
            attachmentServiceAsync.retrieve(
                AttachmentRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        attachmentSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val attachmentServiceAsync = client.attachments()

        val attachmentSingle =
            attachmentServiceAsync.update(
                AttachmentUpdateParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .filename("file.pdf")
                    .notes("Some notes")
                    .title("Some PDF file")
                    .build()
            )

        attachmentSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val attachmentServiceAsync = client.attachments()

        val attachmentArray =
            attachmentServiceAsync.list(
                AttachmentListParams.builder()
                    .limit(10)
                    .page(1)
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        attachmentArray.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val attachmentServiceAsync = client.attachments()

        attachmentServiceAsync.delete(
            AttachmentDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Test
    suspend fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            EmceesProdTesting5OkHttpClientAsync.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        val attachmentServiceAsync = client.attachments()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            attachmentServiceAsync.download(
                AttachmentDownloadParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun upload() {
        val client = EmceesProdTesting5OkHttpClientAsync.fromEnv()
        val attachmentServiceAsync = client.attachments()

        attachmentServiceAsync.upload(
            AttachmentUploadParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .body("Example data")
                .build()
        )
    }
}
