class fruit {
    var colorApple = "red"
    var colorLemon = "green"
    var lemontaste = "sour"
    var appletaste = "sweet"

    fun colorFruit(){
        println("the color of the lemon fruit is" + colorLemon)
        println("the color of the apple fruit is" + colorApple)
    }
    fun tasteFruit(){
      println("the taste of the lemon fruit is" + lemontaste)
        println("the taste of the apple fruit  is" + appletaste)
    }



}

fun main(){
    val obj = fruit()
    println("${obj.colorFruit()}")
    println("${obj.tasteFruit()}")

}