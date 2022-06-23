package data

open class Employee(val name: String) {
    open fun sayHello(namanya: String) {
        println("hello $namanya my name is ${this.name}")
    }
}
open class Manager(namaManager: String): Employee(namaManager){
    // overide membuat sebuah function di wariskan
    final override fun sayHello(namanya: String) { // final -> mengunci supaya func say hello tidak bisa di wariskan
        println("hello $namanya saya adalah manager ${this.name} ini teman saya")
    }
}

class SuperManager(namaSuperManager: String): Manager(namaSuperManager) {
// akan error karana fun di class Manager di kunci dengan final
//    override fun sayHello(namanya: String) {
//        println("hello $namanya saya adalah manager ${this.name} ini teman saya")
//    }
}

class Asisten(name: String): Employee(name){
    override fun sayHello(namanya: String) {
        println("hello $namanya saya adalah assisten ${this.name}")
    }
}