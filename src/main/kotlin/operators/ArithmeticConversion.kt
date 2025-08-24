package operators

fun main(){

    println(10 / 3)  // inferencia traduz o resultado como int

    println(10.0 / 3)  // a inferencia pega o valor mais agrangente, neste caso o Double

    val t = 10f // existe o suflixo f para delcaração da variavel como float, mas não existe um para double pois ele é o
                // padrão, da mesma forma que acotnece com int (padrão) e long
}