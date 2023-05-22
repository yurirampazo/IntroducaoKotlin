package classes

/**
 *  Construtor 'padrão em Kotlin, o mais utilizado na maioria dos exemplos
 *  onde os membros (atributos) já são declarados no construtor
 * */

class Filme2(val nome:String, val anoLancamento: Int, val genero: String)

fun main() {
  val filme = Filme2("Monstros S.A", 2001, "Comédia")
  println("O ${filme.genero}: ${filme.nome} foi lançado em ${filme.anoLancamento}")
}
