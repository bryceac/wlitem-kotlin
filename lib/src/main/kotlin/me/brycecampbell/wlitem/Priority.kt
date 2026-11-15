@file:JvmName("Priority")

package me.brycecampbell.wlitem

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/// enumeration that represents the desirability or priority of an item.
@Serializable
enum class Priority {
   @SerialName("low") Low,
    @SerialName("medium") Medium,
    @SerialName("high") High,
    @SerialName("highest") Highest;

    override fun toString(): String {
       return when (this) {
            Low -> "low"
            Medium -> "medium"
            High -> "high"
            Highest -> "highest"
        }
    }
    
    companion object {
        @JvmStatic
        fun parse(priority: String): Priority {
            return when (priority) {
                "low" -> Priority.Low
                "medium" -> Priority.Medium
                "high" -> Priority.High
                "highest" -> Priority.Highest
                else -> throw InvalidPriorityException(priority)
            }
        }
    }
}