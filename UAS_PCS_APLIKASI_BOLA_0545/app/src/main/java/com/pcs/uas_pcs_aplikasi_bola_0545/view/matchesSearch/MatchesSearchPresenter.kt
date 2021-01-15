package com.pcs.uas_pcs_aplikasi_bola_0545.view.matchesSearch

import com.google.gson.Gson

import com.pcs.uas_pcs_aplikasi_bola_0545.model.EventSearchResponse
import com.pcs.uas_pcs_aplikasi_bola_0545.network.ApiRepository
import com.pcs.uas_pcs_aplikasi_bola_0545.network.TheSportsDbApi

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MatchesSearchPresenter(private val view: MatchesSearchView,
                             private val apiRepository: ApiRepository,
                             private val gson: Gson) {

    fun getEventsSearch(eventName: String = "") {
        view.showLoading()

        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportsDbApi.getEventsSearch(eventName)),
                    EventSearchResponse::class.java
            )

            uiThread {
                view.hideLoading()

                try {
                    view.showEventList(data.events)
                } catch (e: Exception) {
                    view.showEmptyData()
                }
            }
        }
    }
}
