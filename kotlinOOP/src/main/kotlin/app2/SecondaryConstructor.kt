package app2

class SecondaryConstructor{
    var firsName: String = ""
    var middleName: String = ""
    var lastName: String = ""
    constructor(firsName: String){
        this.firsName = firsName
    }

    constructor(firsName: String, lasName: String) {
        this.firsName = firsName
        this.lastName = lasName
    }

    constructor(firsName: String, middleName: String, lasName: String): this(firsName, lasName){ // boleh memanggil constructor tapi tidak wajib
        this.middleName = middleName
    }

}

fun main() {
    val justFirstName = SecondaryConstructor("Lukman")
    val fullName = SecondaryConstructor("Lukman","cahya","wiguna")
    println(justFirstName.firsName)
}