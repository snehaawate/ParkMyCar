package com.example.parkmycar.feature_map.domain.usecases

import com.example.parkmycar.feature_map.domain.models.Spot
import com.example.parkmycar.feature_map.domain.repository.SpotRepository

class SaveSpot(
    private val repository: SpotRepository
) {
    suspend operator fun invoke(spot: Spot) {
        repository.insertSpot(spot)
    }
}