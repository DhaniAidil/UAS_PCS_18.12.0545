package com.pcs.uas_pcs_aplikasi_bola_0545.view.teams

import com.pcs.uas_pcs_aplikasi_bola_0545.model.LeagueResponse
import com.pcs.uas_pcs_aplikasi_bola_0545.model.TeamsItem

interface TeamsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showLeagueList(data: LeagueResponse)
    fun showTeamList(data: MutableList<TeamsItem>)
}
