package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main() {
  val alunos = arrayListOf(
    Aluno("Yuri", 7.4),
    Aluno("Igor", 8.0),
    Aluno("Fernando", 9.5),
    Aluno("Elaine", 3.9),
    Aluno("João", 5.0)
  )

//  val alunosAprovados = alunos.filter { it -> it.nota >= 7.0 } ;;
  val alunosAprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }
  val alunosAprovadosNotaAsc = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nota }
  val alunosAprovadosNotaDesc = alunos.filter { it.nota >= 7.0 }.sortedBy { -it.nota } // -it é desc
  val alunosReprovados = alunos.filterNot { alunosAprovados.contains(it) }.sortedBy { -it.nota }

  print("Alunos: ")
  alunos.sortedBy { it.nome }.forEach { print("${it.nome} ") }

  println("\nAlunos aprovados nome ASC: $alunosAprovados")
  println("Alunos reprovados NOTA DESC: $alunosReprovados")

  println("\nOrdenação aprovados nota ASC: $alunosAprovadosNotaAsc")
  println("Ordenação aprovados nota DESC: $alunosAprovadosNotaDesc")
}