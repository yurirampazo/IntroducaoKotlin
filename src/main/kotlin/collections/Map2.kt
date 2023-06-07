package collections

fun main() {
  var map = hashMapOf(1 to "Ana",
                      2 to "Bruno",
                      3 to "Yuri")

  for ((key, value) in map) {
    println("$key - $value")
  }
}
