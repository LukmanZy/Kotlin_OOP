package data

class Note(title: String) {
    var title: String = title
    get() { // => untuk mengambil properties, dimana proties disini adalah title
        return field // => field mengacu ke title
    }
    set(value) {  // => untuk mengubah properties
        if (value.isNotBlank()){  // => pengecekan
            field = value  // => jika value nya di ubah maka akan di simpan di field
        }
    }
}
class BigNote(val title: String){
    val bigTitle: String // => jadi jika yang di panggil bigtitle tapi yang keluar adalah get()
    get() = title.toUpperCase()
}