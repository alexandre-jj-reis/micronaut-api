package com.zup.usecase.impl

import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseListaTodoPort
import com.zup.usecase.RecuperaTudoPessoaUseCase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RecuperaTudoPessoaImpl : RecuperaTudoPessoaUseCase{

    @Inject
    lateinit var recuperaPort: PessoaDataBaseListaTodoPort

    override fun execute(): MutableIterable<Pessoa> {
        return recuperaPort.execute()
    }
}