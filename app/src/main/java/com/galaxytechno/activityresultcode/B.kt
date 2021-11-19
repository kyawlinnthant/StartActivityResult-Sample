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
    lateinit var btnOld: Button
    lateinit var etOld: EditText
    lateinit var btnNew: Button
    lateinit var etNew: EditText

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

        btnOld = view.findViewById(R.id.btn_old_b)
        etOld = view.findViewById(R.id.et_old_b)
        btnNew = view.findViewById(R.id.btn_new_b)
        etNew = view.findViewById(R.id.et_new_b)

        btnOld.setOnClickListener {
            val action = BDirections.actionOld(etOld.text.toString())
            findNavController().navigate(action)
        }
        btnNew.setOnClickListener {
            val action = BDirections.actionNew(etNew.text.toString())
            findNavController().navigate(action)
        }
    }


}