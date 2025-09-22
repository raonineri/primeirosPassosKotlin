package classes

/**
 * EXERCÍCIO
 *
 * Crie uma classe Person para representar uma pessoa. Uma pessoa pode andar e, toda a vez que anda, ela anda 1000m de
 * uma só vez. Ao percorrer 5000m, ela não consegue mais andar e só volta a andar se tomar água (depois disso ela pode
 * andar mais 5000m).
 *
 * Crie um programa que simula a caminhada de uma pessoa durante determinado período, mostrando ao final qual foi a
 * distância percorrida.
 *
 * Como bônus, experimente parametrizar a distância de 5000m até ela tomar água, o que vai permitir criar pessoas mais e
 * menos resistentes à caminhada.
 */

fun main(){

    val person = Person("João", 5000)

    person.andar()
    person.andar()
    person.andar()
    person.andar()
    person.andar()
    person.andar()

    person.beberAgua()

    person.andar()
    person.andar()
}

private class Person(
    private val nome:String,
    private val resistencia: Int
){
    private var limiteAtingido: Boolean = false
    private var distanciaPercorrida: Int = 0

    fun andar(){
        if(!limiteAtingido){
            distanciaPercorrida +=1000
            println("Andando 1000m.")
        }
        else{
            println("Olá, $nome. Limite de caminhada atingido ($resistencia). Beba água para continuar.")
        }
        limiteAtingido = distanciaPercorrida >= resistencia
    }

    fun beberAgua(){
        limiteAtingido = false
        distanciaPercorrida = 0
    }
}
