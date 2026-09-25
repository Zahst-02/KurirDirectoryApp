package com.latihan.kurirdirectoryapp

import com.google.gson.annotations.SerializedName

// Model Data Utama Pengguna / Kurir
data class UserResponse(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("username")
    val username: String,

    @SerializedName("email")
    val email: String,

    @SerializedName("phone")
    val phone: String,

    @SerializedName("company")
    val company: CompanyInfo
)

// Model Anak untuk Membaca Objek Bersarang 'company'
data class CompanyInfo(
    @SerializedName("name")
    val companyName: String
)
