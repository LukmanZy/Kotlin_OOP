package data

class Person {
    var firstName: String = ""
    var midleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String){
        println("hello $name, my name is ${this.firstName}")
    }

    fun sayHello(firstname: String, lastname: String){
        println("Hello my name $firstname $lastname, my name is ${this.firstName}")
    }

    fun fullName(): Any {
        if (midleName == null) {
            return print("${this.firstName} ${this.lastName}")
        }else{
        return println("${this.firstName} ${this.midleName} ${this.lastName}")
        }
    }
}