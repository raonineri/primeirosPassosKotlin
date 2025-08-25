package selection

fun main(){
    print("Digite um número: ")
    val x = readln().toInt()

    println(when{
        x > 0 -> "Posítivo"
        x < 0 -> "Negativo"
        else -> "Zero"
    })

    print("Digite A/a ou B/b: ")
    val s: Char = readln().toCharArray().get(0)

    val v = when (s){
        'A', 'a' -> 1
        'B', 'b' -> 2
        else -> 3
    }

    println(v)
}