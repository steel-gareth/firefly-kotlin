// File generated from our OpenAPI spec by Stainless.

package com.configure_me_emcees_prod_testing_5.api.errors

import com.configure_me_emcees_prod_testing_5.api.core.JsonValue
import com.configure_me_emcees_prod_testing_5.api.core.http.Headers

abstract class MoreConflictingServiceException
protected constructor(message: String, cause: Throwable? = null) :
    MoreConflictingException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
