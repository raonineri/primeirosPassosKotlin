package properties

fun main(){
    val s1 = Square(10)
    val s2 = Square(10)
    val s3 = Square(-10)

}

class Square (val size: Int) {
    //Bloco init é chamado toda a vez que uma instância é criada. Ideal para validação de dados.
    init{
        println("init1")
        require(size>0)
    }

    init {
        println("init2")
    }
}