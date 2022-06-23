package app

import data.Application
import data.Utilities

fun main() {
    var utilites = Utilities
    Utilities.name = "Berubah"
    println(utilites.name)
    Utilities.name = "zyan"
    println(utilites.name)
    println(utilites.toUpper("Lukman"))

    val namaBaru = Application("Lukman")
    Application.Utilities.Uppercase("zyan")



//
//    a()
//    b()

//    Object di dalam Class
//    var application = Application.Utilities.toUpper("Lukman")
//    println(application)
//
////    companion object
//    var toLower = Application.toLower("zyan")
//    println(toLower)
//}
//
//fun a(){
//    println(Utilities.name)
//}
//fun b(){
//    println(Utilities.name)
}