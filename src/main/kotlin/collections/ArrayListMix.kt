package collections

fun main() {
  val listaMix = arrayListOf("Rafael", 1, true, 2.0, 't')

  for (n in listaMix) {
    if (n is String) { //Smartcast
      println(n.uppercase())
    } else {
      println(n)
    }
  }

  println("DIGITE UM NOME PARA TESTAR O WHEN: ")

  when (readlnOrNull() ?: "Katia") {
    "Yuri" -> println("Ele é o Yuri")
    "Katia" -> println("Ela é a Katia")
    else -> println("Default")
  }
}
