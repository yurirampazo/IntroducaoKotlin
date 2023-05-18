package funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto) : Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
  val p1 = Produto("Ipad", 2000.0)
  val p3 = Produto(preco = 2.50, nome = "Borracha")

  println("${p1.nome} é mais caro que ${p3.nome}? ${p1.maisCaroQue(p3)}")
  println(p1 maisCaroQue p3) // infix = entre
}