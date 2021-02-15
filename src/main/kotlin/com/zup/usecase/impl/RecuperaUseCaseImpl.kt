package com.zup.usecase.impl

import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseRecuperaPort
import com.zup.usecase.RecuperaUseCase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RecuperaUseCaseImpl : RecuperaUseCase {

    @Inject
    lateinit var pessoaDataBaseRecuperaPort: PessoaDataBaseRecuperaPort

    override fun execute(id: String): Pessoa {
       return pessoaDataBaseRecuperaPort.execute(id = id)
    }
}