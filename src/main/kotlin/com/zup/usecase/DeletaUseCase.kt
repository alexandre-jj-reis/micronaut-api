package com.zup.usecase

import io.micronaut.context.annotation.Provided

@Provided
interface DeletaUseCase {
    fun execute(id : String)
}