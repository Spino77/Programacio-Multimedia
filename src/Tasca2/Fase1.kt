package Tasca2

fun main() {
    NullControl("hola")
    NullControl(null)
    print("Final price is: " + SaleCalc(70f, 7f))
}

fun NullControl(text : String?) {
    println(text?: "The variable is null")
}

fun SaleCalc(price : Float, sale : Float): Float = price - (price * (sale / 100))
