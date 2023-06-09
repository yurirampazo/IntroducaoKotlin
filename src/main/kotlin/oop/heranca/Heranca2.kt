package oop.heranca

open class Animal(val nome: String)
class Cachorro: Animal {
  private val altura: Double

  //  constructor(nome: String, altura: Double) {
//    this.altura = altura
//    this.nome = nome  -> Erro pois a obrigatoriedade é chamar o construtor da classe pai para o val nome
//  }

  constructor(nome: String, altura: Double): super(nome) {
    this.altura = altura
  }
  constructor(nome: String) : this(nome, 0.0)

  override fun toString(): String {
    return "$nome tem $altura cm"
  }
}

fun main() {
  val dogAlemao = Cachorro("Spyke", 84.3)
  val yorkshire = Cachorro("Lucky")

  println(dogAlemao)
  println(yorkshire)
}