package selection

/**
 * EXERCÍCIO
 *
 * Implemente uma calculadora capaz de executar as 4 operações e que recebe os dados via teclado.
 * Três informações devem ser passadas: o primeiro operando, a operação matemática e o segundo operando.
 * Por exemplo:
 * > 20
 * > +
 * > 4
 */
fun main(){
    print("Digite o primeiro número: ")
    val n1 = readln().toDouble()

    print("Digite a operação desejada: ")
    val operando : Char = readln()[0]

    print("Digite o segundo número: ")
    val n2 = readln().toDouble()

    var resultado : Double = 0.0

    when(operando){
        '+' -> resultado = n1 + n2
        '-' -> resultado = n1 - n2
        '*' -> resultado = n1 * n2
        '/' -> resultado = n1 / n2
    }

    println("O Resultado de $n1 $operando $n2 é $resultado.")
}