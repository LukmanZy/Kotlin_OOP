package app

import data.Employee
import data.Asisten
import data.Manager

fun main() {
    val manager = Manager("Lukman")
    val employee= Employee("surucup")
    val asisten = Asisten("surudin")

    manager.sayHello("Ucup")
    employee.sayHello("budi")
    asisten.sayHello("fuad")
}