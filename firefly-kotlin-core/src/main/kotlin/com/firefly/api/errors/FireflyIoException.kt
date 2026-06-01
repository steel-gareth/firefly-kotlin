package com.firefly.api.errors

class FireflyIoException(message: String? = null, cause: Throwable? = null) :
    FireflyException(message, cause)
