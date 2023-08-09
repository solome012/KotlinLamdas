package Lambdas



fun main (){
    println(sum(2, 4))


    var fn: (a: Int, b: Int) -> Int = ::sum
    println(fn(2, 5))


    calculator(2.0, 5.0, ::Hello)
}

fun Hello(d: Double, d1: Double): Double {
return d - d1;
}



fun sum (a: Int, b: Int): Int {
    return a+b
}

// higerOrder function:
// higher order function are those function that accept function as a argument or return type or both
//

// taking function as argument
fun calculator (a:Double, b: Double, gn: (Double, Double) -> Double){
    val answer= gn(a, b)
    println(answer)
}
