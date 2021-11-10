package com.example.fragmentconceptkotlin.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmentconceptkotlin.R
import kotlinx.android.synthetic.main.fragment_hello.*

class HelloFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_hello, container, false)
        try {
            val bundle = arguments
            val myData =  bundle!!.getString("myStringKey")
            val mTextView = view.findViewById<View>(R.id.textView) as TextView
            mTextView.text = myData
        } catch (e: Exception) {
            e.stackTrace
        }

        return view

    }

}