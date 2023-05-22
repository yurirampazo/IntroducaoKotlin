package classes

/**
 *  Construtor 'padrão', segue o mesmo princípio do construtor de Java
 *  com algumas particularidades de sintaxe
 * */

class Filme3(nome: String, anoLancamento: Int, genero: String) {
  val nome: String
  val anoLancamento: Int
  val genero: String

  /**
   * Bloco Init funciona como um construtor porém aqui as 'variáveis'
   * são declaradas em inicialização e os valores são imutáveis
   * */
  init {
    this.nome = nome
    this.anoLancamento = anoLancamento
    this.genero = genero
  }
}

fun main() {
  val filme = Filme3("Os Incríveis", 2004, "Ação")
  println("O ${filme.genero}: ${filme.nome} foi lançado em ${filme.anoLancamento}")
}
