//package app
//
//import data.Minus
//import data.Modulo
//import data.Operasion
//import data.Plus
//
//fun operasion(int1: Int, int2: Int, operasion: Operasion): Int {
//    return when(operasion){
//        is Plus -> int1 + int2
//        is Minus -> int1 - int2
//        is Modulo -> int1 % int2
//    }
//}
//
//fun main() {
//    println(operasion(10,10,Plus()))
//    println(operasion(10,10,Minus()))
//    println(operasion(10,2,Modulo()))
//}