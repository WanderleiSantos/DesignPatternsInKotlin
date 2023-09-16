package delegates_lazy_oo

import kotlin.properties.Delegates

class StudentHeavy {
    init {
        println("Student Heavy Initialized")
    }
}

class Student {
    val heavy by lazy {  StudentHeavy() }
    var marks: Int by Delegates.observable(50) {property, oldValue, newValue ->
        println("Old Value $oldValue")
        println("New Value $newValue")
    }
    var age: Int by Delegates.vetoable(14){property, oldValue, newValue ->
        println("Old Age $oldValue")
        println("New Age $newValue")
        newValue >= 14
    }
}

fun main() {
    val student = Student()
    student.heavy

    student.marks = 70
    student.marks = 100

    student.age = 13
    student.age = 12
    student.age = 16
    student.age = 17
}