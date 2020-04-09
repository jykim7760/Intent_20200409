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

fun setupEvents() {
    dialBtn.setOnClickListener {

        //        입력한 번호로 전화를 걸도록 직접 코드 수정
//
//        val myUri = Uri.parse(Intent.ACTION_DIAL, callBtn)
//        val myIntent = Intent(Intent.ACTION_DIAL, myUri)
//


//        어느 화면으로 갈지 명시 -> uri를 이용해서 명시
        val myuri = Uri.parse("inputPhoneNum")
        val myIntent = Intent(Intent.ACTION_DIAL, myuri)
        startActivity(myIntent)


        calllBtn.setOnClickListener {

            val myuri = Uri.parse("tel:01099237760")
            val myIntent = Intent(Intent.ACTION_DIAL, myuri)
            startActivity(myIntent)

            val inputPhoneNum = phoneNumEdt.text.toString()

        }
    }

    smsBtn.setOnClickListener {

        val myUri = Uri.parse("smsto:01099237760")
        val myIntent = Intent(Intent.ACTION_SENDTO, myUri)
        myIntent.putExtra("sms_body", "자동내용입력")

        startActivity(myIntent)

    }

    naver.setOnClickListener {

        val myUri = Uri.parse("https://naver.com")
        val myIntent = Intent(Intent.ACTION_VIEW, myUri)
//            myIntent.putExtra("sms_body", "자동내용입력")

        startActivity(myIntent)
    }



        naver.setOnClickListener {

            val myUri = Uri.parse("maket://details?id=com.kakao.talk")
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
//            myIntent.putExtra("sms_body", "자동내용입력")

            startActivity(myIntent)

        }




