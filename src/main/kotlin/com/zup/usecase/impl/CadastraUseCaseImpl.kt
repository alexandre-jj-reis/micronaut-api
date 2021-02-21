package com.zup.usecase.impl

import com.zup.dto.PessoaDTO
import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseCriaPort
import com.zup.usecase.CadastraUseCase
import org.slf4j.LoggerFactory
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CadastraUseCaseImpl : CadastraUseCase {

    @Inject
    lateinit var pessoaDataBaseCriaPort: PessoaDataBaseCriaPort

    private val logger = LoggerFactory.getLogger(CadastraUseCaseImpl::class.java)

    override fun execute(pessoa: PessoaDTO): Pessoa {
        val pessoaEntity = Pessoa(UUID.randomUUID().toString(),pessoa.nome)
        logger.info("Cadastrando pessoa com o ID: ${pessoaEntity.id}")
        return pessoaDataBaseCriaPort.execute(pessoa = pessoaEntity)
    }
}