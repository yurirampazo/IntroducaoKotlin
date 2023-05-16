package funcoes

import kotlin.math.pow

fun potencia(base: Int = 2, expoente:Int = 2): Int {
//  return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
  return base.toDouble().pow(expoente.toDouble()).toInt()
}

fun main(args: Array<String>) {
  println("Potencia ${potencia(2, 3)}")
  println("Potencia ${potencia(expoente = 3, base = 3)}")
  println("Potencia ${potencia(10)}")
  println("Potencia ${potencia(base = 10)}")
  println("Potencia ${potencia(expoente = 8)}")
}