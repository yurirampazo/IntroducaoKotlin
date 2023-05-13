package fundamentos

fun imprimirConceito(nota: Any) {
//  when (nota as Int) {
//  when (nota as? Int ?: 5) {
  when (nota as? Int) {
    10, 9 -> println("A")
    8, 7 -> println("B")
    6, 5 -> println("C")
    4, 3 -> println("D")
    2, 1 -> println("F")
    else -> println("Repense sua vida")
  }
}

fun main(args: Array<String>) {
  val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
  for (nota in notas) {
//imprimirConceito(nota) Gera erro de runtime classcastexception se não fizer cast seguro com safecall operator
    imprimirConceito(nota.toInt())
  }
}