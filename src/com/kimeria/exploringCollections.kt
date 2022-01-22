package com.kimeria

fun main(args: Array<String>) {

    //Arrays are always mutable
    val intArray = intArrayOf(1,2,3,4,5)
    val intArray2 = arrayOf(1,2,3)
    intArray[2] = 12345
    intArray.forEach { println(it) }
    intArray2.forEach { println(it) }




}

fun maps(){
    val webColors = mapOf("red" to 1, "blue" to 2)
    val webColors2 = mutableMapOf<String, Int>()
    webColors2["green"] = 3
    println(webColors2)
}
fun sets(){
    val months = setOf("Jan", "Feb")
    val months2 = mutableSetOf("Oct", "Nov")
}
fun mutableList(){
    val days = mutableListOf("Monday", "Tuesday", "Wednesday")
    days.add("Thursday")
    println(days)
}

fun immutableList(){
    val colors = listOf("Red", "Green", "Blue")
    val blueColors = colors.filter{it == "Blue"}
    val colorsUpperCase = colors.map{it.uppercase()}
    println(colors[2])
    println(colors)
    println(blueColors)
    println(colorsUpperCase)

    println(colors::class.qualifiedName)
}
