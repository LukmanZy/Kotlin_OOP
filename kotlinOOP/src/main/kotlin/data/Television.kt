package data

class Television {
    lateinit var brand: String

    fun initTelevision(brand: String){
        this.brand = brand
    }
}

fun main() {
    val name = Television()
    name.brand = "Lukman"
    println(name.brand)

    val name2 = Television()
    name.initTelevision("Samsung")

}