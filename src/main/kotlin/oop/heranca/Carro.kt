package oop.heranca

open class Carro(val velocidadeMax: Int = 200, var velocidadeAtual: Int = 0) {
  protected fun alterarVelocidadeEm(velocidade: Int) {
    val novaVelocidade = velocidadeAtual + velocidade
    velocidadeAtual = when (novaVelocidade) {
      in 0..velocidadeMax -> novaVelocidade
      in velocidadeMax + 1..Int.MAX_VALUE -> velocidadeMax
      else -> 0
    }
  }
  open fun acelerar() {
    alterarVelocidadeEm(5)
  }

  open fun frear() {
    alterarVelocidadeEm(-5)
  }

  override fun toString(): String {
    return "A velocidade atual é: $velocidadeAtual Km/h"
  }
}