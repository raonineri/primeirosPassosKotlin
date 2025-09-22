package polimorfismo

fun main(){
    val p: Programmer = Programmer()
    p.work()

    val t = Teacher()
    t.work()

    var c: Programmer = KotlinProgrammer()
    c.work()

}

abstract class Employee(){
    abstract fun work()
}

open class Programmer : Employee(){
    override fun work() {
        println("Programmer working")
    }
}

class KotlinProgrammer : Programmer(){
    override fun work() {
        println("Kotlin Programmer working")
    }
}

class Teacher : Employee(){
    override fun work() {
        println("Teacher working")
    }
}