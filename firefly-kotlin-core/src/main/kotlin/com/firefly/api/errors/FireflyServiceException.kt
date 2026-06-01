// File generated from our OpenAPI spec by Stainless.

package com.firefly.api.errors

import com.firefly.api.core.JsonValue
import com.firefly.api.core.http.Headers

abstract class FireflyServiceException
protected constructor(message: String, cause: Throwable? = null) :
    FireflyException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
