package com.example.questapi.apiservice

import com.example.questapi.modeldata.DataSiswa
import retrofit2.Response
import retrofit2.http.*

interface ServiceApiSiswa {

    // LIST
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    // DETAIL
    @GET("baca1Teman.php")
    suspend fun getSatuSiswa(
        @Query("id") id: Int
    ): DataSiswa

    @POST("insertTM.php")
    suspend fun postSiswa(
        @Body data: DataSiswa
    ): Response<Void>

    @PUT("editTM.php")
    suspend fun editSatuSiswa(
        @Query("id") id: Int,
        @Body data: DataSiswa
    ): Response<Void>

    @DELETE("deleteTM.php")
    suspend fun hapusSatuSiswa(
        @Query("id") id: Int
    ): Response<Void>
}
