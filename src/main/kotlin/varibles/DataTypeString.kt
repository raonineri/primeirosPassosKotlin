package varibles

fun main(){
    // strings em kotlin são imutáveis
    val s1 = "abc"
    val s2 = "def"
    

    // val s1s2 = s1 + s2

    // string tamplates que são avaliados em tempo de execução com o uso de $, para usar funções deve-se por {}
    val s1s2 = "Soma: '$s1$s2'. O tamanho é ${(s1 + s2).length}"

    

    println(s1s2)
}