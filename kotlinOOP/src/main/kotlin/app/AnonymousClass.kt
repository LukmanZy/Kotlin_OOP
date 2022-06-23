package app

import data.Action

fun fireAction(action: Action) {
    action.action()
}

class SimpleAction: Action{
    override fun action() {
        println("this is the simple action")
    }
}

fun main() {
    fireAction(SimpleAction())
    fireAction(object: Action{
        override fun action() {
            println("Action 1")
        }
    })
    fireAction(object: Action{
        override fun action() {
            println("Action 2")
        }
    })


}