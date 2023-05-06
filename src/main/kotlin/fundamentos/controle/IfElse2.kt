package fundamentos.controle

fun main() {
  val num1 = 9
  val num2 = 3

  //Não existe ternario no kotlin mas podemos substitui-lo por if como expressão
//  val maiorValor = if (num1 > num2) num1 else num2
  val maiorValor = if (num1 > num2) {
    /*
    * Pode ocorrer processamneto dentro desses blocos
    * E o retorno atribuido será a variavel
    * ou uma constante ao final do bloco
    * */
    println("PROCESSANDO IF...")
    println("Aguarde por favor...")
    num1 // -> Valor de retorno
  } else {
    println("PROCESSANDO ELSE...")
//    1
    num2
  }

  println("O Maior valor é: $maiorValor.")
  println(num1.javaClass)
}