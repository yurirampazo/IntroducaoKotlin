package classes

/**
 *  Construtor 'padrão', segue o mesmo princípio do construtor de Java
 *  com algumas particularidades de sintaxe
 * */

class Filme {
  val nome: String
  val dataLancamento: Int
  val genero: String

  constructor(nome:String, anoLancamento: Int, genero: String) {
    this.nome = nome
    dataLancamento = anoLancamento
    this.genero = genero
  }
}

fun main() {
  val filme = Filme("O Poderoso Chefão", 1972, "Drama")
  println("O ${filme.genero}: ${filme.nome} foi lançado em ${filme.dataLancamento}")
}
