@file:JvmName("tsv")

package me.brycecampbell.wlitem

import java.io.BufferedWriter
import java.io.FileWriter
import java.nio.file.Paths

fun MutableList<Item>.saveToTSV(path: String) {
    val specifiedPath = Paths.get(path).toAbsolutePath()
    
    val writer = BufferedWriter(FileWriter(specifiedPath.toString(), false))
    
    writer.write(this.joinToString("\r\n"))
    writer.close()
}
