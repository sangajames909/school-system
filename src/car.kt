class car {
    var carColor = "red"
    var carmodel = "toyota"

    fun carColor() {
        println("the color of the car is" + carColor)
    }

    fun carmodel() {
        println("the car accelerates at 50M/hr" + carmodel)
    }
fun main() {
    val obj = car()
    println("${obj.carColor()}")
    println("${obj.carmodel()}")

}

}