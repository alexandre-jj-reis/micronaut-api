package com.zup.ports.impl

import com.zup.adapters.saida.PessoaRepository
import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseDeletaPort
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PessoaDataBaseDeletaPortImpl : PessoaDataBaseDeletaPort{

    @Inject
    lateinit var pessoaRepository: PessoaRepository

    override fun execute(id: String) {
       pessoaRepository.deleteById(id)
    }
}