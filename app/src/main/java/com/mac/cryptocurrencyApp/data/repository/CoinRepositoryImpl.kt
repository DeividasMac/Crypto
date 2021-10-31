package com.mac.cryptocurrencyApp.data.repository

import com.mac.cryptocurrencyApp.data.remote.CoinPaprikaApi
import com.mac.cryptocurrencyApp.data.remote.dto.CoinDetailDto
import com.mac.cryptocurrencyApp.data.remote.dto.CoinDto
import com.mac.cryptocurrencyApp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinsById(coinId)
    }
}