package com.example.fragmentconceptkotlin.Fragments

import android.content.Context
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentconceptkotlin.R
import kotlin.math.log


class FragmentOne : Fragment() {

    val TAG = "MyFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "on Create")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG, "on Attach")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "on View Created")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "on Start")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "on Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "on Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "on Stop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG, "on Destroy View")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "on Destroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, "on Detach")
    }

    }
