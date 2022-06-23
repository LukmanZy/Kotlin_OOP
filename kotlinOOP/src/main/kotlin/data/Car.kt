package data

class Car (paramBrand: String, paramMerk: String, paramYear: Int) {

    init {
        println("$paramBrand dibuat pada tahun $paramYear")
    }

//    Membuat Secondary Constructor
    constructor(paramBrand: String, paramMerk: String): this (paramBrand, paramMerk, paramYear = 2000) {
        println("Constructor Secondary 1")
    }
    constructor(paramBrand: String): this (paramBrand, ""){
        println("Constructor Secondary 2")
    }

    var brand: String = paramBrand
    var merk: String = paramMerk
    var year: Int = paramYear
}