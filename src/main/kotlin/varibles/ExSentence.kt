package varibles

import java.util.Scanner

/*
 EXERCÍCIO
 Solicite 3 informações ao usuário: nome, idade e peso. Depois imprima uma frase que contenha essas informações
 use string tambplates pra montar a frase
*/
fun main(){
    print("Qual seu nome? \n:> ")
    val nome = readln()
    print("Qual sua idade? \n:> ")
    val idade = readln().toInt()
    print("Qual seu peso? \n:> ")
    val peso = readln().toDouble()

    println("Você informou Nome:$nome, idade: $idade e peso: $peso")
}