package fundamentos

/**
 * is == instanceof
 * */
fun main() {
  val valor = "abc"
  val valor2: Any = 123

  if (valor is String) println(valor) else println("$valor Not a String")

  if (valor2 !is String) println("$valor2 is not a string") else println("is String")
}