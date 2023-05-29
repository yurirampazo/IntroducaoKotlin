package lambdas

fun main() {
  println("Digite uma frase: ")
  val entrada = readlnOrNull()

  //Take if pega o valor e atribui se sua condição for atendida
  val mensagem = entrada.takeIf { !it.isNullOrBlank() } ?: "Entrada foi nula"

  println(mensagem)
}