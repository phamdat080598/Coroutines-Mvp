package com.example.coroutines_mvp.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.coroutines_mvp.Listener.ItemStudentListener
import com.example.coroutines_mvp.R
import com.example.coroutines_mvp.data.model.Student
import com.example.coroutines_mvp.until.DiffCallBack
import kotlinx.android.synthetic.main.item_layout.view.*

class StudentAdapter(val listener:ItemStudentListener) : ListAdapter<Student, RecyclerView.ViewHolder>(DiffCallBack()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MyViewHolder).binđ(getItem(position),listener)
    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun binđ(s:Student,listener:ItemStudentListener){
            itemView.iD.setText(s.id.toString())
            itemView.name.setText(s.name)
            itemView.setOnClickListener { listener.itemClick(s) }
        }
    }
}