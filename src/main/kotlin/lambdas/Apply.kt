package lambdas

import funcoes.calc
import fundamentos.operadores.obterResultado

class Calculadora2 {
  var resultado = 0

  fun soma(a: Int, b: Int) {
    resultado += a + b
  }
  fun adicionar(a: Int) {
    resultado += a
  }
}

fun main() {
  val calculadora = Calculadora2()

  calculadora.apply { soma(4,5) }.apply { adicionar(6) }.apply { println(resultado) }

  calculadora.resultado = 0
  calculadora.apply {
    soma(4,5)
    adicionar(6)
    println(resultado)
  }

//  inline function
  with(calculadora) {
    resultado = 0
    soma(4,5)
    adicionar(6)
    println(resultado)
  }
}