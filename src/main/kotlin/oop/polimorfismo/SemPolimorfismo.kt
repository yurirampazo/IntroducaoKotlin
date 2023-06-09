package oop.polimorfismo

import classes.Carro

//Carro -> Civic, Ferrari, Fiesta

class Feijao(val peso: Double)
class Arroz(val peso: Double)
class Pessoa(var peso: Double) {
  fun comer(feijao: Feijao) {
    this.peso += feijao.peso
  }

  fun comer(arroz: Arroz) {
    this.peso += arroz.peso
  }
}

fun main() {
  val feijao = Feijao(0.3)
  val arroz = Arroz(0.3)
  val joao = Pessoa(70.0)

  joao.comer(feijao)
  joao.comer(arroz)
  println(joao.peso)
}