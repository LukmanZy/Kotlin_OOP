package data

enum class Gender(val descricption: String) {
    MALE("Male"),
    FEMALE("Female");

    fun showdesc(){
        println(descricption)
    }
}