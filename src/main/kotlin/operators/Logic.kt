package operators

fun main(){
    // Tabela-verdade
    println("Tabela-verdade")
    println("----------------")
    println("AND")
    println("T and T ${true && true}")
    println("T and F ${true && false}")
    println("F and T ${false && true}")
    println("F and F ${false && false}")
    println("----------------")
    println("OR")
    println("T or T ${true || true}")
    println("T or F ${true || false}")
    println("F or T ${false || true}")
    println("F or F ${false || false}")
    println("----------------")
    println("NOT")
    println("not F ${!false}")
    println("not T ${!true}")
}