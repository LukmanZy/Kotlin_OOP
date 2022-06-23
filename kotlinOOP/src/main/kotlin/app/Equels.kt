package app

import data.Company

fun main() {
    val company1 = Company("Lukman")
    val company2 = Company("Lukman")
    val company3 = Company("Zyan")

    println(company1 == company2)
    println(company1 == company1)
    println(company1 == company3)

}