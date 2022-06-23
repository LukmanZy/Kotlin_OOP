package app

import data.BigNote
import data.Note

fun main() {
    var note = Note("Belajar Kotlin")

    println(note.title) // => Menggunakan get()
    note.title = "belajar Kotlin OOP" // => Menggunakan set()
    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}