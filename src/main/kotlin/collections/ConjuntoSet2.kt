package collections

fun main() {
  val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")

  println("SEM ORDEM...")
  for (aprovado in  aprovados) {
    aprovado.print()
  }

  val aprovadosOrdenados = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
  println("\nLinked SET...")
  for (aprovado in aprovadosOrdenados) {
    aprovado.print()
  }

  val aprovadosOrdenados2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
  println("\nSORTED SET...")
  for (i in aprovadosOrdenados2) {
    i.print()
  }

  //ORDEM DEFINIDA POR CRITÉRIO XPTO
  aprovados.sortedBy { it.substring(1) }.print()
  aprovados.sortedBy { it.substring(1).reversed() }.print()
}