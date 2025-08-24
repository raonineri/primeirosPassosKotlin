package varibles

import java.util.Scanner

fun main(){
    /*
    EXERCÍCIO
    -
    CRIE UM PROGRAMA QUE ARREDONDA UM VALOR DECIMAL INFORMADO PELO USUÁRIO E MOSTRA A RESPOSTA NA TELA.
    O ARREDONTAMENTO PODE SER FEITO TRUNCANDO AS CASAS DECIMAIS.
     */

    val scanner = Scanner(System.`in`)
    print("Digite um valor decimal")
    val teste = scanner.nextDouble()


    println(teste.toInt())
}