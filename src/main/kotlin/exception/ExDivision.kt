package exception

/**
 * EXERCÍCIO
 *
 * Escreva uma função que divide dois números. Se for uma divisão por zero, a função deve retornar zero como resultado.
 * Os parâmetros e o retorno do método devem ser todos do tipo int.
 */

fun main(){

    println(
        div(
            readln().toInt(),
            readln().toInt()
        )
    )
}

fun div(a:Int, b:Int) : Int{
    return try {
        a/b
    }
    catch (_: ArithmeticException){
        0
    }
}