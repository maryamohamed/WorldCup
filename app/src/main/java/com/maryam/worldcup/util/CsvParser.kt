package com.maryam.worldcup.util

import com.maryam.worldcup.data.domain.Match

class CsvParser {
    fun parse(line:String): Match {
    val tokens=line.split(",")
       return Match(
           Date = tokens[Constants.ColumnIndex.DATE].toInt(),
           homeTeamName = tokens[Constants.ColumnIndex.HOME_TEAM_NAME],
           awayTeamName = tokens[Constants.ColumnIndex.Away_TEAM_NAME],
           homeTeamFullTimeGoals = tokens[Constants.ColumnIndex.HOME_TEAM_FULL_TIME_GOALS].toInt(),
           awayTeamFullTimeGoals = tokens[Constants.ColumnIndex.Away_TEAM_FULL_TIME_GOALS].toInt(),
           homeTeamHalfTimeGoals = tokens[Constants.ColumnIndex.HOME_TEAM_HALF_TIME_GOALS].toInt(),
           awayTeamHalfTimeGoals = tokens[Constants.ColumnIndex.Away_TEAM_HALF_TIME_GOALS].toInt(),
           homeTeamShots = tokens[Constants.ColumnIndex.HOME_TEAM_SHOTS].toInt(),
           awayTeamShots = tokens[Constants.ColumnIndex.Away_TEAM_SHOTS].toInt(),
           homeTeamShotsOnTarget = tokens[Constants.ColumnIndex.HOME_TEAM_SHOTS_ON_TARGET].toInt(),
           awayTeamShotsOnTarget = tokens[Constants.ColumnIndex.Away_TEAM_SHOTS_ON_TARGET].toInt(),
           homeTeamFouls = tokens[Constants.ColumnIndex.HOME_TEAM_FOULS].toInt(),
           awayTeamFouls = tokens[Constants.ColumnIndex.Away_TEAM_FOULS].toInt(),
           homeTeamCorners = tokens[Constants.ColumnIndex.HOME_TEAM_CORNERS].toInt(),
           awayTeamCorners = tokens[Constants.ColumnIndex.Away_TEAM_CORNERS].toInt(),
           homeTeamYellowCards = tokens[Constants.ColumnIndex.HOME_TEAM_YELLOW_CARD].toInt(),
           awayTeamYellowCards = tokens[Constants.ColumnIndex.Away_TEAM_YELLOW_CARD].toInt(),
           homeTeamRedCards = tokens[Constants.ColumnIndex.HOME_TEAM_RED_CARD].toInt(),
           awayTeamRedCards = tokens[Constants.ColumnIndex.Away_TEAM_RED_CARD].toInt(),
       )

    }
}