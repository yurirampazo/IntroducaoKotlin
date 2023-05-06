package fundamentos

import fundamentos.pacote1.simplesFuncao as simpleFunction
import fundamentos.pacote1.Coisa
import fundamentos.pacote1.FaceMoeda.CARA as HEADS
import fundamentos.pacote2.*

fun main() {
  kotlin.io.println(simpleFunction("OK"))

  val coisa = Coisa("Bola")

  println(coisa.nome)

  println(HEADS)

  println("${soma(3.0, 3.0)}\n ${subtracao(9.0, 6.0)}")
}
