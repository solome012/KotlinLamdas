package Lambdas


// redefine the function with the lamda expression


// With lambda expressions, you can create variables that store functions,
// call these variables like functions, and store them in other variables that you can call like functions.
val trick ={
    println("print trick")
}

// Use of function as the datatypes
// specifying the treat varaible as the data types as  () -> Unit

/*: () -> Unit: This part specifies the type of the variable treat.
In this case, it's a function type. () -> Unit represents a function
that takes no arguments and returns nothing (Unit is similar to void
in other programming languages).
 */
val treat : () -> Unit = {
    println("have a treat")
}
fun trickOrtreat(istrick: Boolean) :()->Unit{
   if (istrick){
       return trick

   } else
     return  treat

}

fun main (){

    val treatFunction = trickOrtreat(false)
    val trickFunction = trickOrtreat(true)
    trickFunction()
    treatFunction()
}

// Now you know how functions can return other functions.
// You can also pass a function as an argument to another function.
// Perhaps you want to provide some custom behavior to the trickOrTreat()
// function to do something other than return either of the two strings.
// A function that takes another function as an argument lets you pass
// in a different function each time that it's called.
