package com.zup.usecase.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/zup/usecase/impl/CadastraUseCaseImpl;", "Lcom/zup/usecase/CadastraUseCase;", "()V", "pessoaDataBaseCriaPort", "Lcom/zup/ports/PessoaDataBaseCriaPort;", "getPessoaDataBaseCriaPort", "()Lcom/zup/ports/PessoaDataBaseCriaPort;", "setPessoaDataBaseCriaPort", "(Lcom/zup/ports/PessoaDataBaseCriaPort;)V", "execute", "Lcom/zup/entities/Pessoa;", "pessoa", "alexandre"})
@javax.inject.Singleton()
public final class CadastraUseCaseImpl implements com.zup.usecase.CadastraUseCase {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.zup.ports.PessoaDataBaseCriaPort pessoaDataBaseCriaPort;
    
    @org.jetbrains.annotations.NotNull()
    public final com.zup.ports.PessoaDataBaseCriaPort getPessoaDataBaseCriaPort() {
        return null;
    }
    
    public final void setPessoaDataBaseCriaPort(@org.jetbrains.annotations.NotNull()
    com.zup.ports.PessoaDataBaseCriaPort p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zup.entities.Pessoa execute(@org.jetbrains.annotations.NotNull()
    com.zup.entities.Pessoa pessoa) {
        return null;
    }
    
    public CadastraUseCaseImpl() {
        super();
    }
}