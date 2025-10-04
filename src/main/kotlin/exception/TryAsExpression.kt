package exception

fun main(){
    // O bloco try/cach pode servir como uma expressão
    print("> ")
    val v = try {
        readln().toInt()
    }
    catch (ex: NumberFormatException){
        0
    }

    println("I = $v")
}