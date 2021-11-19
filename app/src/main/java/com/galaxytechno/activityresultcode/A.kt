package com.galaxytechno.activityresultcode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class A : Fragment() {

    private lateinit var btnOld: Button
    private lateinit var tvOld: TextView
    private lateinit var btnNew: Button
    private lateinit var tvNew: TextView


    private val args: AArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
    }

    private fun init(view: View) {
        btnOld = view.findViewById(R.id.btn_old_a)
        tvOld = view.findViewById(R.id.tv_old_a)
        btnNew = view.findViewById(R.id.btn_new_a)
        tvNew = view.findViewById(R.id.tv_new_a)

        btnOld.setOnClickListener {
            findNavController().navigate(R.id.action_a_to_b)
        }
        btnNew.setOnClickListener {
            findNavController().navigate(R.id.action_a_to_b)
        }

        tvOld.text = args.oldData
        tvNew.text = args.newData
    }


}