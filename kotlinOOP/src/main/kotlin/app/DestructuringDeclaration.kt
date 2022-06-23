package app

import data.Game
import data.Login
import data.MinMax

fun minmax(value1: Int, value2: Int): MinMax{
    return when{
        value1 > value2 -> MinMax(value2,value2)
        else -> MinMax(value1, value1)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean{
    return callback(login)
}

fun main() {
    val game = Game("Zelda", 1999999)
//    mengekstrak data
//    val name = game.name
//    val price = game.price
    val (name, price) = game
    println(name)
    println(price)

    val (minus, maximum) = minmax(100, 1000)
    println(minus)
    println(maximum)

    val login = Login("zyan", "rahasia")
//    login(login){login ->
//        login.user == "zyan" && login.password == "rahasia"
//
//    }
    login(login){(username, password) ->
        username == "zyan" && password == "rahasia"
    }


}