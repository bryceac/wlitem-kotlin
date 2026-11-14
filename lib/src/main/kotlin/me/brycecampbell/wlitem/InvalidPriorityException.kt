@file:JvmName("InvalidPriorityException")

package me.brycecampbell.wlitem

class InvalidPriorityException(priority: String): Exception(priority)