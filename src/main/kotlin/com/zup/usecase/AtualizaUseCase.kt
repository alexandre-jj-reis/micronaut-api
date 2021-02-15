package com.zup.usecase

import com.zup.entities.Pessoa
import io.micronaut.context.annotation.Provided

@Provided
interface AtualizaUseCase {
    fun execute(pessoa: Pessoa) : Pessoa
}