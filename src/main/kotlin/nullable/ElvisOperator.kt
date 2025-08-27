package nullable

fun main(){

    val value: Int? = 10

    var  value2 = if (value != null) value else 0
    println(value2)

    value2 = value ?: 0

    println(value2)

}