package fundamentos.operadores

//RETURN implícito
fun obterResultado(nota: Double): String = if (nota >= 7.0) "Passou" else "Reprovou"
fun obterResultado2(nota: Double): String {
  return if (nota >= 7.0) "Passou" else "Reprovou"
}


fun main() {
  val nota = 8.0
  println(obterResultado(nota))
  println(obterResultado2(nota))
}