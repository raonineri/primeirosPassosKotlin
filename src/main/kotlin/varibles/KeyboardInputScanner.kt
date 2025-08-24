package varibles

import java.util.Scanner

fun main(){

    print("> ")
    val a1 = readln()

    print("> ")
    val a2 = readln()

    println("Resultado: ${a1 + a2}")

    val sacanner = Scanner(System.`in`)

    print("> ")
    val b1 = sacanner.nextInt()

    print("> ")
    val b2 = sacanner.nextInt()

    println("Resultado: ${b1 + b2}")
}