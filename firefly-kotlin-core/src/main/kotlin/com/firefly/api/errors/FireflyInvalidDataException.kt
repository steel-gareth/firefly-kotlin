package com.firefly.api.errors

class FireflyInvalidDataException(message: String? = null, cause: Throwable? = null) :
    FireflyException(message, cause)
