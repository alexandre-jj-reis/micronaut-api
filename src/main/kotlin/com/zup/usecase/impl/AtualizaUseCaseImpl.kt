package com.zup.usecase.impl

import com.zup.dto.PessoaDTO
import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseAtualizaPort
import com.zup.usecase.AtualizaUseCase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AtualizaUseCaseImpl : AtualizaUseCase {

    @Inject
    lateinit var pessoaDataBaseAtualizaPort: PessoaDataBaseAtualizaPort

    override fun execute(pessoa: PessoaDTO): Pessoa {
        val pessoaEntity = Pessoa(pessoa.id!!,pessoa.nome)
        return pessoaDataBaseAtualizaPort.execute(pessoaEntity)
    }
}