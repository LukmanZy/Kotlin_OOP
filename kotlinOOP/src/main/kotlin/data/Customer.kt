package data

open class Customer(val name: String, val type: String, val balnce: Long) {
    constructor(name: String, type: String): this(name,type,6)
    constructor(name: String): this(name, "type")
    open fun print() {
        println("$name $type $balnce")
    }

    fun sayHello(){
        print("hallo $name")
    }
}
class PremiumCustomer: Customer{
    constructor(name: String): super(name,"Premium", 10)
    constructor(name: String,balnce: Long): super(name,"Premium Kedua", balnce)

}

class ExecutiveCustomer(name: String, balnce: Long): Customer(name,"Executive",balnce){
    constructor(name: String): this(name,100)
}