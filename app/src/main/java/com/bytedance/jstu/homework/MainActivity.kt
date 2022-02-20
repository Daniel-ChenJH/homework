package com.bytedance.jstu.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.util.Log
import android.annotation.SuppressLint

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv_Hello = findViewById<TextView>(R.id.tv_hello)
        tv_Hello.setOnClickListener {
            tv_Hello.text = "Hello SJTU"
            Log.i("MainActivity", "World")
        }
        Log.d("MainActivity", "Hello")
    }
}