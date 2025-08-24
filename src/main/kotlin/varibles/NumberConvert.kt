package varibles

fun main(){

    val i1 = 10
    val d1 = i1.toDouble()

    println(d1)

    val l1 = i1.toLong()
    println(l1)

    val d2 = 10.34
    val i2 = d2.toInt() // irá truncar as casas decimais.
    println(i1)

    val i3 = 2000
    val b1 = i3.toByte()
    println(b1) // não dará erro no compilador e nem em tempo de execução, mas a conversão trará um valor confuso, no caso foi -48.

    println(b1)
}