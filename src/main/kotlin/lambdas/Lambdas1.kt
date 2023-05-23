package lambdas

/**
 * Assim como nas funções inline o último trecho
 * no bloco da função lambda será retornado como resultado
 * */
fun main() {
//  val soma = { x: Int, y: Int ->
//    x + y
//    1+3
//    "Texto"
//  }
  val soma = { x: Int, y: Int -> x + y }
  println(soma(4, 6))
}