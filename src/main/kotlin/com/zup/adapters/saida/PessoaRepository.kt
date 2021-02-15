package com.zup.adapters.saida

import com.zup.entities.Pessoa
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface PessoaRepository : CrudRepository <Pessoa,String>{
}