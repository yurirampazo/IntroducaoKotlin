package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
  Produto("Fichario", 21.90),
  Produto("Lápis de Cor", 15.70),
  Produto("Caderno", 25.90),
  Produto("Borracha", 3.90),
  Produto("Caneta", 1.90)
)

fun main() {
  val totalizar = {total: Double, atual: Double -> total + atual}
  val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar).apply { println(this) }

  print("O preço total é R$ $precoTotal, e o preço médio é R$ ${precoTotal/ materialEscolar.size}")


}