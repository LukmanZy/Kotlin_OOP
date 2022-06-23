package app

import data.Application


typealias App = Application
typealias App2 = data2.Appilaction

// Type alis juga bisa digunakan di function
// dimana untuk memudahkan membuat lambda
// Contoh tanpa alias:
// fun sayHello(supplier: () -> String){
//    println("hello $supplier")
//}

typealias StringSupplier= () -> String
fun sayHello(supplier: StringSupplier){
    println("hello $supplier")
}


fun main() {
    val app = App("Zyan")
    val app2 = App2("app2 dari data2")
}
