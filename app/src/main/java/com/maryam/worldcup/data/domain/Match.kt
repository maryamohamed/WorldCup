package com.maryam.worldcup.data.domain

data class Match(
    val Date: Int,
    val homeTeamName:String,
    val awayTeamName:String,
    val homeTeamFullTimeGoals:Int,
    val awayTeamFullTimeGoals:Int,
    val homeTeamHalfTimeGoals:Int,
    val awayTeamHalfTimeGoals:Int,
    val homeTeamShots:Int,
    val awayTeamShots:Int,
    val homeTeamShotsOnTarget:Int,
    val awayTeamShotsOnTarget:Int,
    val homeTeamFouls:Int,
    val awayTeamFouls:Int,
    val homeTeamCorners:Int,
    val awayTeamCorners:Int,
    val homeTeamYellowCards:Int,
    val awayTeamYellowCards:Int,
    val homeTeamRedCards:Int,
    val awayTeamRedCards:Int,
    )