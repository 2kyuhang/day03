package com.nepplus.day03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.day03.adapters.StudentListViewAdapter
import com.nepplus.day03.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()
    lateinit var mStudentListViewAdapter: StudentListViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //학생 더미 데이터
        mStudentList.add( StudentData("김민철", "서울시 서대문구", 1990) )
        mStudentList.add( StudentData("김민철", "서울시 서대문구", 1994) )
        mStudentList.add( StudentData("함상민", "서울시 종로구", 1993) )
        mStudentList.add( StudentData("허신지", "서울시 서대문구", 1999) )
        mStudentList.add( StudentData("유수아", "서울시 마포구", 2002) )
        mStudentList.add( StudentData("윤예은", "서울시 마포구", 2002) )
        mStudentList.add( StudentData("윤예은", "서울시 마포구", 2002) )
        mStudentList.add( StudentData("윤예은", "서울시 마포구", 2002) )
        mStudentList.add( StudentData("윤예은", "서울시 마포구", 2002) )
        mStudentList.add( StudentData("윤예은", "서울시 마포구", 2002) )

        //어답터 객체화 => 우리가 만들어놓은 ArrayList를 전달하는 코드
        mStudentListViewAdapter = StudentListViewAdapter(this, R.layout.student_list_item, mStudentList)

        mainListView.adapter = mStudentListViewAdapter
    }
}