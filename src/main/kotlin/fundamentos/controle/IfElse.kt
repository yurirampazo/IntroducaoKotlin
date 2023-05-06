package fundamentos.controle

fun main() {
  val nota = 8.3

  if (nota >= 7.0) println("APROVADO") else println("REPROVADO")
  println(if (nota >= 7.0) "APROVADO" else "REPROVADO")
}