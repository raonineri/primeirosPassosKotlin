package polimorfismo

fun main(){
    val c = Coffee()

    c.preparar()
}

open class Drink{
    open fun preparar(){
        println("Preparando DRINK")
    }
}

class Coffee : Drink(){
    override fun preparar(){
        super.preparar() // super referência a super classe.
        println("Preparando Café")
    }
}