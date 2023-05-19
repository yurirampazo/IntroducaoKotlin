package funcoes
inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
  println("Entrando no método $nomeFuncao")
  try {
    return funcao()
  } finally {
    println("Método $nomeFuncao, finalizado!")
  }
}

fun somar2(a: Int, b: Int): Int {
  return a + b
}
fun main(args: Array<String>) {
//  funcao inline tem um return em sua ultima sentença.
//  Não em uma outra funcao dentro dela, a menos que essa seja a ultima.
  val resultado = executarComLog("somar") {
    somar2(4, 5)
//    "Teste"  //Retornaria "Teste"
  }
  println(resultado)
}