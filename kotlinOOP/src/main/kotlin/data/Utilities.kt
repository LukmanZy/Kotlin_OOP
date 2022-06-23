package data

import java.util.*

object Utilities {
    var name: String = "My Utilities"

    fun toUpper(name: String):String{
        return name.uppercase(Locale.ENGLISH)
    }
}