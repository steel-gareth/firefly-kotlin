@file:JvmName("EmptyHandler")

package com.firefly.api.core.handlers

import com.firefly.api.core.http.HttpResponse
import com.firefly.api.core.http.HttpResponse.Handler

internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
