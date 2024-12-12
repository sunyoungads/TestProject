package com.test.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUi()
    }

    private fun setUi() {
        val startButton = findViewById<Button>(R.id.bt_st_rt12)

        startButton.setOnClickListener {
            val intent = Intent(this, ReaderActivity::class.java)
            startActivity(intent)
        }
    }

//    override fun onActivityResult() {
    // TODO : 결과 값 받기
    // hint : Activity.RESULT_OK, Activity.RESULT_CANCELED 기준으로 분기 할 것
//    }
}
