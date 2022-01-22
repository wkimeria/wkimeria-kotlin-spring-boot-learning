package com.kimeria

fun main(args: Array<String>) {
    println(someFunction("Hello World!"))
    println(returnUnit("Augh!"))
    printAString("Dammit!")
    println(addTwoNumbers(12.01,2.33))
    printSomeMaths(two = 10.0, one = 20.0)
    printSomeMaths(20.0, 10.0)
    printSomeMaths(20.0)
    printSomeMaths(one = 20.0)
    println(niceGreeting("William Kimeria"))


}

fun niceGreeting(value: String): String {
    fun rudeGreeting(value: String): String{
        return "Greetings $value, you Shrek looking idiot!"
    }
    return rudeGreeting(value.uppercase())
}

//fun doTheLambda(input: String, action:()-> String): String{
    //return action.invoke(input)
//}



fun printSomeMaths(one: Double = 44.1, two: Double = 5.0){
    println( " one plus two is  ${one + two}")
    println( " one minus two is  ${one - two}")
}


fun addTwoNumbers(one: Double, two: Double) = one + two

private fun printAString(value: String) = println(value)


fun someFunction(name: String): String {
    return name.uppercase()
}

fun returnUnit(name: String){
    //return Unit
}
