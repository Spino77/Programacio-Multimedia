package Tasca2

class Producte(val identifier: Int, val name: String, var price: Float, var stock: Int, val category: String) {

    override fun toString(): String {
        return "ID: $identifier, Name: $name, Price=$price, Stock=$stock, Sategory=$category"
    }
}