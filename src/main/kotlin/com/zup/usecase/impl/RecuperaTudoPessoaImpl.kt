package com.zup.usecase.impl

import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseListaTodoPort
import com.zup.usecase.RecuperaTudoPessoaUseCase
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RecuperaTudoPessoaImpl : RecuperaTudoPessoaUseCase{

    @Inject
    lateinit var recuperaPort: PessoaDataBaseListaTodoPort

    private val logger = LoggerFactory.getLogger(RecuperaTudoPessoaImpl::class.java)

    override fun execute(): MutableIterable<Pessoa> {
        logger.info("Listando pessoas")
        return recuperaPort.execute()
    }
}