package collections

fun main() {
  val numeros = Array<Int>(size = 10) {i -> i * 10} // Inicializando o array a partir dos numeros de indice com lambda
  numeros.forEach { println(it) }

  println(numeros.get(1))
  println(numeros[1])

//  numeros.set(10, 123) // Dá erro pois não é possível acrescentar itens em Array
  println(numeros.size)

  numeros.set(1, 123)
  println(numeros[1])

  numeros[1] = 2345
  println(numeros[1])
}