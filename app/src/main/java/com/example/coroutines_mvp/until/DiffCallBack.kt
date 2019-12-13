package com.example.coroutines_mvp.until

import androidx.recyclerview.widget.DiffUtil
import com.example.coroutines_mvp.data.model.Student

class DiffCallBack : DiffUtil.ItemCallback<Student>() {
    override fun areItemsTheSame(oldItem: Student, newItem: Student): Boolean {
        return oldItem.id==newItem.id
    }

    override fun areContentsTheSame(oldItem: Student, newItem: Student): Boolean {
        return oldItem==newItem
    }
}