package com.zup.ports

import com.zup.entities.Pessoa
import io.micronaut.context.annotation.Provided

@Provided
interface PessoaDataBaseCriaPort {
    fun execute(pessoa: Pessoa) : Pessoa
}