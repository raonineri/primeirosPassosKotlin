package classes

/**
 * EXERCÍCIO
 * ---------
 *
 * Crie a classe CharGenerator, capaz de gerar aleatoriamente um caractere dentro de um intervalo fornecido no momento
 * da criação
 */
fun main(){
    val x = CharGenerator('a', 'z')

    println(x.next())
    println(x.next())
    println(x.next())
    println(x.next())
}

class CharGenerator(
    val min: Char,
    val max: Char
){
     fun next() = (min .. max).random()
}