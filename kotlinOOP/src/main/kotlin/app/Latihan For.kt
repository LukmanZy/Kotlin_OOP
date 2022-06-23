package app

fun main() {
//    Jumlahkan ada berapa ada berapa gold dan silver
    val treasure = arrayOf("Gold", "Gold", "Silver",
                            "Silver", "Zonk", "Silver",
                            "Zonk", "Gold", "Silver")
var gold: Int = 0
    var silver: Int = 0
//    for (i in treasure) {
//            if (i == "Gold") {
//                gold += 1
//            } else if (i == "Silver") {
//                silver += 1
//            }
//    }
//    println("total gold = $gold")
//    println("total silver = $silver")

    for (i in treasure){
        when (i) {
            "Gold" -> gold++
            "Silver" -> silver++
        }
    }
    println("total gold = $gold")
    println("total silver = $silver")
}