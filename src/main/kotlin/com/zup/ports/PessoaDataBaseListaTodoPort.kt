package com.zup.ports

import com.zup.entities.Pessoa
import io.micronaut.context.annotation.Provided

@Provided
interface PessoaDataBaseListaTodoPort {
    fun execute() : MutableIterable<Pessoa>
}