package com.zup.adapters.entrada

import com.zup.dto.PessoaDTO
import com.zup.entities.Pessoa
import com.zup.usecase.*
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import javax.inject.Inject

@Controller("/pessoa/v1")
class PessoaController() {

    @Inject
    lateinit var cadastraUseCase: CadastraUseCase

    @Inject
    lateinit var recuperaUseCase: RecuperaUseCase

    @Inject
    lateinit var atualizaUseCase: AtualizaUseCase

    @Inject
    lateinit var recuperaTudoPessoaUseCase: RecuperaTudoPessoaUseCase

    @Inject
    lateinit var deletaUseCase: DeletaUseCase

    @Post("/")
    fun cadastraPessoa(@Body pessoa : PessoaDTO) : HttpResponse<Pessoa>{
        return HttpResponse.created(cadastraUseCase.execute(pessoa = pessoa));
    }

    @Get("/{id}")
    fun recuperaPessoa(@PathVariable id: String) : HttpResponse<Pessoa>{
        return HttpResponse.ok(recuperaUseCase.execute(id = id));
    }

    @Put("/")
    fun atualizaPessoa(@Body pessoa : PessoaDTO) : HttpResponse<Pessoa>{
        return HttpResponse.ok(atualizaUseCase.execute(pessoa = pessoa));
    }

    @Get("/")
    fun recuperaTodasPessoas() : HttpResponse<MutableIterable<Pessoa>>{
        return HttpResponse.ok(recuperaTudoPessoaUseCase.execute());
    }

    @Delete("/{id}")
    fun deletaPessoa(@PathVariable id : String) : HttpResponse<String>{
        deletaUseCase.execute(id)
        return HttpResponse.ok("Deletado com sucesso.");
    }
}