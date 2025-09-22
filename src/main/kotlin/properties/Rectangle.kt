package properties

fun main(){

    var r1 = Rectangle(20, 10);
}

class Rectangle(
    width: Int, height: Int
){
    // implementação padrão de um get/set em kotlin
    var width: Int = width
        get() {
            return field
        }
        set(value) {
            field = value
        }

    var width2: Int = width
        get() {
            return field
        }
        private set (value){
            if(value >=0){
                field = value
            }
        }

    var height: Int = height
        private set

    val surface get() = width * height
}