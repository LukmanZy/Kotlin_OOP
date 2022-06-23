package data

class User (var usermane: String, var password: String) {

    override fun toString(): String {
        return "user with username = $usermane"
    }

}