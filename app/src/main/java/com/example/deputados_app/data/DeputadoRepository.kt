package com.example.deputados_app.data

import com.example.deputados_app.model.Deputado
import com.example.deputados_app.model.Expense
import com.example.deputados_app.network.DeputadoApiService

interface DeputadoRepository {
    suspend fun getDeputado(): List<Deputado>
    suspend fun getExpense(idDeputado: Int): List<Expense>
}

class NetworkDeputadoRepository(
    private val deputadoApiService: DeputadoApiService
): DeputadoRepository{
    override suspend fun getDeputado(): List<Deputado> = deputadoApiService.getDeputado()
    override suspend fun getExpense(idDeputado: Int): List<Expense> = deputadoApiService.getExpense(idDeputado)
}