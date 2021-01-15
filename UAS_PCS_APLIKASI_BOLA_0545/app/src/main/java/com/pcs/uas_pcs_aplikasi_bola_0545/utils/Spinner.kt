package com.pcs.uas_pcs_aplikasi_bola_0545.utils

import android.content.Context
import android.widget.ArrayAdapter
import android.widget.Spinner

fun Spinner.loadFirstText(context: Context) {
    val list = mutableListOf<String>()
    list.add("Loading...")

    adapter = ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item, list)
}
