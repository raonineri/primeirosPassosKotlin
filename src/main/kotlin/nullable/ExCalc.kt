package nullable

/**
 * Exercício
 *
 * Escreva um programa que socicita um número a um usuário, multiplica ele por 2 duas vezes e subtrai 10. Se o usuário
 * digitar algo que não possa ser convertido em número, o número 2 deve ser assumido como padrão.
 * O programa deve calcular o valor do número e mostrá-lo na tela em uma única expressão.
 */
fun main(){
    print("> ")
    println(
        (readln().toIntOrNull() ?: 2)
            .times(2)
            .times(2)
            .minus(10)
    )
}