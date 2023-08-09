package com.maryam.worldcup.ui

import android.view.LayoutInflater
import com.maryam.worldcup.data.DataManager
import com.maryam.worldcup.data.domain.Match
import com.maryam.worldcup.databinding.ActivityMainBinding
import com.maryam.worldcup.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val LOG: String="MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding=ActivityMainBinding::inflate
    override fun setup() {
        parseFile()
    }
    override fun addCallBacks() {
        binding?.apply {
            icRight.setOnClickListener {
                bindMatch(DataManager.getNextMatch())
            }
            icLeft.setOnClickListener {
                bindMatch(DataManager.getPreviousMatch())
            }
        }
    }


    private fun parseFile() {
        val inputStream = assets.open("data.csv")
        val buffer = BufferedReader(InputStreamReader(inputStream))
        val parser=CsvParser()
        buffer.forEachLine {
           val currantMatch=parser.parse(it)
            DataManager.addMatch(currantMatch)
        }
        bindMatch(DataManager.getCurrentMatch())
    }
    private fun bindMatch(match: Match){
        binding?.apply {
            matchDate.text=match.Date.toString()
            homeTeamName.text=match.homeTeamName
            awayTeamName.text=match.awayTeamName
            homeTeamFullTimeGoals.text=match.homeTeamFullTimeGoals.toString()
            awayTeamFullTimeGoals.text=match.awayTeamFullTimeGoals.toString()
            homeTeamHalfTimeGoals.text=match.homeTeamHalfTimeGoals.toString()
            awayTeamHalfTimeGoals.text=match.awayTeamHalfTimeGoals.toString()
            homeTeamShots.text=match.homeTeamShots.toString()
            awayTeamShots.text=match.awayTeamShots.toString()
            homeTeamCorners.text=match.homeTeamCorners.toString()
            awayTeamCorners.text=match.awayTeamCorners.toString()
            homeTeamYellowCards.text=match.homeTeamYellowCards.toString()
            awayTeamYellowCards.text=match.awayTeamYellowCards.toString()
            homeTeamRedCards.text=match.homeTeamRedCards.toString()
            awayTeamRedCards.text=match.awayTeamRedCards.toString()

        }
    }
}