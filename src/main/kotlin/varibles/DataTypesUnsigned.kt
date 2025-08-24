package varibles

fun main(){
    /*
    Números que só podem ter valores posítivos
        Byte -> UByte
        Short -> UShort
        Int -> UInt
        Long -> ULong
     */

    val x = 100u // o u pode ser minusculo ou maiusculo
    val y = 100UL // precisa seguir a ordem UL

    val x2 = x.toInt()
    val y2 = y.toLong()

    val x3  = -20
    val x4 = x3.toUInt() // está conversão trará um valor inconsistente, no caso ("4294967276")
    print(x4)
}