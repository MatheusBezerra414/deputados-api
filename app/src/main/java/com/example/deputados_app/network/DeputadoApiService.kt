package com.example.deputados_app.network

import com.example.deputados_app.model.Deputado
import com.example.deputados_app.model.Expense
import retrofit2.http.GET
import retrofit2.http.Path

interface DeputadoApiService {
    // https://dadosabertos.camara.leg.br/api/v2/
    @GET("deputados?siglaPartido=republicanos&ordem=ASC&ordenarPor=nome")
    suspend fun getDeputado(): List<Deputado>

    @GET("deputados/{id}/despesas?ordem=ASC&ordenarPor=ano")
    suspend fun getExpense(@Path("id") idDeputado: Int): List<Expense>
}