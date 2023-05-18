package funcoes

/**
 * varargs (Em Java ...) é a representação de um dado que pode ter tamanhos variados. Exemplo lista poderia vir vazia
 * */
fun ordenar(vararg numeros: Int) : IntArray {
  return numeros.sortedArray()
}
fun main(args: Array<String>) {
  println("Ordenação 1")
  for (n in ordenar(38, 3, 2,45,17,9,300)) {
    print("$n ")
  }
}