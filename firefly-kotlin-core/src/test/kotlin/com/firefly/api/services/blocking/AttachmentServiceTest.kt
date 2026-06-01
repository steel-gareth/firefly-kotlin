// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.services.blocking

import com.firefly.api.client.okhttp.FireflyOkHttpClient
import com.firefly.api.models.attachments.AttachableType
import com.firefly.api.models.attachments.AttachmentCreateParams
import com.firefly.api.models.attachments.AttachmentDeleteParams
import com.firefly.api.models.attachments.AttachmentDownloadParams
import com.firefly.api.models.attachments.AttachmentListParams
import com.firefly.api.models.attachments.AttachmentRetrieveParams
import com.firefly.api.models.attachments.AttachmentUpdateParams
import com.firefly.api.models.attachments.AttachmentUploadParams
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
        val client = FireflyOkHttpClient.fromEnv()
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
        val client = FireflyOkHttpClient.fromEnv()
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
        val client = FireflyOkHttpClient.fromEnv()
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
        val client = FireflyOkHttpClient.fromEnv()
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
        val client = FireflyOkHttpClient.fromEnv()
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
        val client = FireflyOkHttpClient.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
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
        val client = FireflyOkHttpClient.fromEnv()
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
