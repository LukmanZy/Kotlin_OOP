package app

import data.Asisten
import data.Employee
import data.Manager

fun main() {
    var employee: Employee = Employee("lukman")
    employee.sayHello("bagas")

    employee = Manager("zyan")
    employee.sayHello("ucup")

    employee =  Asisten("Bagus")
    employee.sayHello("padil")
}