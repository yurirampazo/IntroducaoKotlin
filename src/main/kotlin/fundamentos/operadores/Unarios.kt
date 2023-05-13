package fundamentos.operadores

fun main() {
  var num1 = 1
  var num2 = 2

  //Operador pré fixado
  num1++
  println(num1)

  //Operador pós fixado
  --num1
  println(num1)

  //Incremento e decremento
  /**
   * Operador pré fixado tem precedencia à operação, nesse caso a comparação.
   * Já o operador de incremento pós fixado tem precedencia menor à operação,
   * nesse caso num2 foi decrementadodepois da comparação
   * Sendo assim, no momento que a comparação é feita ambos valem 2. E no final num1 vale 2 e num2 vale 1
   * */
  println(++num1 == num2--)
}