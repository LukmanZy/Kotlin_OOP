package app

import data.Student
import data.sayHello
import data.upperCase

fun main() {
    val student: Student? = Student("Lukman", 22)
    student.sayHello("ucup")

    println(student?.upperCase)

    student?.upperCase = "Hakim"
    println(student?.upperCase)
}