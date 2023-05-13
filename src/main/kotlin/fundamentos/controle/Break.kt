package fundamentos.controle

fun main() {
  for (i in 0.. 10) {
    if (i ==5) {
      break
    }
    println("Atual: $i")
  }
  println("FIM")
}