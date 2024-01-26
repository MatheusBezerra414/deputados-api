package com.example.deputados_app.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "deputado", strict = false)
data class Deputado (
    @field:Element(name = "id")
    val id: Int,

    val isFavorite: Boolean = false,
    @field:Element(name = "nome")
    val name: String,

    @field:Element(name = "urlFoto")
    val image: Int,

    @field:Element(name = "siglaUf")
    val stateFrom: String,

    val expenses: List<Expense>? = null
)
