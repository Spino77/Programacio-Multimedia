package Tasca2

class Inventari {
    private var list = mutableListOf<Producte>()

    fun registerProduct(product: Producte) {
        list.add(product)
    }

    fun listProducts(): MutableList<Producte> {
        return list
    }

    fun updateProduct(id: Int, newPrice: Int, newStock: Int) {
        var pos: Int
        for (x in list) {
            if (x.identifier == id) {
                x.price = newPrice
                x.stock = newStock
            }
        }
    }
}
