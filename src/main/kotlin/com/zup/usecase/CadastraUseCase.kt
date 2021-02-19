package com.zup.usecase

import com.zup.dto.PessoaDTO
import com.zup.entities.Pessoa
import io.micronaut.context.annotation.Provided

@Provided
interface CadastraUseCase {
    fun execute(pessoa: PessoaDTO) : Pessoa
}