package com.example.perpustakaan.core.data.source.remote.network

import com.example.perpustakaan.List.Peminjam
import com.example.perpustakaan.core.data.source.remote.request.LoginRequest
import com.example.perpustakaan.core.data.source.remote.request.RegisterRequest
import com.example.perpustakaan.core.data.source.remote.response.LoginResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @POST("auth/peminjam")
    suspend fun login(
        @Body login:LoginRequest
    ):Response<LoginResponse>
    @POST("peminjam")
    suspend fun register(
        @Body login:RegisterRequest
    ):Response<ResponseBody>

    @GET("me/peminjam")
    suspend fun getMePeminjam(
        @Header("Authorization") token: String
    ):Response<ResponseBody>

//    @GET("peminjam/{peminjamID}")
//    fun getUser(@Path("peminjamID") peminjamID: String): Call<Peminjam>
}