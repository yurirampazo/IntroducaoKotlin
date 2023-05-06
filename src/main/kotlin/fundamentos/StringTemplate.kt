package fundamentos

import java.lang.ArithmeticException
import java.lang.IllegalArgumentException
import java.util.Scanner


val sc = Scanner(System.`in`)
fun main() {
  for (i in 0 .. 100) {
    println()
  }
  println("Digite um comentario para ser impresso: ")
  val comentario = sc.nextLine()
  imprimirComentario(comentario)

}

fun imprimirComentario(comentario: String) {
  println("Aqui está seu comentario $comentario")
  println("Ok, agora digite o valor do raio de uma circunferência para encontrar sua área: ")
  val raio = sc.nextDouble()
  println(String.format("A área da circunferência é de: %.1f", calcularArea(raio)))
}

fun calcularArea(raio :Double): Double {
  try {
    return (Math.PI).times(Math.pow(raio, 2.0))
  } catch (e: ArithmeticException) {
    throw IllegalArgumentException("Não foi possível concluir sua operação!")
  }
}