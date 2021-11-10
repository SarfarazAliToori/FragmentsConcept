package com.example.fragmentconceptkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.fragmentconceptkotlin.Fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    //val myFragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myInit()
        sendDataToFragment()
    }

    fun myInit() {
        btn_add_fragment.setOnClickListener(this)
        btn_remove_fragments.setOnClickListener(this)
        btn_replace_fragments.setOnClickListener(this)
        btn_back.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {

        when(p0?.id) {
            R.id.btn_add_fragment -> addFragments()
            R.id.btn_remove_fragments -> removeFragments()
            R.id.btn_replace_fragments -> replaceFrgments()
            R.id.btn_back -> backFragments()
            else -> Toast.makeText(this, "Something Wrong", Toast.LENGTH_SHORT).show()
        }

    }

    fun addFragments() {

        var fragments = Fragment()
        when(supportFragmentManager.backStackEntryCount) {
            0 -> fragments = FragmentOne()
            1 -> fragments =  FragmentTwo()
            2 -> fragments = FragmentThree()
            3 -> fragments = FragmentFour()
            4 -> fragments = FragmentFive()
            5 -> fragments = FragmentSix()
            6 -> fragments = FragmentSeven()
            7 -> fragments = FragmentEight()
            8 -> fragments = FragmentNine()
            9 -> fragments = FragmentTen()
        }
        val mTransaction = supportFragmentManager.beginTransaction()
        mTransaction.add(R.id.fragment_container, fragments)
        mTransaction.addToBackStack(null)
        mTransaction.commit()
    }

    fun removeFragments() {
        val mFragmentManager = supportFragmentManager.findFragmentById(R.id.fragment_container)
        val fragManager = supportFragmentManager
        if (mFragmentManager != null) {
           val mFragmentTransaction = fragManager.beginTransaction()
            mFragmentTransaction.remove(mFragmentManager)
            mFragmentTransaction.commit()
            Toast.makeText(this, "Removed", Toast.LENGTH_SHORT).show()
        } else {
            addFragments()
        }
    }

    fun replaceFrgments() {
//        val mTransaction = myFragmentManager.beginTransaction()
//        mTransaction.replace(R.id.fragment_container,FragmentTen())
//        mTransaction.commit()
//        Toast.makeText(this, "Replace Fragments", Toast.LENGTH_SHORT).show()
//        transaction.add()

        var fragments = Fragment()
        when(supportFragmentManager.backStackEntryCount) {
            0 -> fragments = FragmentOne()
            1 -> fragments =  FragmentTwo()
            2 -> fragments = FragmentThree()
            3 -> fragments = FragmentFour()
            4 -> fragments = FragmentFive()
            5 -> fragments = FragmentSix()
            6 -> fragments = FragmentSeven()
            7 -> fragments = FragmentEight()
            8 -> fragments = FragmentNine()
            9 -> fragments = FragmentTen()
            else -> Toast.makeText(this, "Stack is Empty", Toast.LENGTH_SHORT).show()
        }
        val mTransaction = supportFragmentManager.beginTransaction()
        mTransaction.replace(R.id.fragment_container, fragments, "my Fragments")
        mTransaction.addToBackStack(null)
        mTransaction.commit()
    }

    fun backFragments() {
//


    }
//
    fun sendDataToFragment() {

    val helloFragment = HelloFragment()
    val fragManager = supportFragmentManager
    val transaction = fragManager.beginTransaction()
    val bundle = Bundle()
    bundle.putString("myStringKey" , "Hello World")
    helloFragment.arguments = bundle
    transaction.add(R.id.fragment_container, helloFragment).commit()

    }
}