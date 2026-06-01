package com.configure_me_emcees_prod_testing_5.api.core.http

import com.configure_me_emcees_prod_testing_5.api.core.RequestOptions
import java.lang.AutoCloseable

interface HttpClient : AutoCloseable {

    fun execute(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    suspend fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse
}
