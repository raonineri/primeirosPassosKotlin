package functions

/**
 * EXERCÍCIO
 *
 * Escreva uma função que calcule a idade humana equivalente a um cachorro, considereando que cada ano que um cachorro
 * vive corresponde a 7 anos de vida de um ser humano. O valor da idade deve ser fornecido via teclado
 */
fun main(){
    print("> ")
    val dogAge: Double = readln().toDouble()

    println(dogToHumanAgeCalculator(dogAge))
}

private fun dogToHumanAgeCalculator(years: Double) : Double{
    return years * 7
}

