package com.example.coroutines_mvp.mvp.presenter

import com.example.coroutines_mvp.data.Result
import com.example.coroutines_mvp.data.api.APIService
import com.example.coroutines_mvp.data.api.Client
import com.example.coroutines_mvp.data.model.Student
import com.example.coroutines_mvp.mvp.BasePresenter
import com.example.coroutines_mvp.mvp.view.GetStudentView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class GetStudentPresenter():BasePresenter{
    private lateinit var view:GetStudentView
    override fun attackView(view: GetStudentView) {
        this.view=view
    }

    suspend fun loadListStudents():Result<List<Student>> = withContext(Dispatchers.IO){
        val request = APIService.getAPIService().getListStudent()
        try {
            val response = request.await()
            if((response as List<Student>).isNotEmpty()){
                Result.Success(response)
            }else{
                Result.Error(Exception("Empty data!!!"))
            }
        }catch (e:HttpException){
            Result.Error(Exception(e.message()))
        }catch (e:Throwable){
            Result.Error(Exception("lỗi!!"))
        }
    }

}