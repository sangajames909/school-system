fun main(){
//    try {
//        println("Before exception")
//        throw Exception("Invalid")
//        println("After exception")
//    }
//    catch (e: Exception){
//        println(e)
//    }
//    finally {
//        println("check again")
//    }
//    var num = 7/0
//    println("temwa")
//    println(num)

    val age = "<18"
    val num = try {
        age .toInt()
    }
    catch (e: NumberFormatException)
    {
        "i can drink beer"
    }
    println(num)

    val number = ">18"
    val num2 = try {
        number.toInt()
    }
    catch (e: NumberFormatException)
    {
        "i only drink soda"
    }
    println(num2)

}




//using the try..and catch block as an expression, allow me to enter an age in the console, if the age
//is greater than 18 "i can drink beer" if the age is less than 18 "i only drink soda"