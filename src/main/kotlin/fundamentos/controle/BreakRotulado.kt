package fundamentos.controle

fun main() {

  //Não é boa prática!
  externo@for (i in 1..10) {
    for (j in 1..10) {
      if (i == 2 && j == 9) break@externo
      println("i: $i, j: $j")
    }
  }
  println("FIM!")
}