package data

abstract class Animal (val nama: String) {
    abstract val name: String // => tidak boleh di inisialisasikan
                              // => di inisialisasikan di class Child
    abstract fun run() // => tidak boleh di kasih body
                       // => dikasih body di class Child
}

class Cat(nama: String) : Animal(nama) {
    override val name: String = "Cat"

    override fun run() {
        println("nama $name adalah ${this.nama}")
    }
}
