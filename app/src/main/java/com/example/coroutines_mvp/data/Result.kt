package com.example.coroutines_mvp.data

sealed class Result<out T: Any> {
    class Success<out T:Any> (val a: T):Result<T>()
    class Error(val ex:Throwable):Result<Nothing>()
}