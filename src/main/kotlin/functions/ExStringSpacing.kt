package functions

/**
 * EXERCÍCIO
 *
 * Escreva yma função que separa todos os caracteres de uma string com um espaço em branco. Essa função também deve receber
 * um parâmetro opcional indicando se a string deve ser convertida para maíuscula.
 */

fun main(){
    println(separaString("Olá, mundo!", false))

    println(separaString("Olá, mundo!", true))
}

fun separaString(string: String, upper: Boolean): String{

    var r = ""

    for (c in string){
        r += "$c "
    }

    if (upper){
        return r.uppercase().trim()
    }

    return r.trim()
}