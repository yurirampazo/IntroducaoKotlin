package fundamentos

fun soma(a: Int, b: Int = 1): Int {
    return a + b
}
fun somaDouble(a: Double, b: Double = 1.0): Double {
    return a + b
}

fun retornaDoubleComSomaInt(a: Double, b: Int = 1): Double {
    return a + b
}

fun retornaIntComSomaDouble(a: Double = 2.5, b: Double): Int {
    return a.toInt() + b.toInt()
}

fun main() {
    val num1 = 2
    val num2 = 3
    val soma1 = soma(num1, num2)
    val soma2 = soma(2)  //Utilizando um valor default para B, olhar linha 3

    println("Soma de inteiros!")
    println(String.format("Soma %d + %d = %d", num1, num2, soma1))
    println(String.format("Soma %d + 1 = %d", num1, soma2))

    println("Soma de Double!")
    val num3 = num1.toDouble()
    val num4= 3.55
    val soma3 = somaDouble(num3, num4)
    val soma4 = somaDouble(num3)
    println(String.format("Soma %.2f + %.2f = %.1f", num3, num4, soma3))
    println(String.format("Soma %.2f + 1.0 = %.2f", num3, soma4))
    println(retornaDoubleComSomaInt(2.55, 3))
    println(retornaIntComSomaDouble(2.5, 3.6))
}
