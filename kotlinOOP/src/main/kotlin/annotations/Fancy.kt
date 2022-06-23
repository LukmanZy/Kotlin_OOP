package annotations


@Target(AnnotationTarget.CLASS) // => hanya bisa di tambahkan di class
@Retention(AnnotationRetention.RUNTIME) // => hasilnya di complple, masuk kedalam binary nya, tapi bisa di baca juga di reflection
//@Retention(AnnotationRetention.SOURCE) // => hanya ada di source code, ketika di complie hilng
//@Retention(AnnotationRetention.BINARY) // => ketika di complie itu ada hasilnya
@MustBeDocumented // => bisa di dookumentasikan

annotation class Fancy(val author: String)
