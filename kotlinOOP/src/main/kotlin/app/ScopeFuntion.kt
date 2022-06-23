package app

import data.Student

fun main() {
    val student = Student("Lukman", 22)
    val student2 = Student("Ucup", 19)
    student.let {
        println(it.name)
        println(it.age)
    }
    val result: String = student2.let {
        "name ${it.name} age ${it.age}"
    }
println(result)

    val result2: String = student.run {
        "name ${this.name}, age ${this.age}"
    }
    println(result2)

    val result3 : Student= student.apply {
        "name ${this.name}, age ${this.age}"
    } // mereturn ke objek bukan ke parameter

    println(result3)

    val result4: Student = student.also {
        "name ${it.name}, age ${it.age}"
    }
    println(result4)

    val result5 : Student = Student("Jajang",80)
    with(result5){
        println("name ${this.name} ${this.age}")
    }
}