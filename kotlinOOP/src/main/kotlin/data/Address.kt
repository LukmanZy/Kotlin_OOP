package data

class Address {
    var street: String = ""
    var city: String = ""
    var country: String = "Indonsia"

    constructor(paramStreet: String, paramCity: String,) {
        street = paramStreet
        city = paramCity

        println("$street, $city")
    }

    constructor(paramStreet: String, paramCity: String, paramCountry: String) :
            this (paramStreet, paramCity) {
                country = paramCountry

        println("$country")
    }

}