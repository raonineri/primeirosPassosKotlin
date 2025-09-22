package inheritance

fun main(){
    val cat = Cat("Preto")
    val cachorro = Dog("Marrom")

    cachorro.latir()
    cachorro.comer()
    println(cachorro.color)

    cat.comer()
    cat.miar()
}