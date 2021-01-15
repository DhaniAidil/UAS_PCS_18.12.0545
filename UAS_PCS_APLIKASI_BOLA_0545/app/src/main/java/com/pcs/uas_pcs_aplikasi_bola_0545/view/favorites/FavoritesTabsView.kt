package com.pcs.uas_pcs_aplikasi_bola_0545.view.favorites

import com.pcs.uas_pcs_aplikasi_bola_0545.model.EventsItem
import com.pcs.uas_pcs_aplikasi_bola_0545.model.TeamsItem

interface FavoritesTabsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showEventList(data: MutableList<EventsItem>)
    fun showTeamList(data: MutableList<TeamsItem>)
}
