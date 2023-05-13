package fundamentos.controle

fun main() {
  var opcao = -1

  do {
    val line = readlnOrNull() ?: "0"
    opcao = line.toIntOrNull() ?: 0
    println("Você escolheu a opcao $opcao")

  } while (opcao != -1)
  println("Até a proxima!")
}