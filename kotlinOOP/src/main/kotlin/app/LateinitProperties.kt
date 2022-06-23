package app

import data.Television

fun main() {
    var television = Television()
    television.initTelevision("samsung")

    println(television.brand)
}