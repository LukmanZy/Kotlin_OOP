package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val women = Gender.FEMALE
    val allGender: Array<Gender> = Gender.values()

    println(man)
    println(women)
    println(allGender.toList())
    man.showdesc()
}