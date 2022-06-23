package data

interface Base {
    fun sayHello(name: String)
    fun sayGoodbye(name: String)
}

class MyBase: Base{
    override fun sayHello(name: String) {
        println("hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Good Bye $name")
    }
}

// yang asalanya seperti ini :
//class MyBaseDelegate(val base: Base): Base by base {
////    override fun sayHello(name: String) {
////        base.sayHello(name)
////    }
////
////    override fun sayGoodbye(name: String) {
////        base.sayGoodbye(name)
////    }
////}

// Menjadi seperti ini :
class MyBaseDelegate(val base: Base): Base by base{
    override fun sayHello(name: String) {
        println("Hey kamu $name")
    }
}