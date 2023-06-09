package oop.heranca

interface Esporitvo {
//  var turbo0: Boolean = false -> Erro de compilação a classe que implementa que define os valores
  var turbo: Boolean
  fun ligarTurbo() {
    turbo = true
  }

  fun desligarTurbo() {
    turbo = false
  }

}