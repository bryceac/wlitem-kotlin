@file:JvmName("encodeItems")

package me.brycecampbell.wlitem

import kotlinx.serialization.json.Json

/// encode list of items to JSON
fun MutableList<Item>.encodeToJSONString(): String {
    val json = Json { prettyPrint = true }
        
    return json.encodeToString(this)
}
