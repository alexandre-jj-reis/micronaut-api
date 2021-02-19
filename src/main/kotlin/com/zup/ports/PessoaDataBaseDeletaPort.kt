package com.zup.ports

import io.micronaut.context.annotation.Provided

@Provided
interface PessoaDataBaseDeletaPort {
    fun execute(id : String)
}