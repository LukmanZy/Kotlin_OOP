package app

import data.Person

fun main() {
    var nama = Person()
    nama.firstName = "Ucup"

    nama.sayHello("Lukman")
    nama.sayHello("Zyan","Lilou")
}