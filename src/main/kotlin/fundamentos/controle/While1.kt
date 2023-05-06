package fundamentos.controle

fun main() {
  var opcao = 0

  while (opcao != -1) {
    val line = readLine() ?: "0"
    opcao = line.toIntOrNull() ?: 0
    println("Você escolheu a opção $opcao")
  }

  println("Até a próxima!")
}