package com.zup.usecase.impl

import com.zup.ports.PessoaDataBaseDeletaPort
import com.zup.usecase.DeletaUseCase
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DeletaUseCaseImpl : DeletaUseCase{

    @Inject
    lateinit var deletaPort: PessoaDataBaseDeletaPort

    private val logger = LoggerFactory.getLogger(DeletaUseCaseImpl::class.java)

    override fun execute(id: String) {
        logger.info("Deletando a pessoa com ID : $id")
        deletaPort.execute(id = id)
    }

}