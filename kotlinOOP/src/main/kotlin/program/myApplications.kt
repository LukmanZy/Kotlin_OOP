package program

import annotations.Fancy


@Fancy(author = "Zyan")
class myApplications(val name: String, val versions: Int) {

    fun info(): String = "Applications $name -$versions"

}

fun main() {
    val myApplications = myApplications("Belajar Kotlin",1)
    println(myApplications.info())
}