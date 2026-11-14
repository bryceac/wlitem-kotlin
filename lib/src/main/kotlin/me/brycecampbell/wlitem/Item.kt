@file:JvmName("Item")

package me.brycecampbell.wlitem

import kotlin.uuid.Uuid
import kotlin.collections.*
import java.net.URI

class Item(
    val id: String = Uuid.random().toString(), 
    var name: String = "",
    var quantity: Int = 1,
    var priority: Priority = Priority.Low,
    var url: URI = URI(""),
    var notes: MutableList<String> = mutableListOf()) {
        constructor(
            id: String = Uuid.random().toString(),
            name: String = "",
            quantity: Int = 1,
            priority: String = "low",
            url: String = "",
            notes: MutableList<String> = mutableListOf()): this(
                id, 
                name, 
                quantity, 
                Priority.parse(priority),
                URI(url), 
                notes)
                
            companion object {
                @JvmStatic fun parse(text: String): Item {
                    var fields: Array<String> = text.split("\t")
                .toTypedArray()
                
                    val id: String = fields[0].ifEmpty {
                        Uuid.random().toString()
                    }
                
                    val name = fields[1]
                    val quantity = if (fields[2].isNotEmpty()) {
                        fields[2].toInt()
                    } else {
                        1
                    }
                
                    val priority = if (fields[3].isNotEmpty()) {
                        Priority.parse(fields[3])
                    } else {
                        Priority.Low
                    }
                
                    val url = if (fields[4].isNotEmpty()) {
                        URI(fields[4])
                    } else {
                        URI("")
                    }
                    
                    return Item(id, name, quantity, priority, url, mutableListOf())
                }
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