package com.galaxytechno.activityresultcode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class B : Fragment() {
    lateinit var btn: Button
    lateinit var et: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
    }


    private fun init(view: View) {

        btn = view.findViewById(R.id.btn_b)
        et = view.findViewById(R.id.et_b)

        btn.setOnClickListener {
            val action = BDirections.actionBToA(et.text.toString())
            findNavController().navigate(action)
        }
    }


}