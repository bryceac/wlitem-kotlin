@file:JvmName("Priority")

package me.brycecampbell.wlitem

enum class Priority {
    low,
    medium,
    high,
    highest;

    override fun toString(): String {
       return when (this) {
            low -> "low"
            medium -> "medium"
            high -> "high"
            highest -> "highest"
        }
    }
    
    companion object {
        @JvmStatic
        fun parse(priority: String): Priority {
            when (priority) {
                "low" -> Priority.low
                "medium" -> Priority.medium
                "high" -> Priority.high
                "highest" -> Priority.highest
                else -> throw InvalidPriorityException(priority)
            }
        }
    }
}