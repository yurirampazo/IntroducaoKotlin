package fundamentos.controle

import java.util.*

fun main() {
  val sc = Scanner(System.`in`)
  var nota: Double
  try {
    do {
      println("Digite uma nota de 0.0 a 10.0: ")
      nota = sc.nextDouble()
    } while (nota !in 0.0 .. 10.0)

    //Usando operador range ..
    if (nota in 9.0..10.0) println("Fantastico")
    else if (nota in 7.0..8.0) println("Otimo")
    else if (nota in 4.0..6.0) println("Tem como recuperar")
    else if (nota in 0.0..3.0) println("Te vejo no proximo semestre")
    else println("Nota invalida")
  } catch (e: InputMismatchException) {
    println("Valor digitado inválido. Tente novamente mais tarde!")
  }
}
