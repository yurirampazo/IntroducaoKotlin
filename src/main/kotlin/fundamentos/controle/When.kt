package fundamentos.controle

import java.util.*

fun main() {
  val sc = Scanner(System.`in`).useLocale(Locale.US)
  val nota: Int
  try {
      println("Digite uma nota de 0 a 10: ")
      nota = sc.nextInt()
    //Usando operador when -> switch do kotlin
    when (nota) {
      10, 9 -> println("Fantástico")
      8, 7 -> println("Parabéns")
      6, 5, 4 -> println("Tem como recuperar")
      in 0..3 -> println("Te vejo no próximo semestre")
      else -> println("Nota Inválida")
    }

  } catch (e: InputMismatchException) {
    println("Valor digitado inválido. Tente novamente mais tarde!")
  }
}
