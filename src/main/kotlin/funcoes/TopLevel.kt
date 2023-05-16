package funcoes

//fun min (a: Int, b: Int): Int {
//  return if(a < b) a else b
//}

/**
 * TopLevel Function são funções fora de classes
 * */
fun min (a: Int, b: Int): Int = if(a < b) a else b

fun main(args: Array<String>) {
  println("O menor valor é ${min(3, 4)}")
}
