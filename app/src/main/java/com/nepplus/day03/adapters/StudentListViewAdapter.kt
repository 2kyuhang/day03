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

    //position은 반복문처럼 돌아서 해당 인덱스를 준다
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
        var koreanAge = 2022 - mList[position].birthYear + 1
        //mList안에 StudentData가 리스트 형식으로 들어가 있어
        //이렇게 꺼내 써야 한다!!
        koreanAge = mList[position].getKoreanAge(2022).toInt()
        row.ageTxt.text = "(${koreanAge}세)"
        return row
    }



}