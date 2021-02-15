package com.zup.usecase.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/zup/usecase/impl/RecuperaTudoPessoaImpl;", "Lcom/zup/usecase/RecuperaTudoPessoaUseCase;", "()V", "recuperaPort", "Lcom/zup/ports/PessoaDataBaseListaTodoPort;", "getRecuperaPort", "()Lcom/zup/ports/PessoaDataBaseListaTodoPort;", "setRecuperaPort", "(Lcom/zup/ports/PessoaDataBaseListaTodoPort;)V", "execute", "", "Lcom/zup/entities/Pessoa;", "alexandre"})
@javax.inject.Singleton()
public final class RecuperaTudoPessoaImpl implements com.zup.usecase.RecuperaTudoPessoaUseCase {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.zup.ports.PessoaDataBaseListaTodoPort recuperaPort;
    
    @org.jetbrains.annotations.NotNull()
    public final com.zup.ports.PessoaDataBaseListaTodoPort getRecuperaPort() {
        return null;
    }
    
    public final void setRecuperaPort(@org.jetbrains.annotations.NotNull()
    com.zup.ports.PessoaDataBaseListaTodoPort p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Iterable<com.zup.entities.Pessoa> execute() {
        return null;
    }
    
    public RecuperaTudoPessoaImpl() {
        super();
    }
}