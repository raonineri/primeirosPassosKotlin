package repetition

import kotlin.random.Random

/**
 * Exercício
 *
 * Crie um jogo de adivinhação numérica. O computador deve sortear um número aleatório dentro de um intervalo e você
 * deve tentar descobri-lo. A cada tentativa, o programa diz se o número é maior ou menor que o número tentado.
 * O jogo acaba quando o número tentado for o número correto.
 */

fun main(){

    val numeroAleatorio = Random.nextInt(0,101)
    var palpite: Int

    do {
        print("> ")
        palpite = readln().toInt()

        if(palpite == numeroAleatorio){
            println("Você acertou! Seu palpite: $palpite; Numero sorteado: $numeroAleatorio")
        }
        else if (numeroAleatorio > palpite){
            println("O Número é maior que seu palpite")
        }else{
            println("O Número é menor que seu palpite")
        }

    }while (numeroAleatorio != palpite)
}