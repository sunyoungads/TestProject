package com.test.project

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ReaderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reader)

        setUi()
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
        // 뒤로가기 차단
        Toast.makeText(this, "뒤로 가기 버튼이 비활성화되었습니다.", Toast.LENGTH_SHORT).show()
    }

    private fun setUi() {
        val exitButton = findViewById<Button>(R.id.exitButton2X4y)
        val aTypeButton = findViewById<Button>(R.id.btn_a_type_7x3)
        val bTypeButton = findViewById<Button>(R.id.buttonBTypeQ2)


        exitButton.setOnClickListener {
            // 그냥 나가기
        }

        aTypeButton.setOnClickListener {
            // A타입 나가기
        }

        bTypeButton.setOnClickListener {
            // B타입 나가기
        }

    }

    private fun exit() {
        // TODO : when문 사용하여 나갈것
        // hint : setResult(Activity.RESULT_OK ...
        // A 타입 동작은 PersonProvider.getPersonA() 사용할 것
        // B 타입 동작은 PersonProvider.getPersonB() 사용할 것
    }

}
