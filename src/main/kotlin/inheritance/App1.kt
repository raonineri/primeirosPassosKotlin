package inheritance

fun main(){
    //val animal = Animal("Branco")
    val cachorro = Dog("Preto")
    val cat = Cat("Cinza")

    //println(animal is Animal)
    println(cachorro is Dog)
    println(cachorro is Animal)
    println(cachorro is Animal)
}