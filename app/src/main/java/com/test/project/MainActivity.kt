package com.test.project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        var personData: String? = null
    }

    private val readerActivityLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            // ReaderActivity에서 전달한 데이터를 Companion Object를 통해 가져옴
            val personId = personData
            println("받은 데이터: $personData")
            Toast.makeText(this, "받은 데이터: $personId", Toast.LENGTH_LONG).show()
        } else {
            println("받은 데이터: $personData")
            Toast.makeText(this, "취소됨", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUi()
    }

    private fun setUi() {
        val startButton = findViewById<Button>(R.id.bt_st_rt12)

        startButton.setOnClickListener {
            val intent = Intent(this, ReaderActivity::class.java)
            readerActivityLauncher.launch(intent)
        }
    }
}
