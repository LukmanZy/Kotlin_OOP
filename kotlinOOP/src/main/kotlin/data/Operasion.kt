package data

sealed class Operasion (val name: String){
}
class Plus: Operasion("Plus")
class Minus: Operasion("Minus")
class Modulo: Operasion("Modulo")