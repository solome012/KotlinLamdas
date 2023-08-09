package Lambdas

import kotlin.concurrent.thread

/*
higher-order functions are functions that can take one or more functions as
 parameters and/or return a function. This concept is a fundamental part of
  functional programming and provides a powerful way to abstract and
  manipulate behavior in your code.
 */

fun rollDice(
    range: IntRange, // passing the parameter
    time: Int, // passing the parameter
    callBack: (result: Int) -> Unit // this function does not have any return type


){
   for (i in 0 until time){
       val result = range.random()
       callBack (result)
   }
}

fun rollDice2 (callBack: (result: Int) -> Unit): String {
    thread {
        Thread.sleep(4000)
        callBack(4)
    }
    return "Dice rolled"


}
fun main (){
   // rollDice(1..6, 4) {result -> // if you have function argument as the last argument of the
        // function , you can put the lamda outside the parenthesis , this is called the trialing lamda.
      //  println(result)

        val result = rollDice2 {
            println(it)
        }
        println(result)


    }