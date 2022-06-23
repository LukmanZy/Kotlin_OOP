package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val myBase = MyBase()
    myBase.sayHello("zyan")

    val myBaseDelegate = MyBaseDelegate(myBase)
    myBaseDelegate.sayHello("ucup")
    myBaseDelegate.sayGoodbye("lukman")
}