package delegation_props_oo

import java.util.*
import kotlin.reflect.KProperty

class People {
    var firstName: String? by NameDelegate()
    var lastName: String? by NameDelegate()

    override fun toString(): String {
        return "$firstName $lastName"
    }
}

class NameDelegate {
    private var formattedValue: String? = null
    operator fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String?
    ) {
        if (value != null ) {
            formattedValue = value.trim().uppercase(Locale.getDefault())
        }
    }

    operator fun getValue(
        thisRef: Any?,
        property: KProperty<*>
    ): String? {
        return formattedValue
    }
}

fun main() {
    val people = People()
    people.firstName = "   Wanderlei      "
    people.lastName = "    Santos   "
    println(people.toString())
    //WANDERLEI SANTOS
}