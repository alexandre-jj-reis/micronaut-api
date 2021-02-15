package com.zup.usecase.impl

import com.zup.ports.PessoaDataBaseDeletaPort
import com.zup.usecase.DeletaUseCase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DeletaUseCaseImpl : DeletaUseCase{

    @Inject
    lateinit var deletaPort: PessoaDataBaseDeletaPort

    override fun execute(id: String) {
       deletaPort.execute(id = id);
    }

}