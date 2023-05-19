package funcoes

class Operacao {
  fun somar(a: Int, b: Int): Int = a + b
}

fun somar(a: Int, b: Int): Int {
  return a + b
}

fun calc(a: Int, b: Int, funcao:(Int, Int) -> Int): Int {
  return funcao(a,b)
}

fun main() {
  println(calc(2,1, Operacao()::somar)) // :: Sintaxe para passar referencia de uma função em Kotlin
  println(calc(2,1, ::somar))
}