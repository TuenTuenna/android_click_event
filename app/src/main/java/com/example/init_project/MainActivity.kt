package com.example.init_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // 프로퍼티
    // 선언
    // 원시 -
    // 일반 자료형
    var myButton : Button? = null
//    lateinit var myButton : Button

    companion object {
        val TAG = "TAG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton = findViewById(R.id.my_button)

        myButton?.setOnClickListener {
            Log.d(TAG, "onCreate: ")
            this.someMethod()
        }

        val myFirstBtn = findViewById<Button>(R.id.my_button_1)
        val mySecondBtn = findViewById<Button>(R.id.my_button_2)

        myFirstBtn.setOnClickListener(this)
        mySecondBtn.setOnClickListener(this)

        val myClassInstance : MyClass = MyClass(name = null)

        val secondInstance = MyClass(name = "호호호")

        Log.d(TAG, "secondInstance.name ${secondInstance.name} / secondInstance. ${secondInstance.number}")

//        val myImageView : ImageView? =
    }

    private fun someMethod(){
        Log.d("TAG", "someMethod: ")
//        myButton.background = R.
    }

    fun myButtonClick(view: View?){
        Log.d(TAG, "myButtonClick: ")
    }

    override fun onClick(v: View?) {
        Log.d(TAG, "onClick: ")
        when(v?.id) {
            R.id.my_button_1 ->
                Log.d(TAG, "onClick: 리스너 1 클릭!")
            R.id.my_button_2 ->
                Log.d(TAG, "onClick: 리스너 2 클릭!")
        }
    }

}
