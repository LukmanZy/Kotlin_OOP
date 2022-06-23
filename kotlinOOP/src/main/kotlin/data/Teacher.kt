package data

open class Teacher(val name: String) {
    private fun name(){
        println("my name is $name")
    }
    open fun sayHello(){
        println("hello ${this.name}")
    }
}

class SuperTeacher(name: String): Teacher(name){
    override fun sayHello() {
        super.sayHello()
    }
}