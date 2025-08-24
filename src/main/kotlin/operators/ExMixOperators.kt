package operators

/**
 * Exercício
 * Encontre o resultado da seguinte expressão
 * (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)
 * 16 < 15 || !(4 <= 2)
 * F || T
 *  T
 */

fun main(){

    var d = (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 % 3)

    println(d)
}