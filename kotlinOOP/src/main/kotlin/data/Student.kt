package data

class Student(var name: String, val age: Int)

var Student.upperCase: String // => Extension Properties
    get() = this.name.uppercase()
    set(value) {
        this.name = value
    }

fun Student?.sayHello(name: String) { // => Extension Function
    if (this != null){
        println("Hello $name, my name is ${this.name} and my age is ${this.age}")
    }
}