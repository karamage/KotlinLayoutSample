package com.karamage.androidlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //main2.xml
        setContentView(R.layout.main2)

        val groupIds = arrayOf(R.id.group1, R.id.group2, R.id.group3,
                R.id.group4, R.id.group5, R.id.group6)

        groupIds.forEachIndexed { i, gId ->
            val ll = findViewById(gId) as LinearLayout
            val button = ll.findViewById(R.id.button)
            button.setOnClickListener( { v ->
                val ll = v.parent as LinearLayout
            })
        }
    }
}
