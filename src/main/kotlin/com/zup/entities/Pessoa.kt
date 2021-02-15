package com.zup.entities

import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Pessoa(
        @Id
        var id : String = "",

        var nome: String = ""
)