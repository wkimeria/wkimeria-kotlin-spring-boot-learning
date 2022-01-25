package com.kimeria.interfaces

import java.math.BigDecimal

interface BookingManager {
    val version: String
    fun isSeatFree(seat: Seat) : Boolean
    fun reserveSeat(seat: Seat, customerID: Long) : Boolean
    fun systemStatus() = "All Operations are Functional"
}

class UnauthorizedUserException :Throwable()

open class BasicBookingManager(authorizationKey: String) : BookingManager {
    override val version: String = "1.0"

    override fun isSeatFree(seat: Seat) : Boolean{
        return true
    }
    override fun reserveSeat(seat: Seat, customerID: Long) : Boolean{
        return false
    }

    init {
        if (authorizationKey != "12345") throw UnauthorizedUserException()
    }
}

class AdvancedBookingManager : BasicBookingManager("12345"), java.io.Closeable {
    override val version: String = "2.0"

    fun howManyBookings() = 10

    override fun close(){

    }
}

fun String.toSentenceCase() : String {
    return this[0].uppercase() + this.substring(1)
}

fun main(args: Array<String>) {
    println(AdvancedBookingManager().isSeatFree(Seat(1,1, BigDecimal.ZERO, "")))

    val myList = mutableListOf<Int>()

    println("hello".toSentenceCase())


}
