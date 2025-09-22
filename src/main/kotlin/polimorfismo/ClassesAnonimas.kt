package polimorfismo

fun main(){
    val veiculo = object : Veiculo{
        override fun drive() {
            println("Dirigindo...")
        }
    }

    veiculo.drive()
}

interface Veiculo {
    fun drive()
}