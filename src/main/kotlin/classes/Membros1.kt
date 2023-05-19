package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
  fun formatar(): String {
    return "$dia/$mes/$ano"
  }
}

fun main() {
  val data = Data(18,5,2023)
  println("${data.dia}/${data.mes}/${data.ano}")
  with(data) { println("$dia/$mes/$ano") }

  data.mes = 11
  println(data.formatar())
}