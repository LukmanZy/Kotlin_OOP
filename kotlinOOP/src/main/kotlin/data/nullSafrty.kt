package data

data class Friend(val name: String)

fun sayHello(friend: Friend?){
    if (friend == null){
        println("no name")
    } else{
        println("Hello ${friend.name} ")
    }
}

fun main() {
    sayHello(Friend("lukman"))
    sayHello(null)
}