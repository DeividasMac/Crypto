package com.mac.cryptocurrencyApp.presentation.coin_list

import com.mac.cryptocurrencyApp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
