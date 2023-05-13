package fundamentos.operadores

fun main() {
  val (a, b, c, d) = listOf(3, 5, 1, 15)

  val soma = a + b + c + d
  val subtracao = d - b
  val multiplicacao = b * d
  val divisao = d / a
  val modulo = a % 2

  println("Soma: $soma")
  println("Subtraçao: $subtracao")
  println("Multiplicaçao: $multiplicacao")
  println("Divisao: $divisao")
  println("Modulo: $modulo")

}