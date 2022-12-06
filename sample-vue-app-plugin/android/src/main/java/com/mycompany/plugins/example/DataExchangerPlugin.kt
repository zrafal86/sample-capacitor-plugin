package com.mycompany.plugins.example

import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.annotation.CapacitorPlugin
import com.mycompany.plugins.example.DataExchanger
import com.getcapacitor.PluginMethod
import com.getcapacitor.PluginCall

@CapacitorPlugin(name = "DataExchanger")
class DataExchangerPlugin : Plugin() {
    private val implementation = DataExchanger()
    @PluginMethod
    fun echo(call: PluginCall) {
        val value = call.getString("value")
        val ret = JSObject()
        ret.put("value", implementation.echo(value))
        call.resolve(ret)
    }
}