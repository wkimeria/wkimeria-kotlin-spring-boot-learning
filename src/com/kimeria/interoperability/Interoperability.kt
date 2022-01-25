package com.kimeria.interoperability

import kotlin.jvm.Throws

data class Customer(val id: Long, val name: String)
class CustomerDatabase(){
    val customers = listOf(Customer(1, "Mat"),
    Customer(2, "James"))

    @Throws(IllegalAccessException::class)
    fun addCustomer(c: Customer) {
        throw IllegalAccessException("You cannot add a new customer")
    }

    companion object {
        fun helloWorld() = println("Hello World!")
    }
}

fun main(args: Array<String>) {
    println("Here")
}
