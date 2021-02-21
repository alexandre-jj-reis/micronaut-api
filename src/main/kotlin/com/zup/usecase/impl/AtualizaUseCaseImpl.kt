package com.zup.usecase.impl

import com.zup.dto.PessoaDTO
import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseAtualizaPort
import com.zup.usecase.AtualizaUseCase
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AtualizaUseCaseImpl : AtualizaUseCase {

    @Inject
    lateinit var pessoaDataBaseAtualizaPort: PessoaDataBaseAtualizaPort

    private val logger = LoggerFactory.getLogger(AtualizaUseCaseImpl::class.java)

    override fun execute(pessoa: PessoaDTO): Pessoa {
        logger.info("Atualizando pessoa com o id : ${pessoa.id}")
        val pessoaEntity = Pessoa(pessoa.id!!,pessoa.nome)
        return pessoaDataBaseAtualizaPort.execute(pessoaEntity)
    }
}