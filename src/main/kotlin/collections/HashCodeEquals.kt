package collections

class Objeto(val nome: String, val descricao: String) {
//  override fun hashCode(): Int {
//    return nome.length
//  }

  override fun hashCode() = nome.length


  override fun equals(other: Any?) = if (other is Objeto) {
    nome.equals(other.nome, ignoreCase = true)
  } else {
    false
  }
}

fun main() {
//  val list = arrayListOf("yue", 1, 'a', 3.14, true)
//
//  for (i in list) {
//    if (i !is String) {
//      println("$i is not a string")
//    } else {
//      println("$i is a string")
//    }
//  }
  val conjunto = hashSetOf(
    Objeto("Cadeira", "..."), //HashCode = 7
    Objeto("Mesa", "..."), //HashCode = 4
    Objeto("Faca", "..."), //HashCode = 4
    Objeto("Copo", "...")
  ) //HashCode = 4


  conjunto.contains(Objeto("faca", "???")).print()
}