package com.pcs.uas_pcs_aplikasi_bola_0545.model

import com.google.gson.annotations.SerializedName

data class EventSearchResponse(

        @field:SerializedName("event")
        val events: MutableList<EventsItem>
)
