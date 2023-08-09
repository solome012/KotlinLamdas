package Lambdas

// if you want to specify the type of a function parameter or as return type
// you need to know know the syntax for expressing function types

// The syntax for using function as data types is:
// (parameters (optional)) -> return type
data class Greeting(val message: () -> Unit)

fun sayHello() {
    println("Hello!")
}

fun sayGoodbye() {
    println("Goodbye!")
}

fun main() {
    val greetHello = Greeting(::sayHello)// :: is used to assign the function
    val greetGoodbye = Greeting(::sayGoodbye)

    greetHello.message()
    greetGoodbye.message()
}
