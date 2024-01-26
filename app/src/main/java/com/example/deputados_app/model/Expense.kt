package com.example.deputados_app.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root
import java.math.BigDecimal
@Root(name = "despesas", strict = false)
data class Expense (
    @field:Element(name = "ano")
    val ano: String,

    @field:Element(name = "mes")
    val mes: String,

    @field:Element(name = "tipoDespesa")
    val type: String,

    @field:Element(name = "codDocumento")
    val documentCod: Int,

    @field:Element(name = "nomeFornecedor")
    val provider: String,

    @field:Element(name = "cnpjCpfFornecedor")
    val cnpj: String,

    @field:Element(name = "valorLiquido")
    val amount: BigDecimal
)