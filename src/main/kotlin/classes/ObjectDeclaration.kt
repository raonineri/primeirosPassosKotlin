package classes

fun main(){
    Math2.sum(10, 10)
}

// Usar quando tiver classes que não quiser ter mais de uma instância
object Math2{

    val pi = 3.1416

    fun subtract(a: Int, b: Int) = a - b

    fun sum(a: Int, b: Int) = a + b
}