package com.example.init_project

import android.util.Log

class MyClass (var name: String? = null, var number: Int = 99) {

    // 프로퍼티
    var title: String = ""
    var age : Int = 0

    // 기본 생성자
    init {
        Log.d("TAG", ": init() 호출됨 ")
    }
}
