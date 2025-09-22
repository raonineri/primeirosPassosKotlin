package inheritance

fun main(){
    val person1 = Person("Francisco", "Silva", 23)
    val person2 = Person("Francisco", "Silva", 23)

    println(person1)
    println(person2)
    println(person1 == person2)
    println(person1.hashCode())
    println(person2.hashCode())

    val person3 = person2.copy(age= 30)
    println(person3)
}

/**
 * Classe para armazenamento de dados. DTO?
 *
 */
data class Person(
    val firstName: String,
    val lasName: String,
    val age: Int
)