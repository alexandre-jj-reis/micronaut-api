package com.zup.ports.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/zup/ports/impl/PessoaDataBaseDeletaPortImpl;", "Lcom/zup/ports/PessoaDataBaseDeletaPort;", "()V", "pessoaRepository", "Lcom/zup/adapters/saida/PessoaRepository;", "getPessoaRepository", "()Lcom/zup/adapters/saida/PessoaRepository;", "setPessoaRepository", "(Lcom/zup/adapters/saida/PessoaRepository;)V", "execute", "", "id", "", "alexandre"})
@javax.inject.Singleton()
public final class PessoaDataBaseDeletaPortImpl implements com.zup.ports.PessoaDataBaseDeletaPort {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.zup.adapters.saida.PessoaRepository pessoaRepository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.zup.adapters.saida.PessoaRepository getPessoaRepository() {
        return null;
    }
    
    public final void setPessoaRepository(@org.jetbrains.annotations.NotNull()
    com.zup.adapters.saida.PessoaRepository p0) {
    }
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public PessoaDataBaseDeletaPortImpl() {
        super();
    }
}