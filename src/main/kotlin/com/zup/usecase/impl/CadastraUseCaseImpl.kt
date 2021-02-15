package com.zup.usecase.impl

import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseCriaPort
import com.zup.usecase.CadastraUseCase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CadastraUseCaseImpl() : CadastraUseCase {

    @Inject
    lateinit var pessoaDataBaseCriaPort: PessoaDataBaseCriaPort

    override fun execute(pessoa: Pessoa): Pessoa {
        return pessoaDataBaseCriaPort.execute(pessoa = pessoa)
    }
}