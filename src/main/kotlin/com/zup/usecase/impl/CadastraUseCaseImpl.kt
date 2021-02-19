package com.zup.usecase.impl

import com.zup.dto.PessoaDTO
import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseCriaPort
import com.zup.usecase.CadastraUseCase
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CadastraUseCaseImpl() : CadastraUseCase {

    @Inject
    lateinit var pessoaDataBaseCriaPort: PessoaDataBaseCriaPort

    override fun execute(pessoa: PessoaDTO): Pessoa {
        val pessoaEntity = Pessoa(UUID.randomUUID().toString(),pessoa.nome)
        return pessoaDataBaseCriaPort.execute(pessoa = pessoaEntity)
    }
}