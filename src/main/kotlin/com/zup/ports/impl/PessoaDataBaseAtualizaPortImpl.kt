package com.zup.ports.impl

import com.zup.adapters.saida.PessoaRepository
import com.zup.entities.Pessoa
import com.zup.ports.PessoaDataBaseAtualizaPort
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PessoaDataBaseAtualizaPortImpl : PessoaDataBaseAtualizaPort {

    @Inject
    lateinit var pessoaRepository: PessoaRepository

    override fun execute(pessoa: Pessoa): Pessoa {
        val pessoaAchada = pessoaRepository.findById(pessoa.id)
        if (pessoaAchada.isPresent) pessoaAchada.get().nome = pessoa.nome

        return pessoaRepository.update(pessoa)
    }
}