package com.mycompany.plugins.example

import android.util.Log
import com.getcapacitor.annotation.CapacitorPlugin
import com.mycompany.plugins.example.DataExchanger
import com.getcapacitor.PluginMethod
import com.getcapacitor.PluginCall

class DataExchanger {
    fun echo(value: String?): String? {
        Log.i("Echo", value!!)
        return value
    }
}