package com.example.coroutines_mvp.data.api

import com.example.coroutines_mvp.data.model.Student
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface Client {
    @GET("gethocsinh.php")
    fun getListStudent():Deferred<List<Student>>
}