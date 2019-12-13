package com.example.coroutines_mvp.mvp.view

import com.example.coroutines_mvp.mvp.BasePresenter
import com.example.coroutines_mvp.mvp.BaseView
import com.example.coroutines_mvp.mvp.presenter.GetStudentPresenter

interface GetStudentView:BaseView {
    fun showListStudent()
}