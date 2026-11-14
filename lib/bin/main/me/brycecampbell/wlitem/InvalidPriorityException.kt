@file:JvmName("InvalidPriorityException")

package me.brycecampbell.wlitem

class InvalidPriorityException(val priority: String): Exception(priority)