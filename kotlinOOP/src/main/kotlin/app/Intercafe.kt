package app

import data.Human

interface Intercafe {
    val namee: String
    fun sayHelow(){
        println("hello my name is ${this.namee}")
    }
}
interface sapa: Intercafe{
    fun say(){
        println("i'm is ${this.namee}")
    }
}

interface BelongsTos{
    fun belongTo(name: String){
        println("i have a $name")
    }
}

interface Vichicle{
    fun trasport(name: String, merk: String){
        println("my vichicle is $name, merk $merk")
    }
}

class manusia( val name: String,): sapa, BelongsTos, Vichicle{
    override var namee: String = name
        get() {
            return field
        }
    set(value) {
        field = value
    }

    inner class jelema(val namejelema: String){
        fun heljel(){
            println("hello ${this@manusia.name}")
        }
    }
}

interface Action{
    fun action()
}
fun ActionFunt(action: Action){
    action.action()
}

fun main() {
    val human = manusia("jajang")

    human.namee = "ucup"
    human.name
    human.say()


//    val jelma = manusia("ucup")
//    println(jelma.name)
//    jelma.say("isan")
//    jelma.sayHelow("mahmud")
//    val human = Human("Lukman")
//    println(human.name)
//    human.sayHello("Jajang")
//
//    human.name = "Zyan"
//    human.sayHello("Ujang")
//
//    human.Go()
//    human.move()
}