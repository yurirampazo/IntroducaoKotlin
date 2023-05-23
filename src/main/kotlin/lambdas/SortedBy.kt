package lambdas

fun main() {
  val nomes = arrayListOf("Elaine", "Yuri", "Jessica", "Bruno", "Heitor", "Jana")
  val ordenados = nomes.sortedBy { it } // Melhor opcão
  val ordenados2 = nomes.sortedBy({ it })

  println(ordenados)
  println(ordenados2)

  val reverseSort = ordenados.sortedBy { it.reversed() } //Resultado esperado: [Yuri, Jessica, Jana, Heitor, Elaine, Bruno]
  //Resultado obtido: [Jessica, Jana, Elaine, Yuri, Bruno, Heitor]


  //Obteve resultado esperado
  val reverseSort2 = ordenados2.reversed()

  println(reverseSort)
  println(reverseSort2)
}