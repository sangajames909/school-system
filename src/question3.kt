fun main() {
//print out 1..10 using loop and skipp the value 5
    for (n in 1..10) {
        if(n % 5 == 0)
            continue
        println("n is $n")
    }
}