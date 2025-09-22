package polimorfismo

fun main(){
    val tree = Tree("Brown", 2.0)
    val treeCopy = tree.clone()

    println(tree)
    println(treeCopy)
}

interface Cloneable{

    fun clone() : Any
}

class Tree(
    val color: String,
    val height: Double
): Cloneable{
    override fun clone(): Any {
        return Tree(color, height)
    }
}