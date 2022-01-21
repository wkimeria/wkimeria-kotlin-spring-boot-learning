package com.kimeria.learning.kotlin

import sun.font.TrueTypeFont
import java.math.BigDecimal
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    // stringManipulation()
    numbers()





}


fun numbers(){
    val myDouble = 21.4
    println("Is Double ${myDouble is Double}")
    println("Is Double ${myDouble::class.qualifiedName}")
    println("My doubles java class is ${myDouble.javaClass}")

    val myInteger = myDouble.roundToInt()
    println("My integer type is ${myInteger::class.qualifiedName}")

    val anotherInteger: Int = 17

    val isIdiot = true
    println("isIdiot ${isIdiot::class.qualifiedName}")

    val myFloat = 123.44f
    println("myFloat ${myFloat::class.qualifiedName}")

    val myBigDecimal: BigDecimal = BigDecimal(123456.778)
    println("myBigDecimal ${myBigDecimal::class.qualifiedName}")

    val bd2: BigDecimal
    bd2 = myBigDecimal.add(BigDecimal(123444.45))
    println("bd2 ${bd2::class.qualifiedName} $bd2")

    println("myFloat divided ${myFloat.div(3)}")

    println("division ${BigDecimal(10.0/3.0)}")
}


fun stringManipulation(){
    val name = "William"
    val surname = "Kimeria"

    val fullGreeting = """This is my message to you
    |How are you doing?
    |How is everything going?
    |Is the pandemic over?
    |Why not $name $surname!?
    """.trimMargin("|")

    println("Greetings from $name $surname. My name is ${name.length + surname.length} characters long!");
    println(fullGreeting)
    println(fullGreeting.replaceAfterLast("How", "When"))
}


