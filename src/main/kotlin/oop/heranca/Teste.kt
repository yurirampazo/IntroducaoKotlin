package oop.heranca

import collections.print

fun main(args: Array<String>) {
  val carro = Ferrari()
  carro.acelerar()
  println(carro)

  carro.ligarTurbo()
  carro.acelerar()
  println(carro)

  carro.frear()
  carro.frear()
  println(carro)
}