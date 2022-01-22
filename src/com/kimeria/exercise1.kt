package com.kimeria

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val john = PersonKotlin(11L, "Mr", "John", "Blue",
        GregorianCalendar(1977, Calendar.SEPTEMBER, 3))
    val john2 = PersonKotlin(11L, "Mr", "John", "Blue",
        GregorianCalendar(1977, Calendar.SEPTEMBER, 3))
    val jane = PersonKotlin(21L, "Mrs", "Jane", "Green", null)
    println("${john}'s age is ${john.age}")
    println("${jane}'s age is ${jane.age}")
    println("The age of someone born on 3rd May 1988 is " + PersonKotlin.age(GregorianCalendar(1988, Calendar.MAY, 3)))

    println(john)
    println(jane)
    println("Object Equality ${john == john2}")
    println("Reference Equality ${john === john2}")

    john.favoriteColor = "red"
    println(john.getColorType())
    john.favoriteColor = "orange"
    println(john.getColorType())
}


data class PersonKotlin(val id: Long, val title: String, val firstName: String, val surname: String,
                        val dateOfBirth: Calendar? = GregorianCalendar(1977, Calendar.SEPTEMBER, 3)){

    var favoriteColor: String? = null

    fun getColorType(): String {
        return when (getUpperCaseColor()) {
            "" -> "empty"
            "RED", "BLUE", "GREEN" -> "rgb"
            else -> "other"
        }

    }
    fun getLastLetter(a: String) = a.takeLast(1)

    fun getLastLetterOfColor(): String {
        return favoriteColor?.let{ getLastLetter(it)} ?:""
    }

    fun getUpperCaseColor(): String?{
        return favoriteColor?.uppercase() ?:""
    }

    val safeAge: Int
    get() = age ?: -1 //Elvis Operator

    val age: Int?
    get() = if (dateOfBirth == null) -1 else age(dateOfBirth)




    override fun toString(): String {
        val fmt = SimpleDateFormat("dd-MMM-yyyy")
        if(dateOfBirth == null){
            return "id=$id title=$title firstName=$firstName surname=$surname dob=None age=$safeAge"
        }
        return "id=$id title=$title firstName=$firstName surname=$surname dob=${fmt.format(dateOfBirth.time)} age=$safeAge"
    }

    companion object {
        fun age(dateOfBirth: Calendar?): Int? {
            if (dateOfBirth == null) return null

            val today = GregorianCalendar()
            val years: Int = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if(dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR))years - 1 else years
        }
    }
}
