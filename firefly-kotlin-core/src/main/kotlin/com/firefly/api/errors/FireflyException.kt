package com.firefly.api.errors

open class FireflyException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
