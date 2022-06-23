package app

import Exception.ValidationsException

fun validationExeption(name: String){
    if(name.isBlank()){
        throw ValidationsException("nama tidak diisi")
    }else{
        println("$name")
    }
}

fun main() {
    try {


    } catch (error: ValidationsException){
        println("error: ${error.message}")
    }finally {
        validationExeption("program beres")
    }



}