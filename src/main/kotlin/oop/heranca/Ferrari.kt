package oop.heranca

// implements em Kotlin é denotado pela vírgula
class Ferrari() : Carro(velocidadeMax = 350), Esporitvo {
  override var turbo: Boolean = false
    get() = field
    set(value) { field = value}

  override fun acelerar() {
    super.alterarVelocidadeEm(if (turbo) 50 else 25)
  }

  override fun frear() {
    alterarVelocidadeEm(-25)
  }
}