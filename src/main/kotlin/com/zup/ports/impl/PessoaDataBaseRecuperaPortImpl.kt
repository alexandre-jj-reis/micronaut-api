package com.zup.ports.impl

import com.zup.adapters.saida.PessoaRepository
import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseRecuperaPort
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PessoaDataBaseRecuperaPortImpl : PessoaDataBaseRecuperaPort{

    @Inject
    lateinit var pessoaRepository: PessoaRepository

    override fun execute(id: String): Pessoa {
        return pessoaRepository.findById(id).get()
    }
}