package classes

fun main(){
    println(Math.sum(20,10))

    //Math.sbtract()
    Math().sbtract(20, 10)

}

class Math{

    // objeto cujo ciclo de vida é gerenciado pelo kotlin, sendo possível acessar sem fazer uma instância de Math
    companion object {
        fun sum(a: Int, b: Int) = a + b
    }

    fun sbtract(a: Int, b: Int) = a - b
}