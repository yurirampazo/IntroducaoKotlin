package collections

fun main() {
  val strings = arrayListOf("Carro", "Moto", "Barco", "Aviao")

  for (item in strings) {
    println(item.uppercase())
  }
}