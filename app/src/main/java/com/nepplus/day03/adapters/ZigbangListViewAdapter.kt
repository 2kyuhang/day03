package com.nepplus.day03.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nepplus.day03.R
import com.nepplus.day03.datas.StudentData
import com.nepplus.day03.datas.ZigbangData
import kotlinx.android.synthetic.main.student_list_item.view.*
import kotlinx.android.synthetic.main.zigbang_list_item.view.*

//필요한 매개변수를받는다 이때// 중요한것이 리스트는 <사용하는> 타입이여야 한다
class ZigbangListViewAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<ZigbangData>
) : ArrayAdapter<ZigbangData>(mContext, resId, mList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        //컨버터 뷰가 그 화면에 보여주는 틀인데 없으면 만들어준다
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(resId, null)
        }

        //있다면 변수에 담아서
        var row = tempRow!!

        //그 아이템 안에 각각의 요소마다 정보를 넣어준다
        row.zmoneyTxt.text = "${mList[position].money}천만원"
        row.zaddressTxt.text = mList[position].address
        row.zoptionTxt.text = mList[position].option


//그리고 리턴
        return row
    }
}