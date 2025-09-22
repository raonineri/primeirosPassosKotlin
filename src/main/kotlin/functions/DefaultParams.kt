package functions

fun main(){
    sayHello("Bira", "seja muito bem vindo.")
    sayHello("Saulo")
}

private fun sayHello(name: String, mensagem: String = ""){
    println("Hi, $name, $mensagem")
}