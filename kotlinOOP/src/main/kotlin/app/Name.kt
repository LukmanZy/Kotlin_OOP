package app

import data.Person

fun main() {
    var nama = Person()
//    Mengakses properties dari class
    nama.firstName = "Lukman"
    nama.lastName = "Hakim"

//    Mengakses function dari kelas
    nama.sayHello("Lukman")
    nama.fullName()
}