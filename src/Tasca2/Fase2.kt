package Tasca2

import kotlin.system.exitProcess

val inv = Inventari()
var nextID:Int = 1

fun main() {
    while (true) {
        println("1. Register product\n" +
                "2. Show all products\n" +
                "3. Update product stock and price\n" +
                "4. Quit\n")
        try {
            var option: Int = readln().toInt()

            when (option) {
                1 -> {

                    println("Name?")
                    val name:String = readln()
                    println("Price?")
                    val price:Float = readln().toFloat()
                    println("Stock?")
                    val stock:Int = readln().toInt()
                    println("Category?")
                    val category:String = readln()

                    val p = Producte(nextID, name, price, stock, category)
                    inv.registerProduct(p)
                    nextID += 1
                    println("Product succesfully created")

                }
                2 -> {
                    for (x in inv.listProducts()) {
                        println(x.toString())
                    }
                }
                3 -> {
                    println("Product ID?")
                    val ID:Int = readln().toInt()
                    println("New price?")
                    val newPrice:Float = readln().toFloat()
                    println("New stock?")
                    val newStock:Int = readln().toInt()

                    inv.updateProduct(ID, newPrice, newStock)
                    println("Product succesfully updated")

                }
                4 -> {
                    exitProcess(1)

                }
                else -> println("This options doesn't exist")
            }
        } catch (e: Exception) {
            println("Error")
        }
    }
}
