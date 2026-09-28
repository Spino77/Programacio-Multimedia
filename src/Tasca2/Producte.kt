package Tasca2

class Producte(val identifier: Int, val name: String, var price: Int, var stock: Int, val category: String) {

    override fun toString(): String {
        return "Producte(identifier=$identifier, name=$name, price=$price, stock=$stock, category=$category)"
    }
}