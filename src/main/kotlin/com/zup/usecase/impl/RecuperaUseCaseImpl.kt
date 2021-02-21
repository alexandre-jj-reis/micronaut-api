package com.zup.usecase.impl

import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseRecuperaPort
import com.zup.usecase.RecuperaUseCase
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RecuperaUseCaseImpl : RecuperaUseCase {

    @Inject
    lateinit var pessoaDataBaseRecuperaPort: PessoaDataBaseRecuperaPort

    private val logger = LoggerFactory.getLogger(RecuperaUseCaseImpl::class.java)

    override fun execute(id: String): Pessoa {
        logger.info("Procurando a pessoa com ID: $id")
       return pessoaDataBaseRecuperaPort.execute(id = id)
    }
}