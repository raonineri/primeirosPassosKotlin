package inheritance

// o modificador open permite com que a classe possa ser herdada
// o modificador abstract não permite instâncias da classe e torna o open desnecessário
open abstract class Animal(
    val color: String
) {
    fun comer(){
        println("Comendo")
    }

    // o modificador private não permite acesso das classes herdadas
    private fun dormir(){
        println("Dormindo")
    }

    // pode ser invocado pelas classes herdadas
    protected fun soneca(){
        println("Tirando uma soneca")
    }
}

class Dog(color: String) : Animal(color){
    fun latir(){
        println("Au-Au")
        soneca()
    }
}

class Cat(color: String) : Animal(color){
    fun miar(){
        println("Miau")
    }
}