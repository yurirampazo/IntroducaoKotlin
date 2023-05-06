package fundamentos.controle

import java.util.*

fun main() {
  val sc = Scanner(System.`in`).useLocale(Locale.US)
  var nota: Double
  try {
    do {
      println("Digite uma nota de 0.0 a 10.0: ")
      nota = sc.nextDouble()
    } while (nota !in 0.0 .. 10.0)

    //Usando operador range ..
    if (nota in 9.0..10.0) println("Fantastico")
    else if (nota in 7.0..8.9) println("Otimo")
    else if (nota in 4.0..6.9) println("Tem como recuperar")
    else if (nota in 0.0..3.9) println("Te vejo no proximo semestre")
    else println("Nota invalida")
  } catch (e: InputMismatchException) {
    println("Valor digitado inválido. Tente novamente mais tarde!")
  }
  //OBS range deve ser colocado sempre do menor para o maior
  println(5 in 7..4) // Deveria imprimir true mas não imprime. O range avalia numero entre um range crescente
  println(5 in 4..7) // Forma correta de utilizar o range
}
