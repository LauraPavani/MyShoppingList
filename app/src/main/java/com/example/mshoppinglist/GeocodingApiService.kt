package com.example.mshoppinglist

import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodingApiService {
    @GET("maps/api/geocode/json")
    suspend fun getAddressFromCoordinates(
        @Query("latlng") latlong: String,
        @Query("key") apiKey: String

    ): GeocodingResponse

}