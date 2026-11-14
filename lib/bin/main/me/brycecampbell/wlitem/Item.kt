@file:JvmName("Item")

package me.brycecampbell.wlitem

import kotlin.uuid.Uuid
import kotlin.collections.*

class Item(
    val id: String = Uuid.random(), 
    var name: String = "",
    var quantity: Int = 1,
    var priority: Priority = Priority.low,
    var url: URI = URI(""),
    var notes: MutableList<Item> = mutableListOf()) {
        constructor(
            id: String = Uuid.random(),
            name: String = "",
            quantity: Int = 1,
            priority: String = "low",
            url: String = "",
            notes: MutableList<Item> = mutableListOf()): this(
                id, 
                name,
                priority,
                url,
                notes)
                
            constructor(text: String) {
                var fields: Array<String> = text.split("\\t")
                .toTypedArray()
                
                this.id = if (!fields[0].isEmpty()) {
                    fields[0]
                } else {
                    Uuid.random()
                }
                
                this.name = fields[1]
                this.quantity = if (!fields[2].isEmpty()) {
                    fields[2] as Int
                } else {
                    1
                }
                
                this.priority = if (!fields[3].isEmpty()) {
                    Priority.parse(fields[3])
                } else {
                    Priority.low
                }
                
                this.url = if (!fields[4].isEmpty()) {
                    URI(fields[4])
                } else {
                    URI("")
                }
                
                this.notes = mutableListOf()
            }

    override fun toString(): String {
        return StringBuilder()
        .append(this.id)
        .append("\t")
        .append(this.name)
        .append("\t")
        .append(this.quantity)
        .append("\t")
        .append(this.priority)
        .append("\t")
        .append("this.url")
        .toString()
    }
}