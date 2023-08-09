package Lambdas

// Use function as return type
// syntax:
/*
fun functionName (): functionType {
// code
return function 
 */


fun add (a: Int, b:Int):Int{
    return a + b;
}

fun sub (a:Int , b: Int) :Int{
    return  a-b
}

fun getMathOperation (operationType: String) : (Int, Int)->Int{
    if (operationType  == "add"){
        return ::add
        }
    else{
        return ::sub
    }
}

fun main (){
    println("Enter the operationType:")
    val operationType = readln()
    val mathOperation = getMathOperation(operationType)

    val result = mathOperation(10, 4)
    println("Result: $result")
}

/*
code explanation:
In this example, we have two functions add and subtract that perform addition and subtraction operations,
respectively.

    The getMathOperation function takes an operationType parameter (either "add" or "subtract")
    and returns a function (Int, Int) -> Int based on the provided type. If the type is "add",
     it returns the add function; otherwise, it returns the subtract function.

     In the main function, we call getMathOperation with "add" as the operationType, which gives
      us the add function. We then use this returned function to perform an addition
      operation on the numbers 10 and 5 and print the result.
 */