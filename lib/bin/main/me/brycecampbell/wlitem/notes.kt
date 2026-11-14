package me.brycecampbell.wlitem

fun MutableList<Item>.notes(): List<String> {
    var unique: MutableSet<String> = mutableSetOf()
    
    for (item in this) {
        for (note in item.notes) {
            unique.add(note)
        }
    }
    
    return unique.toList()
}
