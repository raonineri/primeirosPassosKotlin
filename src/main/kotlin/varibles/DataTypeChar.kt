package varibles

fun main(){

    val c: Char = 'A'

    println(c)
    println(c.code)

    val i = 65

    println(i.toChar())

    val c2 = '1'
    println(c2.isDigit())
    println(c2.isLowerCase())
    println(c2.digitToIntOrNull())
}