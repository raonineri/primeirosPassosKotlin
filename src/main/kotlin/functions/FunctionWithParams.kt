package functions

fun main(){

    sayHello("João")
    sayHello("Maria")
    sayHello("Pedro")
}

private fun sayHello(name: String){
    println("Hi, $name!")
}