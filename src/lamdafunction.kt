fun main(){
    //6. Declare the lamda function
    val sum = {num1: Int, num2: Int -> num1 + num2}
    println("10+5: ${sum(10,5)}")
}