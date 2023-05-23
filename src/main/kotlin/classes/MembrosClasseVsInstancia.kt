package classes

/**
 * Para membros estáticos é preferível usar o recurso topLevel ao invés da anotation
 * @JvmStatic
 * */

var desconto: Double = 0.0
class ItemDePedido(val nome: String, val preco: Double) {
  companion object {
    fun create(nome: String, preco: Double) = ItemDePedido(nome, preco)
//    @JvmStatic var desconto: Double = 0.0
  }

  fun precoComDesconto(): Double {
    return preco - preco * desconto
  }
}
fun main() {
  val item1 = ItemDePedido.create("TV 50 Polegadas", 2989.90)
  val item2 = ItemDePedido("Liquidificador", 200.00)
//Usando @JvmStatic
//  ItemDePedido.desconto = 0.10

// Usando variavel topLevel
  desconto = 0.10

  println(item1.precoComDesconto())
  println(item2.precoComDesconto())
}