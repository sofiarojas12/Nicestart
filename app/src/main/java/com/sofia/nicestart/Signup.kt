package com.sofia.nicestart

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.Dispatchers.Main

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    // Method for Signup button
    fun openLogin(v: View?) {
        val intent = Intent(this@Signup, Login::class.java)
        startActivity(intent)
    }

    // Method for Signup button
    fun openMain(v: View?) {
        val intent = Intent(this@Signup, Main::class.java)
        startActivity(intent)
    }
}