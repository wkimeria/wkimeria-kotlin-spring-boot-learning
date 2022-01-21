package com.kimeria

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val john = PersonKotlin(11L, "Mr", "John", "Blue",
        GregorianCalendar(1977, Calendar.SEPTEMBER, 3))
    val jane = PersonKotlin(21L, "Mrs", "Jane", "Green", null)
    println("${john}'s age is ${john.age}")
    println("${jane}'s age is ${jane.age}")
    println("The age of someone born on 3rd May 1988 is " + PersonKotlin.age(GregorianCalendar(1988, Calendar.MAY, 3)))
}


data class PersonKotlin(val id: Long, val title: String, val firstName: String, val surname: String,
                        val dateOfBirth: Calendar? = GregorianCalendar(1977, Calendar.SEPTEMBER, 3)){

    val age: Int
    get(){
        if (dateOfBirth == null){
          return -1
        }
        return age(dateOfBirth)
    }

    override fun toString(): String {
        val fmt = SimpleDateFormat("dd-MMM-yyyy")
        if(dateOfBirth == null){
            return "$id $title $firstName $surname no birth date"
        }
        return "$id $title $firstName $surname ${fmt.format(dateOfBirth.time)}"
    }

    companion object {
        fun age(dateOfBirth: Calendar): Int {
            val today = GregorianCalendar()
            val years: Int = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) {
                years - 1
            } else {
                years
            }
        }
    }
}
