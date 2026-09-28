package Tasca2
val inv = Inventari()

fun main() {
    while (true) {
        println("1. Register product:" +
                "2. Show all products:" +
                "3. Update product stock and price:" +
                "4. Quit")
        var option: Int = readln().toInt()

        when (option) {
            1 -> {
                inv.registerProduct()

            }
            2 -> {
                for (x in inv.listProducts()) {
                    println(x.toString())
                }
            }
            3 -> {
                inv.updateProduct()

            }
            4 -> {
                System.exit(1)

            }
        }
    }
}
