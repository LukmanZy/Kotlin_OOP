package app

import data.Product

fun main() {
    val product = Product("Indomie", 2000, "Mie Insatan")
    val product2 = product.copy(name = "Sedap", 2500)
    val product3 = product.copy(name = "ABC", category = "kopi")

    println(product)
    println(product2)
    println(product3)

}
