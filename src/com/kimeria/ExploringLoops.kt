package com.kimeria

import kotlin.math.pow

fun main(args: Array<String>) {
    /*
    var x: Int = 0

    while(x < 10){
        println(x)
        x++
    }
     */

    //forLoop()
    //forLoopKeyValue()
    rangeLoop()
}

fun rangeLoop(){
    for( i in 0..9){
        println(i)
    }
    (0..9).forEach{println(it.toFloat().pow(it))}
    (9 downTo 0).forEach{println(it.toFloat().pow(it))}
    (0 until 9).forEach{println(it)}
    (0 ..9 step 3).forEach{println(it)}
    ('A' ..'F').forEach{println(it)}
}

fun forLoopKeyValue(){
    val people = HashMap<Int, PersonKotlin>()
    people[1] = PersonKotlin(1, "Mr" ,"John","Doe")
    people[2] = PersonKotlin(2, "Mrs" ,"Jane","Doe")
    people[3] = PersonKotlin(3, "Ms" ,"Sally","Green")

    for((key, value) in people){
        println("key=$key value=$value")
    }

}
fun forLoop(){
    val people = ArrayList<PersonKotlin>()
    people.add(PersonKotlin(1, "Mr" ,"John","Doe"))
    people.add(PersonKotlin(2, "Mrs" ,"Jane","Doe"))
    people.add(PersonKotlin(3, "Ms" ,"Sally","Green"))

    for(person in people){
        println(person)
        val (id, title) = person
        println("$id $title")
    }

    for((id, title, firstName, surName) in people){
        println("$id $title $firstName $surName")

    }
}

