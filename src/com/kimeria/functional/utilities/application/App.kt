package com.kimeria.functional.utilities.application

import com.kimeria.functional.utilities.toSentenceCase

fun main(args: Array<String>) {


    val colors = listOf("red", "green", "blue", "black")
    val newColors = colors.map{it.uppercase()}
    println(newColors)

    val colorsStartWithB = colors.filter{it.startsWith('b')}
    println(colorsStartWithB)

    val colorsFlatMapped = colors.flatMap { if(it.startsWith('b')) listOf(it, it.reversed()) else listOf(it) }
    println(colorsFlatMapped)

    val colorsReduced = colors.reduce{result, value -> "$result, $value" }
    println(colorsReduced)

    val numbers = colors.map{it.length}
    println(numbers)

    val numbersTotal = numbers.fold(0){result, value -> result + value}
    println(numbersTotal)

    val numbersMax = numbers.fold(0) {result, value -> if(value > result) value else result}
    println(numbersMax)

    val numbersMin = numbers.fold(numbers.first()) {result, value -> if(value < result) value else result}
    println(numbersMin)

    val myMap = mapOf(1 to "one", 2 to "two", 3 to "three")
    myMap.filter{ (k,v) -> v.startsWith("t")}.forEach{(k, v) -> println("$k : $v")} //Using destructuring
    myMap.filter{ it.value.startsWith("t")}.forEach{(k, v) -> println("$k : $v")}


}

fun applyFunc(){
    var result = applySomeFunctionToString("hello 1") {x -> x[0].uppercase() + x.substring(1)}
    println(result)
    var result2 = applySomeFunctionToString("hello 2") {x -> x[0].uppercase() + x.substring(1)}
    println(result2)
    var result3 = applySomeFunctionToString("hello 3") {it[0].uppercase() + it.substring(1)}
    println(result3)
    var result4 = applySomeFunctionToString("hello 4", ::toSentenceCase)
    println(result4)
}

fun applySomeFunctionToString(inputString: String, myFunction: (String) -> String) : String {
    return myFunction(inputString)
}

