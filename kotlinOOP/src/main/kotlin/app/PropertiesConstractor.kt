package app

import data.User

fun main() {
    var user1 = User("Lukman", "rahasia")
    var user2 = User("Joko", "rahasiaJuga")

    user1 = User("Zyan","rahasia")
    println(user1.usermane)
    println(user1.password)

    println(user2.usermane)
    println(user2.password)
}