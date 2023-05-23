package lambdas

/**
 * Soma por padrao e passagem de terceiro parâmetro opcional
 * Se passado o terceiro parâmetro realizar nova operação aritmética
 * */
//Descomentar para testar resultado 2
//interface Operacao {
//  fun executar(a: Int, b: Int): Int
//}
/**
 * Sintaxe para implements em Kotlin  ":"
 * */
//Descomentar para testar resultado 2
//class Multiplicacao: Operacao {
//  override fun executar(a: Int, b: Int): Int = a * b
//}

class Calculadora {
  fun calcular(a: Int, b: Int): Int = a + b
//Descomentar para testar resultado 2
//  fun calcular(a: Int, b: Int, operacao: Operacao): Int {
//    return operacao.executar(a, b)
//  }

  //Especificando apenas que recemos uma função que
  // ainda não foi definida como parâmetro
  fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(a,b)
  }
}

fun main() {
  val calculadora = Calculadora()
  val resultado1 = calculadora.calcular(3, 4)
//Descomentar para testar resultado 2
//  val resultado2 = calculadora.calcular(3, 4, Multiplicacao())

  println("Resultado 1: ${resultado1}")
//Descomentar para testar resultado 2
//  println("Resultado 2: ${resultado2}")

  //Definindo a função em uma linha
  val subtracao = { a: Int, b: Int -> a - b }
  // Passando a função definida como parâmetro
  val resultado3 = calculadora.calcular(3, 4, subtracao)
  println("Resultado 3: ${resultado3}")
}

