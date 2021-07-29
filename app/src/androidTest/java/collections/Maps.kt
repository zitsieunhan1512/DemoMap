package collections

fun main(){
    val nameToAges= mutableMapOf(Pair("Long",12))
    val nameToAges2=mapOf(
        "Long" to 12,
        "Linh" to 13
    )
    println(nameToAges==nameToAges2)
    println(nameToAges.keys)
    println(nameToAges.values)
    println(nameToAges.entries)
    nameToAges.put("Lan", 24)
}