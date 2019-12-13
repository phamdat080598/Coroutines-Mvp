package com.example.coroutines_mvp.mvp

import com.example.coroutines_mvp.mvp.view.GetStudentView

interface BasePresenter {
    fun attackView(view:GetStudentView)
}