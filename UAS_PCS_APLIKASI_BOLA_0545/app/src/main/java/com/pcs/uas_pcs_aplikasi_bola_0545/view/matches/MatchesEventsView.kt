package com.pcs.uas_pcs_aplikasi_bola_0545.view.matches

import com.pcs.uas_pcs_aplikasi_bola_0545.model.EventsItem
import com.pcs.uas_pcs_aplikasi_bola_0545.model.LeagueResponse

interface MatchesEventsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showLeagueList(data: LeagueResponse)
    fun showEventList(data: MutableList<EventsItem>)
}
