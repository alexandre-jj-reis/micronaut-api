package com.zup.entities


import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Pessoa(
        @Id
        var id : String = "",

        var nome: String = ""
)