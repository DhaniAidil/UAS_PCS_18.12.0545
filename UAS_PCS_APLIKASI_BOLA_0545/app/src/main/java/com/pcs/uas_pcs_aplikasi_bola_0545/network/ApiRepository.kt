package com.pcs.uas_pcs_aplikasi_bola_0545.network

import java.net.URL

class ApiRepository {

    fun doRequest(url: String): String {
        return URL(url).readText()
    }
}
