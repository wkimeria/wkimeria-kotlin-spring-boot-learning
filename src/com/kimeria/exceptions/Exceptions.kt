package com.kimeria.exceptions

import java.io.FileInputStream

fun main(args: Array<String>) {

    println(divide(100, 0))

    var result = try{
        divideInt(100,0)
    }
    catch(e: Exception){
        println("Error was ${e.message}")
        0
    }
    println("result = $result")

    printFile()
}

fun printFile(){
    val input = FileInputStream("file.txt")

    input.use{
        // An exception could be thrown here
        println(readLine())
    }
}

@Throws(InterruptedException::class) //Create checked exception when called from Java
fun divide(numerator: Int, denominator: Int): Double{
    Thread.sleep(1000)
    return (numerator.toDouble()/denominator)
}

fun divideInt(numerator: Int, denominator: Int): Int {
    return numerator / denominator
}
