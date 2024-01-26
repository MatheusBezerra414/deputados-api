package com.example.deputados_app.data

import com.example.deputados_app.network.DeputadoApiService
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

interface AppContainer {
    val deputadoRepository: DeputadoRepository
}

class DefaultAppContainer: AppContainer{
    val baseURL = "https://dadosabertos.camara.leg.br/api/v2/"

    val retrofit = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()

    private val retrofitService: DeputadoApiService by lazy {
         retrofit.create(DeputadoApiService::class.java)
    }

    override val deputadoRepository: DeputadoRepository by lazy {
        NetworkDeputadoRepository(retrofitService)
    }

}