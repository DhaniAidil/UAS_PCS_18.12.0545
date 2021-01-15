package com.pcs.uas_pcs_aplikasi_bola_0545.view.teamsDetail

import com.google.gson.Gson

import com.pcs.uas_pcs_aplikasi_bola_0545.model.PlayersResponse
import com.pcs.uas_pcs_aplikasi_bola_0545.network.ApiRepository
import com.pcs.uas_pcs_aplikasi_bola_0545.network.TheSportsDbApi

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class TeamsPlayersPresenter(private val view: TeamsPlayersView,
                            private val apiRepository: ApiRepository,
                            private val gson: Gson) {

    fun getPlayerAll(teamName: String = "") {
        view.showLoading()

        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportsDbApi.getPlayerAll(teamName)),
                    PlayersResponse::class.java
            )

            uiThread {
                view.hideLoading()

                try {
                    view.showPlayerList(data.player)
                } catch (e: Exception) {
                    view.showEmptyData()
                }
            }
        }
    }
}
