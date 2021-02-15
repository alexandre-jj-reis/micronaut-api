package com.zup.usecase.impl

import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseAtualizaPort
import com.zup.usecase.AtualizaUseCase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AtualizaUseCaseImpl : AtualizaUseCase {

    @Inject
    lateinit var pessoaDataBaseAtualizaPort: PessoaDataBaseAtualizaPort

    override fun execute(pessoa: Pessoa): Pessoa {
        return pessoaDataBaseAtualizaPort.execute(pessoa)
    }
}