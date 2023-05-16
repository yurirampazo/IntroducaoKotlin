package funcoes

/**
 * Parâmetros em Kotlin são imutáveis
 * */
fun incremento(num: Int): Int {
//  return num++ //Val cannot be reassigned -> Reatribuindo valor para constante

  //Solução de contorno
  var num2 = num
  num2++
  return num2
}

fun main() {
  println(incremento(3))
}