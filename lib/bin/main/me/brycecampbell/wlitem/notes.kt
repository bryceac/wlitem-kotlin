package me.brycecampbell.wlitem

/// uniques notes found in a list.
fun MutableList<Item>.notes(): List<String> {
    var unique: MutableSet<String> = mutableSetOf()
    
    for (item in this) {
        for (note in item.notes) {
            unique.add(note)
        }
    }
    
    return unique.toList()
}
