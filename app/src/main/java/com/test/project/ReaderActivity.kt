package com.test.project

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.test.project.data.model.Person
import com.test.project.utils.PersonProvider

class ReaderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reader)

        setUi()
    }

    override fun onBackPressed() {
        Toast.makeText(this, "뒤로 가기 버튼이 비활성화되었습니다.", Toast.LENGTH_SHORT).show()
        super.onBackPressed()
    }

    private fun setUi() {
        val exitButton = findViewById<Button>(R.id.exitButton2)
        val aTypeButton = findViewById<Button>(R.id.type_a_button)
        val bTypeButton = findViewById<Button>(R.id.type_b_button)

        exitButton.setOnClickListener {
            exit("c")
        }

        aTypeButton.setOnClickListener {
            exit("A")
        }

        bTypeButton.setOnClickListener {
            exit(type = "B")
        }
    }

    private fun exit(type: String) {
        val person: Person? = when (type) {
            "A" -> PersonProvider.getPersonA()
            "B" -> PersonProvider.getPersonB()
            else -> null
        }

        person?.let {
            // Companion Object에 데이터 저장
            MainActivity.personData = "ID: ${it.id}, Name: ${it.name}, Email: ${it.email}"

             // 결과 상태 설정
             setResult(Activity.RESULT_OK)
        } ?: setResult(Activity.RESULT_CANCELED)

        // Activity 종료
        finish()
    }
}
