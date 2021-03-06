package com.pcs.uas_pcs_aplikasi_bola_0545.view.matchesDetail

import com.google.gson.Gson
import com.pcs.uas_pcs_aplikasi_bola_0545.model.TeamResponse
import com.pcs.uas_pcs_aplikasi_bola_0545.network.ApiRepository
import com.pcs.uas_pcs_aplikasi_bola_0545.network.TheSportsDbApi

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class DetailPresenter(private val view: MatchesDetailView,
                      private val apiRepository: ApiRepository,
                      private val gson: Gson) {

    fun getTeamDetail(idHomeTeam: String, idAwayTeam: String) {
        view.showLoading()

        doAsync {
            val dataHomeTeam = gson.fromJson(apiRepository
                    .doRequest(TheSportsDbApi.getTeamDetail(idHomeTeam)),
                    TeamResponse::class.java
            )

            val dataAwayTeam = gson.fromJson(apiRepository
                    .doRequest(TheSportsDbApi.getTeamDetail(idAwayTeam)),
                    TeamResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showTeamDetail(dataHomeTeam.teams, dataAwayTeam.teams)
            }
        }
    }
}
