package app

import data.HandPhone
import data.Laptop

fun printObjectWithWhen(any: Any){
    when(any) {
        is Laptop -> println("Laptop is name ${any.name}")
        is HandPhone -> println("Handphone is name ${any.name}")
        else -> println(any)
    }

}

fun printObjectWithIf(any: Any){
    if (any is Laptop) {
        println("Laptop is name ${any.name}")
    }
    else if (any is HandPhone){
        println("Handphone is name ${any.name}")
    }
    else println(any)
}

fun printString(any: Any){
    val value: String = any as String
    println(value)
}

fun printStringSafe(any: Any){
    val value: String? = any as? String
    println(value)
}

fun main() {

    printObjectWithWhen(Laptop("Asus"))
    printObjectWithWhen(HandPhone("Realme"))

    printObjectWithIf(Laptop("Asus"))
    printObjectWithIf(HandPhone("Samsung"))

    printString("Hello")
//    printString(1) // error karena di dalam function harus String

    printStringSafe("kuluk")
    printStringSafe(2) // Hasilnya akan null karena nullabel casting
}