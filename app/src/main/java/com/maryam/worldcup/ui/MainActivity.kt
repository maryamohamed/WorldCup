package com.maryam.worldcup.ui

import android.view.LayoutInflater
import com.maryam.worldcup.databinding.ActivityMainBinding
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val LOG: String="MainActivity"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding=ActivityMainBinding::inflate
    override fun addCallBacks() {

    }

    override fun setup() {
        parseFile()

    }
    private fun parseFile() {
        val inputStream = assets.open("data.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        buffer.forEachLine {
            log(it)
        }
    }
}