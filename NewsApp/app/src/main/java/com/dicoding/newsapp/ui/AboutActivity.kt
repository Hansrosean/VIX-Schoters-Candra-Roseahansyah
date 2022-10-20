package com.dicoding.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.dicoding.newsapp.R

class AboutActivity : AppCompatActivity(){

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_USERNAME = "extra_username"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val tvProfile: TextView = findViewById(R.id.tv_profile)

        val name = intent.getStringExtra(EXTRA_NAME)
        val username = intent.getStringExtra(EXTRA_USERNAME)

        val text = "My Name : $name \n\nMy Github Username : $username"
        tvProfile.text = text

        supportActionBar?.title = "About Me"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}