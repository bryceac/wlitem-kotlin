@file:JvmName("InvalidPriorityException")

package me.brycecampbell.wlitem

/// an exception that is thrown when an invalid priority level is given.
class InvalidPriorityException(priority: String): Exception(priority)