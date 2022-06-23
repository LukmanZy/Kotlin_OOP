package app

import data.Customer
import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    var premiumCustomer= PremiumCustomer("Lukman",1000000)
    var executiveCustomer= ExecutiveCustomer("zyan",300000)
    var customer= Customer("emul","ksksk")
    customer.print()
    customer= Customer("Ucup",)
    customer.print()


    premiumCustomer.print()
    customer.print()
    executiveCustomer.print()

    premiumCustomer= PremiumCustomer("abab")
    premiumCustomer.print()

    executiveCustomer= ExecutiveCustomer("Udin")
    executiveCustomer.print()
    executiveCustomer.sayHello()
}