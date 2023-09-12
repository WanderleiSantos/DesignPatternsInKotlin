package delegation_oo

class Account {
    var balance: Double = 0.0

    fun converter(converter: Converter): Double {
        return converter.converte(balance)
    }
}