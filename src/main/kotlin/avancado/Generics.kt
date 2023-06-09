package avancado

class Caixa <T>(val objeto: T) {
  private val objetos = arrayListOf<T>()

  init {
    adicionar(objeto)
  }

  fun adicionar(novoObjeto: T) {
    objetos.add(novoObjeto)
  }

  override fun toString(): String {
    return objetos.toString()
  }
}

fun main() {
  val materialEscolar = Caixa("Caneta")
  materialEscolar.adicionar("Lapis")
  materialEscolar.adicionar("Borracha")
  println(materialEscolar)

//  val material2 = Caixa<Int>(3) -> Nao precisa explicitar, o kotlin infere
  val material2 = Caixa(3)
  material2.adicionar(5)
//  material2.adicionar("2") -> por estar inferida lista de int adicionar string gera erro type mismatch
  println(material2)
}