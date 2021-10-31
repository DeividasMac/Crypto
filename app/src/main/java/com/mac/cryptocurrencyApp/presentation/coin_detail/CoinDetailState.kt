package com.mac.cryptocurrencyApp.presentation.coin_detail

import com.mac.cryptocurrencyApp.domain.model.Coin
import com.mac.cryptocurrencyApp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
