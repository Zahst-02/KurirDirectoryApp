package com.latihan.kurirdirectoryapp

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    // Mengambil seluruh koleksi data pengguna (10 data)
    @GET("users")
    suspend fun getAllUsers(): Response<List<UserResponse>>
}
