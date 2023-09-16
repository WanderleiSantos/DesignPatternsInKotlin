package singleton_oo

/*class Manager private constructor() {
    companion object {
        private var instance: Manager? = null
        fun getInstance() = synchronized(this) {
            if (instance == null)
                instance = Manager()
            instance
        }
    }
}*/

object Manager{
    init {
        println("Manager Initialized")
    }
}

fun main() {
    //println(Manager.getInstance())
    //println(Manager.getInstance())
    println(Manager)
    println(Manager)
}