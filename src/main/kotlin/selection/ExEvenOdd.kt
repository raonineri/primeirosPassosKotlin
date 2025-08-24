package selection

    /**
     * Exércicio
     * Escreva um programa que recebe um valor fornecido pelo teclado e diz se ele é par ou impar
     */
fun main() {

    println(":> ")
    val input = readln().toInt()

    if(input % 2 == 0){
        println("O número digítado é par.")
    }
    else{
        println("O número digitado é impar")
    }
}