package com.nepplus.day03.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nepplus.day03.R
import com.nepplus.day03.datas.StudentData
import kotlinx.android.synthetic.main.student_list_item.view.*

class StudentListViewAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {

    //이게 계속 돌기때문에 position이 +1씩 오르는 것
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //1 한 칸의 xml을 연결
        var tempRow = convertView
        if(tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)//inflate = 연결해주는 것
        }
        val row = tempRow!!

        //2 실제 데이터 반영
        row.nameTxt.text = mList[position].name
        row.addressTxt.text = mList[position].address
        //row.ageTxt.text = mList[position].birthYear.toString()

        //변수를 활용한 String 가공
        val koreanAge = 2022 - mList[position].birthYear + 1
        row.ageTxt.text = "(${koreanAge}세)"
        return row
    }

}