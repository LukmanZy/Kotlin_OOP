package app

import data.Company

fun main() {
    val company1 = Company("Lukman")
    val company2 = Company("Lukman")
    val company3 = Company("Zyan")

    println(company1 == company1)
    println(company1 == company3)

    println(company1.hashCode() == company2.hashCode())
    println(company1.hashCode() == company3.hashCode())

}