package com.zup.adapters.entrada;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001d\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0001\u0010$\u001a\u00020#H\u0007J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0001\u0010$\u001a\u00020#H\u0007J\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\"2\b\b\u0001\u0010(\u001a\u00020\'H\u0007J\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0001\u0010(\u001a\u00020\'H\u0007J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0+0\"H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006,"}, d2 = {"Lcom/zup/adapters/entrada/PessoaController;", "", "()V", "atualizaUseCase", "Lcom/zup/usecase/AtualizaUseCase;", "getAtualizaUseCase", "()Lcom/zup/usecase/AtualizaUseCase;", "setAtualizaUseCase", "(Lcom/zup/usecase/AtualizaUseCase;)V", "cadastraUseCase", "Lcom/zup/usecase/CadastraUseCase;", "getCadastraUseCase", "()Lcom/zup/usecase/CadastraUseCase;", "setCadastraUseCase", "(Lcom/zup/usecase/CadastraUseCase;)V", "deletaUseCase", "Lcom/zup/usecase/DeletaUseCase;", "getDeletaUseCase", "()Lcom/zup/usecase/DeletaUseCase;", "setDeletaUseCase", "(Lcom/zup/usecase/DeletaUseCase;)V", "recuperaTudoPessoaUseCase", "Lcom/zup/usecase/RecuperaTudoPessoaUseCase;", "getRecuperaTudoPessoaUseCase", "()Lcom/zup/usecase/RecuperaTudoPessoaUseCase;", "setRecuperaTudoPessoaUseCase", "(Lcom/zup/usecase/RecuperaTudoPessoaUseCase;)V", "recuperaUseCase", "Lcom/zup/usecase/RecuperaUseCase;", "getRecuperaUseCase", "()Lcom/zup/usecase/RecuperaUseCase;", "setRecuperaUseCase", "(Lcom/zup/usecase/RecuperaUseCase;)V", "atualizaPessoa", "Lio/micronaut/http/HttpResponse;", "Lcom/zup/entities/Pessoa;", "pessoa", "cadastraPessoa", "deletaPessoa", "", "id", "recuperaPessoa", "recuperaTodasPessoas", "", "alexandre"})
@io.micronaut.http.annotation.Controller(value = "/pessoa/v1")
public final class PessoaController {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.zup.usecase.CadastraUseCase cadastraUseCase;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.zup.usecase.RecuperaUseCase recuperaUseCase;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.zup.usecase.AtualizaUseCase atualizaUseCase;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.zup.usecase.RecuperaTudoPessoaUseCase recuperaTudoPessoaUseCase;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.zup.usecase.DeletaUseCase deletaUseCase;
    
    @org.jetbrains.annotations.NotNull()
    public final com.zup.usecase.CadastraUseCase getCadastraUseCase() {
        return null;
    }
    
    public final void setCadastraUseCase(@org.jetbrains.annotations.NotNull()
    com.zup.usecase.CadastraUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zup.usecase.RecuperaUseCase getRecuperaUseCase() {
        return null;
    }
    
    public final void setRecuperaUseCase(@org.jetbrains.annotations.NotNull()
    com.zup.usecase.RecuperaUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zup.usecase.AtualizaUseCase getAtualizaUseCase() {
        return null;
    }
    
    public final void setAtualizaUseCase(@org.jetbrains.annotations.NotNull()
    com.zup.usecase.AtualizaUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zup.usecase.RecuperaTudoPessoaUseCase getRecuperaTudoPessoaUseCase() {
        return null;
    }
    
    public final void setRecuperaTudoPessoaUseCase(@org.jetbrains.annotations.NotNull()
    com.zup.usecase.RecuperaTudoPessoaUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zup.usecase.DeletaUseCase getDeletaUseCase() {
        return null;
    }
    
    public final void setDeletaUseCase(@org.jetbrains.annotations.NotNull()
    com.zup.usecase.DeletaUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/")
    public final io.micronaut.http.HttpResponse<com.zup.entities.Pessoa> cadastraPessoa(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.zup.entities.Pessoa pessoa) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{id}")
    public final io.micronaut.http.HttpResponse<com.zup.entities.Pessoa> recuperaPessoa(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put(value = "/")
    public final io.micronaut.http.HttpResponse<com.zup.entities.Pessoa> atualizaPessoa(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.zup.entities.Pessoa pessoa) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/")
    public final io.micronaut.http.HttpResponse<java.lang.Iterable<com.zup.entities.Pessoa>> recuperaTodasPessoas() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public final io.micronaut.http.HttpResponse<java.lang.String> deletaPessoa(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String id) {
        return null;
    }
    
    public PessoaController() {
        super();
    }
}