package com.pcs.uas_pcs_aplikasi_bola_0545.model

data class LeaguesItem(val idLeague: String?, val strLeague: String?) {

    override fun toString(): String {
        return strLeague.toString()
    }
}
