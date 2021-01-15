package com.pcs.uas_pcs_aplikasi_bola_0545.view.teamsDetail

import com.pcs.uas_pcs_aplikasi_bola_0545.model.PlayersItem

interface TeamsPlayersView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showPlayerList(data: MutableList<PlayersItem>)
}
