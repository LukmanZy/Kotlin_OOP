package app

import data.Boss

fun main() {
    val boss = Boss("Zyanl")
    val employee = boss.Employee("Ucup")
    val employee1 = boss.Employee("ujang")

    val boss2 = Boss("Lukman")
    val employee2 = boss2.Employee("Udin")
    val employee22 = boss2.Employee("Surucup")

    employee.hi()
    employee1.hi()
    employee2.hi()
    employee22.hi()
}