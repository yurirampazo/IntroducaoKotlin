package fundamentos.operadores

import java.util.Date

fun main() {
  println("Banana" === "Banana")
  println(3 != 2)
  println(3 < 2)
  println(3 > 2)
  println(3 <= 2)
  println(3 >= 2)

  val d1 = Date(0) // Inicio de 1/1/1970 -> Tempo em milisegundos
  val d2 = Date(0)

  //Igualdade Referencial -> Aponta para o mesmo objeto?
  println("Resultado com \"===\" ${d1 === d2}")

  //Igualdade Estrutural -> Conteúdo dos objetos é igual?  == equals
  println("Resultado com \"==\" ${d1 == d2}")
//  println("Resultado com \"==\" ${d1.equals(d2)}")


}