package com.kimeria.learning.kotlin

class CustomerOld(val name: String,
               val address: String,
               val age: Int){

    constructor(address: String, age: Int) : this("John Doe", address, age) {
        println("Secondary Constructor called!")
    }

    init {
        println("Primary Constructor called!")
    }
}

data class Customer(val name: String,
               val address: String,
               val age: Int){

    constructor(address: String, age: Int) : this("John Doe", address, age) {
        println("Secondary Constructor called!")
    }

    init {
        println("Primary Constructor called!")
    }
}

class AlternativeCustomer(val name: String, val age: Int){
    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age){
        this.address = address
    }
}

class AnotherAlternativeCustomer(val name: String, var age: Int, val address: String = ""){
    var approved: Boolean = false
    set(value){
        if (age >= 21){
            field  = value
        }
        else {
            println("Not approved!")
        }
    }

    private val nextAge
    get() = age + 1

    operator fun component1() = name
    operator fun component2() = address
    operator fun component3() = age


    private fun upperCaseName() = name.uppercase()

    override fun toString(): String {
        return "name = $name address = $address age = $age approved = $approved nextAge = $nextAge upperCaseName = ${upperCaseName()}"
    }

    // Static Method(s)
    // Companion object
    companion object {
        fun getInstance() = AnotherAlternativeCustomer("John Doe", 33, "10 anywhere else")
    }
}

fun main(args: Array<String>) {
    val customer1 = Customer("William Kimeria", "anywhere", 44)
    printCustomerInfo(customer1)

    val customer2 = Customer("anywhere", 44)
    printCustomerInfo(customer2)

    val customer3 = AnotherAlternativeCustomer("Frog", 33)
    customer3.approved = true
    println(customer3)

    val customer4 = AnotherAlternativeCustomer("Frog", 10, "123 anywhere lane")
    customer4.approved = true
    println(customer4)

    val customer5 = AnotherAlternativeCustomer.getInstance()
    customer5.approved = true
    println(customer5)

    val customer6 = Customer("Sally Doe", "123 Where Lane", 22)
    val customer7 = Customer("Diana Doe", "123 Where Lane", 22)
    val customer8 = customer6.copy(name="Jane Doe")
    println(customer6)
    println(customer7)
    println(customer8)
    println(customer6 == customer7)

    //Destructuring
    val(name, address, age) = customer6
    println("name = $name address = $address age = $age")


    val(name2, address2, age2) = customer5
    println("name = $name2 address = $address2 age = $age2")




}

fun printCustomerInfo(customer: Customer){
    println("name = ${customer.name} address = ${customer.address} age = ${customer.age}")
    println("------")
    println(customer)
    println(customer.hashCode())
}

