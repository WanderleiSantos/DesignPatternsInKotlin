package inheritance_oo

class Box(
    var length: Int,
    var width: Int,
    var height: Int
) {

    fun fillContents() {
        println("inheritance_oo.Box is Filled")
    }

    fun open() {
        println("inheritance_oo.Box Opened")
    }
}