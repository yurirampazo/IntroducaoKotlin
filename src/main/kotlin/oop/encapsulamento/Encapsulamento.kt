package oop.encapsulamento

private val dentroDoArquivo = 1
//protected val protegidoNaoSuportadoAqui = 1
/**
 * internal não estará disponível ao importar o jar desse modulo ou projeto em outro projeto.
 * */
internal var dentroDoProjeto = 1
/*public*/ var um = 1

private fun dentroDoArquivo() = 1
//protected fun protegidoNaoSuportadoAqui() = 1
internal fun dentroDoProjeto() = 1
/*public*/ fun um() = 1

/**
 * OPEN permite herança, por padrão não é habilitada herança como no Java. Oposto do final em Java
 * */
open class Capsula {
  private val dentroDoObjeto = 1
  protected val acessadoPorHeranca = 1
  internal val dentroDoProjeto = 1
  val publico = 1

  private fun dentroDoObjeto() = 1
  protected fun acessadoPorHeranca() = 1
  internal fun dentroDoProjeto() = 1
  fun publico() = 1
}

class CapsulaFilha: Capsula() {
  fun verificarAcesso() {
//    println(Capsula().dentroDoObjeto)  -> Dá erro private
//    println(Capsula().acessadoPorHeranca) -> Erro, não precisa acessar da classe pai, pega por herança da classe filha
    println(acessadoPorHeranca)
    println(dentroDoProjeto)
  }
}

fun verificarAcesso() {
//  println(Capsula().dentroDoObjeto())
//  println(Capsula().acessadoPorHeranca())
  println(Capsula().dentroDoProjeto())
  println(Capsula().publico())
}

