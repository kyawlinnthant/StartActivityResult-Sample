package com.galaxytechno.activityresultcode

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class B : AppCompatActivity() {
    lateinit var btnOld: Button
    lateinit var etOld: EditText
    lateinit var btnNew: Button
    lateinit var etNew: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        btnOld = findViewById(R.id.btn_old_b)
        etOld = findViewById(R.id.et_old_b)
        btnNew = findViewById(R.id.btn_new_b)
        etNew = findViewById(R.id.et_new_b)
        btnOld.setOnClickListener {
            setResultToA()
        }
        btnNew.setOnClickListener {
            setResultToAWithNewStrategy()
        }
    }

    private fun setResultToA() {
        val intent = Intent()
        intent.putExtra(A.EXTRA_KEY, etOld.text.toString())
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

    private fun setResultToAWithNewStrategy() {
        val intent = Intent()
        intent.putExtra(A.EXTRA_KEY, etNew.text.toString())
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}