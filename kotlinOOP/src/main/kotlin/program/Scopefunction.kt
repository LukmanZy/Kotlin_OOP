package program

import data.Student

fun main() {
    val student = Student("zyan",22)
    val result= student.let {
        "name ${it.name}, age ${it.age}"
    }
    println(result)

    val result2 = student.run {
        "name ${this.name}, age ${this.age}"
    }
    println(result2)
}