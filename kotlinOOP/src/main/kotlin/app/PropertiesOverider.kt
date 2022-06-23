package app

import data.Rectangle
import data.Shape
import data.Triangle

fun main() {
    val shape1 = Shape()
    val shape2 = Rectangle()
    val shape3 = Triangle()

// Mengakses variable
    println(shape1.corner)
    println(shape2.corner)
    println(shape3.corner)
    println("parentcorner = ${shape2.parentCorner}")
    shape3.corner= 5
    println(shape3.corner)
//    Mengakses function
    shape1.printName()
    shape2.printName()
}