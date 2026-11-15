package me.brycecampbell.wlitem

import kotlinx.serialization.json.Json

fun MutableList<Item>.encodeToJSONString(): String {
    return Json { prettyPrint = true }.encodeToString(this)
}
