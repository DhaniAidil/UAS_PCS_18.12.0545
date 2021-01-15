package com.pcs.uas_pcs_aplikasi_bola_0545.view.matchesDetail


import com.pcs.uas_pcs_aplikasi_bola_0545.model.TeamsItem

interface MatchesDetailView {

    fun showLoading()
    fun hideLoading()
    fun showTeamDetail(dataHomeTeam: MutableList<TeamsItem>, dataAwayTeam: MutableList<TeamsItem>)
}
