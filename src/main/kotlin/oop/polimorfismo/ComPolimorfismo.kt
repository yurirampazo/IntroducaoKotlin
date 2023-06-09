package oop.polimorfismo

import classes.Carro
import kotlin.math.roundToInt

open class Comida(val peso: Double)

class Feijao1(peso: Double) : Comida(peso)
class Arroz1(peso: Double) : Comida(peso)
class Ovo(peso: Double) : Comida(peso)

class Pessoa1(var peso: Double) {
  fun comer(comida: Comida) {
    peso += comida.peso
  }
}

fun main() {
  val feijao = Feijao1(0.3)
  val arroz = Arroz1(0.3)
  val ovo = Arroz1(0.3)
  val joao = Pessoa1(70.0)

  joao.comer(feijao)
  joao.comer(arroz)
  joao.comer(ovo)
  println(joao.peso.roundToInt())
}