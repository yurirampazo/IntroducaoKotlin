package classes

enum class DiasSemana2(val id: Int, val nome: String, val util: Boolean) {
  DOMINGO(1, "Domingo", false),
  SEGUNDA(2, "Segunda", true),
  TERCA(3, "Terca", true),
  QUARTA(4, "Quarta", true),
  QUINTA(5, "Quinta", true),
  SEXTA(6, "Sexta", true),
  SABADO(7, "Sabado", false)
}

fun main() {
  for (dia in DiasSemana2.values()) {
    println("${dia.nome} é um dia ${if (dia.util) "útil" else "do fim de semana"}")
  }
}