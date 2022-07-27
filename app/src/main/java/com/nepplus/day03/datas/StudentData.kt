package com.nepplus.day03.datas

import java.time.Year

class StudentData (val name : String , val address : String, val birthYear : Int) {

    fun getKoreanAge(year: Int): String {
        val koreanAge = ""+(year - birthYear + 1)
        return koreanAge
    }

}