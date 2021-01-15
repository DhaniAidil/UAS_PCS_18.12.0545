package com.pcs.uas_pcs_aplikasi_bola_0545.view.matchesSearch

import com.pcs.uas_pcs_aplikasi_bola_0545.model.EventsItem

interface MatchesSearchView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showEventList(data: MutableList<EventsItem>)
}
