package com.nepplus.day03.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nepplus.day03.R
import com.nepplus.day03.datas.StudentData

class StudentListViewAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //1 한 칸의 xml을 연결
        var tempRow = convertView
        if(tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)//inflate = 연결해주는 것
        }
        val row = tempRow!!
        //2 실제 데이터 반영


        return row
    }

}