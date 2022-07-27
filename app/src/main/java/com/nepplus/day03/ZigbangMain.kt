package com.nepplus.day03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.day03.adapters.ZigbangListViewAdapter
import com.nepplus.day03.datas.ZigbangData
import kotlinx.android.synthetic.main.activity_main.*

class ZigbangMain : AppCompatActivity() {

    var mZigbangList = ArrayList<ZigbangData>()
    //어답터를 미리 만들어 두고
    lateinit var mZigbangListViewAdapter: ZigbangListViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zigbang_main)

        mZigbangList.add(ZigbangData(8000,"마포구 서교동 1층", "망원/홍대역 풀옵션 넓은"))
        mZigbangList.add(ZigbangData(7500,"마포구 서교동 3층","신혼부부의 보금자리"))
        mZigbangList.add(ZigbangData(700,"마포쿠 서교동 5층","홍대입구역 근천"))
        mZigbangList.add(ZigbangData(6400,"마포구 서산동 2층","좋음"))
        mZigbangList.add(ZigbangData(8000,"마포구 서교동 1층", "망원/홍대역 풀옵션 넓은"))
        mZigbangList.add(ZigbangData(7500,"마포구 서교동 3층","신혼부부의 보금자리"))
        mZigbangList.add(ZigbangData(700,"마포쿠 서교동 5층","홍대입구역 근천"))
        mZigbangList.add(ZigbangData(6400,"마포구 서산동 2층","좋음"))
        mZigbangList.add(ZigbangData(6400,"마포구 서산동 2층","좋음"))
        mZigbangList.add(ZigbangData(7500,"마포구 서교동 3층","신혼부부의 보금자리"))

        mZigbangListViewAdapter =
            ZigbangListViewAdapter(this@ZigbangMain, R.layout.zigbang_list_item, mZigbangList)

        mainListView.adapter = mZigbangListViewAdapter


    }
}