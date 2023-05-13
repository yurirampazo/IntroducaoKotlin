package fundamentos

fun main() {
  val a = 1

  println(a + 1)
  println(a.toString() + 1)

  //String pra número
  println("3.6".toDouble() + 2)
  println("Teste".toIntOrNull() ?: 0)
  println("Teste".toIntOrNull() ?: +  3)

}