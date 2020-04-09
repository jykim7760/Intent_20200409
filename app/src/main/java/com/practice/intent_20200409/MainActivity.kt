package com.practice.intent_20200409

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()



    }

fun setupEvents(){
    dialBTN.setOnClickListener {

//        입력한 번호로 전화를 걸도록 직접 코드 수정
//
//        val myUri = Uri.parse(Intent.ACTION_DIAL, callBtn)
//        val myIntent = Intent(Intent.ACTION_DIAL, myUri)
//
val inputPhoneNum = phoneNumEdt.text.toString()



//        어느 화면으로 갈지 명시 -> uri를 이용해서 명시
        val myUri = Uri.parse("tel:01099237760")
        val myIntent = Intent(Intent.ACTION_DIAL, myUri)
        startActivity(myIntent)


    }



}




}
