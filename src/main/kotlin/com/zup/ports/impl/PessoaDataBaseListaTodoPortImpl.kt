package com.zup.ports.impl

import com.zup.adapters.saida.PessoaRepository
import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseListaTodoPort
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PessoaDataBaseListaTodoPortImpl : PessoaDataBaseListaTodoPort{

    @Inject
    lateinit var pessoaRepository: PessoaRepository

    override fun execute(): MutableIterable<Pessoa> {
        return pessoaRepository.findAll()
    }
}