package collections

fun main() {
  val pares = arrayListOf(2, 4, 6)
  val impares = intArrayOf(1, 3, 5)

  for (n in impares.union(pares).sorted()) {
    print("$n")
  }
}