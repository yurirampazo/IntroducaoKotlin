package classes

class Calculadora {
  private var resultado: Int = 0

  fun somar(vararg valores: Int): Calculadora {
    valores.forEach { resultado += it }
    return this
  }

  fun multiplicar(valor: Int): Calculadora {
    resultado *= valor
    return this
  }

  fun limpar(): Calculadora {
    resultado = 0
    return this
  }

  fun print(): Calculadora {
    println(resultado)
    return this
  }

  fun obterResultado(): Int {
    return resultado
  }
}

fun main() {
  val calculadora = Calculadora()
  calculadora.somar(1, 2, 3).multiplicar(6).print()
  calculadora.somar(10,7).print()
  calculadora.limpar().print()
  println(calculadora.obterResultado().inc())
}