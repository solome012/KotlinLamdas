package KotlinOthers

// defining the data class
data class  UserProfile (val name: String, val age: Int)

fun main (){
    val user1 = UserProfile("santosh", 23)
    val user2 = UserProfile("kapil saud", 13)
    println(user1)
    println(user2)
    println(user1==user2) // output: false
}