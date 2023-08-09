package com.jayeandon.libtest01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jayeandon.wws.TestLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestLibrary.showToast(this, "라이브러리 테스트입니다.")
    }
}