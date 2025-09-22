package classes

/**
 * Object Declaration são normalmente utilizadas em cenários onde há necessidade de garantir apenas uma instância de uma
 * determinada classe. (Padrão de projeto Singleton)
 */
fun main(){

    var car1 = Factory.newCar()
    var car2 = Factory.newCar()
    var car3 = Factory.newCar()
}

object Factory {
    var instanceCount = 0
    fun newCar() : Car {
        instanceCount++
        return Car()
    }
}

class Car