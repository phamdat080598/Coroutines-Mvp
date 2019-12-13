package com.example.coroutines_mvp.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coroutines_mvp.Listener.ItemStudentListener
import com.example.coroutines_mvp.R
import com.example.coroutines_mvp.data.model.Student
import com.example.coroutines_mvp.mvp.BasePresenter
import com.example.coroutines_mvp.mvp.presenter.GetStudentPresenter
import com.example.coroutines_mvp.mvp.view.GetStudentView
import com.example.coroutines_mvp.view.adapter.StudentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ItemStudentListener,GetStudentView{
    private lateinit var studentAdater: StudentAdapter
    private lateinit var presenter: GetStudentPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createPresenter()

    }
    fun createList(){
        recycleView.layoutManager=LinearLayoutManager(this)
        recycleView.setHasFixedSize(true)
        studentAdater.submitList()
    }

    fun createPresenter(){
        presenter.attackView(this)
    }

    override fun itemClick(s: Student) {
        Toast.makeText(this@MainActivity,s.name,Toast.LENGTH_SHORT).show()
    }

    override fun showListStudent() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
