package fundamentos

fun main() {
  val bomHumor = true
  println("Hoje estou ${if (bomHumor) "FELIZ :D" else "chateado"}")
  println("Hoje estou ${if (bomHumor) "XFELIZ :D".substring(1) else "chateado"}")
}