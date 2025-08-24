package selection

/**
 * Exercício
 * Escreva um programa que recebe um valor númerico pelo teclado, multiplica por ele mesmo e imprime o resultado.
 * Entretanto, se o valor fornecido for maior que 10, ele deve ser ajustado para 10 antes de ser multiplicado.
 */

fun main(){

    println(":> ")
    var input = readln().toInt()

    if (input > 10){
        input = 10
    }
    input *= input

    println(input)
}