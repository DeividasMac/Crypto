package com.mac.cryptocurrencyApp.data.remote

import com.mac.cryptocurrencyApp.data.remote.dto.CoinDetailDto
import com.mac.cryptocurrencyApp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinsById(@Path("coinId") coinId: String): CoinDetailDto
}