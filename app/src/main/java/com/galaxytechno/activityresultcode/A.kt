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

    private lateinit var btn: Button
    private lateinit var tv: TextView


    private val args: AArgs? by navArgs()

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
        btn = view.findViewById(R.id.btn_a)
        tv = view.findViewById(R.id.tv_a)

        btn.setOnClickListener {
            findNavController().navigate(R.id.action_a_to_b)
        }

        if(!args?.etData.equals(null)) tv.text = args?.etData

    }


}