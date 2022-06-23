enum class Gender (val desc: String){
    MALE("laki-laki"), FEMALE("perempuan");

    fun desc() = println(desc)
}

fun main() {
    val lakiLaki = Gender.MALE
    val perempuan = Gender.FEMALE
    val all: Array<Gender> = Gender.values()
    for (i in all){
        println(i)
    }
    lakiLaki.desc()

}