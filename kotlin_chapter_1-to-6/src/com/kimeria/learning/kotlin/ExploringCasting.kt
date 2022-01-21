package com.kimeria.learning.kotlin

import java.math.BigDecimal
import java.util.*


fun main(args: Array<String>) {
    var result: Any
    val randomNumber = Random().nextInt(3)

    if (randomNumber == 1){
        result = BigDecimal(30)
    }else{
        result = "hello"
    }

    println("Result is currently $randomNumber")

    if(result is BigDecimal){
        result = result.add(BigDecimal(47))
        println("Result is currently $result")
    }else{
        val tmpResult: String = result as String
        println("${tmpResult.uppercase()}")
    }

}
