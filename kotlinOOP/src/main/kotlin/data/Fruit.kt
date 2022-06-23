package data


data class Fruit(var total: Int) {
//    operator fun plus(fruit: Fruit): Fruit{
//        return Fruit(total + fruit.total)
//    }

    operator fun plus(value: Int): Fruit{
        return Fruit(total + value)
    }

    operator fun minus(fruit: Fruit):Fruit{
        return Fruit((total - fruit.total))
    }
    operator  fun get(fruit: Int):Fruit{
        return Fruit(total)
    }

}