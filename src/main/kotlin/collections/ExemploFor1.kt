package collections

fun main() {
  val alunos = arrayListOf("Amanda", "André", "Bernardo", "Carlos")

  for ( aluno in alunos) {
    println(aluno)
  }

  //Percorrer arrays pelo indice e pelo valor
  for ((indice, aluno) in alunos.withIndex()) {
    println("${indice + 1} - $aluno")
  }

  alunos.forEach { println(it) }

}