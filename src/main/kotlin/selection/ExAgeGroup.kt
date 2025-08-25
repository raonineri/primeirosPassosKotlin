package selection

/**
 * Exercício
 * Escreva um programa que, com base em uma idade fornecida, classifique a pessoa nos grupos a baixo:
 *
 * - CRIANÇA: 0 a 12 anos
 * - ADOLECENTE: 13 a 17 anos
 * - ADULTO: 18 a 65 anos
 * - SÊNIOR: 66 anos ou mais
 */
fun main(){
    print("Dígite sua idade: ")
    val idade = readln().toInt()

    if (idade in 0 .. 12){
        println("Criança!")
    }else if(idade in 13 .. 17){
        println("Adolescente")
    }else if(idade in 18 .. 65){
        println("Adulto")
    }else if(idade in 66 .. 120){
        println("Sênior")
    }else{
        println("Idade invalida.")
    }
}