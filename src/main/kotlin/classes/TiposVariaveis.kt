package classes

val diretamenteNoArquivo = "Bom dia"

fun topLevel() {
  val local = "Fulano"
  println("$diretamenteNoArquivo $local")
}

/**
 * Em Kotlin tudo que for compilado como topLevel (MÉTODOS E VARIÁVEIS)
 * é interpretado como estático, nesse caso não há necessidade, à princípio
 * do companion object diretamente declarado
 * */
class Coisa {
  var variavelDeInstancia: String = "Boa noite"

  companion object {
    /**
     * Anotation @JvmStatic utilizada para quando houver conversão do código para bytecode e eventual
     * compilação em Java, o membro a seguir seja delcarado como estático também.
     * Do contrário o companion object funciona como um objeto associado (uma espécie de singleton)
     * à própria classe em que foi declarado
     * Caso fosse tentar acessá-lo deveria navegar através de classeAtual.objetoSingleton
     * */
    @JvmStatic val constanteDeClasse = "Ciclano"
  }

  fun fazer() {
    val local: Int = 7
    if (local > 3) {
      val variavelDeBloco = "Beltrano"
      println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco")
    }
  }
}

fun main() {
  topLevel()
  Coisa().fazer()
  println(Coisa.constanteDeClasse)
}