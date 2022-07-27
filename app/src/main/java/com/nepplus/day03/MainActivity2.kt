package com.nepplus.day03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nepplus.day03.adapters.StudentListViewAdapter
import com.nepplus.day03.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {

    //이건 데이터를 무더기로 저장하기 위한 것
    val mStudentList = ArrayList<StudentData>()

    //이건 어답터로 여기에 붙여넣을거다
    lateinit var mStudentListViewAdapter: StudentListViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //학생 더미 데이터
        mStudentList.add(StudentData("김민철", "서울시 서대문구", 1990))
        mStudentList.add(StudentData("김민철", "서울시 서대문구", 1994))
        mStudentList.add(StudentData("함상민", "서울시 종로구", 1993))
        mStudentList.add(StudentData("허신지", "서울시 서대문구", 1999))
        mStudentList.add(StudentData("유수아", "서울시 마포구", 2002))
        mStudentList.add(StudentData("윤예은", "서울시 마포구", 2002))
        mStudentList.add(StudentData("윤예은", "서울시 마포구", 2002))
        mStudentList.add(StudentData("윤예은", "서울시 마포구", 2002))
        mStudentList.add(StudentData("윤예은", "서울시 마포구", 2002))
        mStudentList.add(StudentData("윤예은", "서울시 마포구", 2002))

        //어답터 객체화 => 우리가 만들어놓은 ArrayList를 전달하는 코드
        mStudentListViewAdapter =
            StudentListViewAdapter(this, R.layout.student_list_item, mStudentList)

        //id가 mainListView에다가
        mainListView.adapter = mStudentListViewAdapter





        //리스트 뷰 이벤트 처리
        mainListView.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this, "${mStudentList[position].name}님 클릭됨", Toast.LENGTH_SHORT).show()

        }

        //롱 클릭시 이벤트 처리임// 잘 모르겠음
        mainListView.setOnItemLongClickListener { adapterView, view, position, l ->
            Toast.makeText(this, "${mStudentList[position].name}님 롱클릭됨", Toast.LENGTH_SHORT).show()

            //꾹 누르면 삭제시켜주는 이벤트트
            mStudentList.removeAt(position)
            //변경된 내용을 처리해주는(그래야 삭제 후 안팅김!!)
            mStudentListViewAdapter.notifyDataSetChanged()

            //true해야 좋음....자세한거는 애매함
            return@setOnItemLongClickListener true
        }

    }
}