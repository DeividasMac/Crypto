package com.mac.cryptocurrencyApp.domain.repository

import com.mac.cryptocurrencyApp.data.remote.dto.CoinDetailDto
import com.mac.cryptocurrencyApp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}