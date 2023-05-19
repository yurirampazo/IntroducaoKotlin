package classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String) //nao é possível setar novo valor. val = constante
class Pessoa3(nomeInicial: String) {
  //só ficará disponível no processo de inicialização
  val nome: String = nomeInicial  // sem declarar que é val ou var só é possível passar o valor pelo construtor
}

fun main() {
   val p1 = Pessoa1(nome = "João")
  p1.nome = "Guilherme"
  println("${p1.nome} sabe programar")

  val p2 = Pessoa2("Yuri")
  println("${p2.nome} está aprendendo mais sobre Kotlin")

  val p3 = Pessoa3(nomeInicial = "Pedro")
  println("${p3.nome} é legal")
//  p3.nomeInicial  // Não ficará disponível pois não é um atributo de instância.

}