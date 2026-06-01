// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.services.blocking

import com.configure_me_emcees_prod_testing_5.api.client.okhttp.EmceesProdTesting5OkHttpClient
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
internal class AttachmentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val attachmentService = client.attachments()

        val attachmentSingle =
            attachmentService.create(
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
    fun retrieve() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val attachmentService = client.attachments()

        val attachmentSingle =
            attachmentService.retrieve(
                AttachmentRetrieveParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        attachmentSingle.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val attachmentService = client.attachments()

        val attachmentSingle =
            attachmentService.update(
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
    fun list() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val attachmentService = client.attachments()

        val attachmentArray =
            attachmentService.list(
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
    fun delete() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val attachmentService = client.attachments()

        attachmentService.delete(
            AttachmentDeleteParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .build()
        )
    }

    @Test
    fun download(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            EmceesProdTesting5OkHttpClient.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
        val attachmentService = client.attachments()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            attachmentService.download(
                AttachmentDownloadParams.builder()
                    .id("123")
                    .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = EmceesProdTesting5OkHttpClient.fromEnv()
        val attachmentService = client.attachments()

        attachmentService.upload(
            AttachmentUploadParams.builder()
                .id("123")
                .xTraceId("40c71bbb-c676-4f24-83cf-cc725d7d7a00")
                .body("Example data")
                .build()
        )
    }
}
