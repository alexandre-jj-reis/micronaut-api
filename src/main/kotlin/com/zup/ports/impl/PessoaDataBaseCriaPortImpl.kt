package com.zup.ports.impl

import com.zup.adapters.saida.PessoaRepository
import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseCriaPort
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PessoaDataBaseCriaPortImpl : PessoaDataBaseCriaPort {

    @Inject
    lateinit var pessoaRepository: PessoaRepository

    override fun execute(pessoa: Pessoa): Pessoa {
        return pessoaRepository.save(pessoa)
    }
}