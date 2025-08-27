package repetition

fun main(){
    var x = 0

    while (x <= 10){
        print("$x ")
        x++
    }

    println()
    //x = 0

    do {
        print("$x ")
        x++
    } while (x <= 10)
}