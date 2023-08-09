package Lambdas

fun main () {

val singleParam : (Int) ->Int = { it+it}
   val simplysingleParam : (Int)->Int = {it+it}
    println(simplysingleParam(2))


    println( calculator1(2,3){ a, b ->a+b})
}

fun calculator1 (a:Int, b: Int, op: (Int, Int)->Int):Int{
    return op(a, b)
}


