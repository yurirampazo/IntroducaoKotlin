package lambdas

fun main() {
  val alunos = arrayListOf("Pedro", "Thiago", "Jonas")
  alunos.map  {it.uppercase()}.apply { println(this) } // this aqui referencia o resultado do map,
// nesse caso o novo array UPPERCASE


}