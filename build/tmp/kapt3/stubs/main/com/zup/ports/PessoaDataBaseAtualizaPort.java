package com.zup.ports;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/zup/ports/PessoaDataBaseAtualizaPort;", "", "execute", "Lcom/zup/entities/Pessoa;", "pessoa", "alexandre"})
@io.micronaut.context.annotation.Provided()
public abstract interface PessoaDataBaseAtualizaPort {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.zup.entities.Pessoa execute(@org.jetbrains.annotations.NotNull()
    com.zup.entities.Pessoa pessoa);
}