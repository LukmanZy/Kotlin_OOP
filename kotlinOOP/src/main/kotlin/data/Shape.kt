package data

open class Shape {
    open val corner: Int = 1
    open fun printName(){
        println("ini adalah function dari class Shape")
    }
}

class Rectangle: Shape(){
    override val corner: Int = 4
    val parentCorner: Int = super.corner
    override fun printName() {
        println("ini adalah function dari class Rectangle")
        super.printName()
    }
}

open class Triangle: Shape(){
    override var corner: Int = 2
}