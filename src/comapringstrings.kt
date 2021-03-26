fun main(){
//    4. Compare two strings using an if..else statement and generate an output.
   var a: String = "tangerines"
    var b: String = "oranges"
  var result = a.compareTo(b)
    if(result==0){
        println("Strings '$a' and '$b' are equal.")
   } else if(result < 0){
        println("'$a' is less than '$b' lexically.")
    } else{
        println("'$a' is less than '$b' lexically.")
    }

}