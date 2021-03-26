fun main() {
//print out 10..5 using the break statement to bring the loop to an end
    for(n in 5..10){
        println("before break, Loop: $n")
        if (n==10) {
            println("I am terminating loop")
            break
        }
    }
}