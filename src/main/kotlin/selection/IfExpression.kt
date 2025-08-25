package selection

fun main(){
    // Em kotlin o if é uma "Expressão"

    val n = 10

    val r = if(n % 2 == 0){
        "Par"
    }else{
        "Ímpar"
    }

    println(r)
}