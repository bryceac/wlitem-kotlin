@file:JvmName("Priority")

package me.brycecampbell.wlitem

enum class Priority {
    Low,
    Medium,
    High,
    Highest;

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