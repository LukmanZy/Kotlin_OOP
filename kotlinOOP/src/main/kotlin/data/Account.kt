package data

import kotlin.properties.Delegates

class Account(description: String= "") {
    val name: String by lazy{
        println("Name is called")
        "Lukman"
    }

    var description: String by Delegates.observable(description){
        property, oldValue, newValue ->
        println("${property.name} has changed form $oldValue to $newValue")
    }
}