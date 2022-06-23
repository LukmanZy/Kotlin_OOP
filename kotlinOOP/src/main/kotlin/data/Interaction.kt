package data

interface Interaction {
    val name: String
    fun sayHello(name: String)
}

interface Go: Interaction{ // => Boleh lebih dari satu
    fun Go(){
        println("GO! ${this.name}")
    }
}

interface MoveA{
    fun move() = println("Move A")
}

interface MoveB{
    fun move() = println("Move B")
}

class Human(name: String) : Go, MoveA, MoveB{
    override var name: String = name
        get() {
            return field
        }
    set(value) {
        field = value
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
    }

    override fun sayHello(name: String) {
        println("hello $name my name is ${this.name}")
    }

}