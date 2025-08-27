package repetition

/**
 * Exercícios
 *
 * Imprima na tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário.
 */

fun main(){
    print("> ")
    val n1 = readln().toInt()

    var n = 1
    while (n <= 10){
        println("$n x $n1 = ${n * n1}")
        n++
    }
}