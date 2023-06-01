package classes

class Geladeira(val marca: String, val litros: Int) {
//  override fun equals(other: Any?): Boolean {
//    if (this === other) return true
//    if (javaClass != other?.javaClass) return false
//
//    other as Geladeira
//
//    if (marca != other.marca) return false
//    return litros == other.litros
//  }
//
//  override fun hashCode(): Int {
//    var result = marca.hashCode()
//    result = 31 * result + litros
//    return result
//  }
}

data class TV(val marca:String, val polegadas: Int)

fun main() {
  val g1 = Geladeira("Brastemp", 320)
  val g2 = Geladeira("Brastemp", 320)

  //Testar descomentando equals e hashcode da class Geladeira
  println(g1 == g2)
  println(g1.toString())

  /**
   * Funcionalidades já existentes no data class: equals(), hashCode(), copy()
   * */
  val tv1 = TV("Samsung", 32)
  val tv2 = TV("Samsung", 32)
  println(tv1 == tv2)
  println(tv1 === tv2)
  println(tv1.toString())

  /*
  * Método copy é bom para membros constantes, quando queremos criar uma instância a partir
  * de um objeto criado mas alterar seus valores na instanciação
  **/
  println(tv1.copy(polegadas = 42))

  //Destructing em data class somente
  val (marca, polegadas) = tv1
  println("$marca $polegadas")
}
