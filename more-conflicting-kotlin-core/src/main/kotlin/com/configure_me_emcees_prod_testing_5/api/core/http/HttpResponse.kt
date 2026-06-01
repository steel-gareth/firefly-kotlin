// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.core.http

import java.io.InputStream

interface HttpResponse : AutoCloseable {

    fun statusCode(): Int

    fun headers(): Headers

    fun body(): InputStream

    interface Handler<T> {

        fun handle(response: HttpResponse): T
    }
}
