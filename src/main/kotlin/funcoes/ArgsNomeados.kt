package funcoes

fun relacaoDETrabalho(chefe: String, funcionario: String): String {
  return "$funcionario é subordinado(a) à $chefe."
}

fun main(args: Array<String>) {
  println(relacaoDETrabalho("João", "Maria"))
  println(relacaoDETrabalho(funcionario = "João", chefe = "Maria"))
}
