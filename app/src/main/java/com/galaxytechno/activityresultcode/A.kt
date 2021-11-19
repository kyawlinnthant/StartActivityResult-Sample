package com.galaxytechno.activityresultcode

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class A : AppCompatActivity() {

    private lateinit var btnOld: Button
    private lateinit var tvOld: TextView
    private lateinit var btnNew: Button
    private lateinit var tvNew: TextView


    companion object {
        const val CODE = 100
        const val EXTRA_KEY = "com.fill.name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        btnOld = findViewById(R.id.btn_old_a)
        tvOld = findViewById(R.id.tv_old_a)
        btnNew = findViewById(R.id.btn_new_a)
        tvNew = findViewById(R.id.tv_new_a)

        btnOld.setOnClickListener {
            fetchResultFromB()
        }
        btnNew.setOnClickListener {
            fetchResultFromBWithNewStrategy()
        }
    }


    private val resultFromB =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {

            it?.let {
                if (it.resultCode == Activity.RESULT_OK) {

                    tvNew.text = it.data!!.getStringExtra(EXTRA_KEY)
                }

            }
        }

    private fun fetchResultFromB() {
        val intent = Intent(this, B::class.java)
        startActivityForResult(intent, CODE)
    }

    private fun fetchResultFromBWithNewStrategy() {
        val intent = Intent(this, B::class.java)
        resultFromB.launch(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == CODE && resultCode == Activity.RESULT_OK) {

            data?.let {
                tvOld.text = data.getStringExtra(EXTRA_KEY)
            }

        }
    }
}