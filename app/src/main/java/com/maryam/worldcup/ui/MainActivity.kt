package com.maryam.worldcup.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maryam.worldcup.R
import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun parseFile(){
       val inputStream= assets.open("data.csv")
        val buffer=BufferedReader(InputStreamReader(inputStream))
        buffer.forEachLine {

        }
    }
}