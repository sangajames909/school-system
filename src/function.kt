fun main(){
 //inline function
//    val a = 3
//    val b = 3
//    val c = 3
//
//    var sum = a + b + c
//    var average = sum / 3
//    println(average)
//    val average = {a: Int, b: Int, c: Int -> (a + b + c )/3 }
//    println("average is ${average(10,10,10)}")

    val greet = {name: String -> name}
    println("hellow ${greet("James")}")

}