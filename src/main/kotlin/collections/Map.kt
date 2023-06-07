package collections

fun main() {
  var map = HashMap<Long, String>()

  map.put(10020030040, "João")
  map[30040050060] = "Maria"
  map[60070080090] = "Yuri"

  map[60070080090] = "Yuri Rampazo"

//  map.print()
//  for (par in map.entries) { // se não colocar entries ele por padrão printa a entry iterada.
  for (par in map) {
    println(par)
  }

  for (nome in map.values) {
    println(nome)
  }

  for (doc in map.keys) {
    println(doc)
  }

  for ((doc, nome) in map) {
    println("$nome CPF: $doc")
  }

  /**
   * No caso de remove ou get pode retornar nulo, por isso usamos null safe operator.
   * */
  map.size.print()
  map.get(30040050060)?.print()
  map[30040050060]?.print()
  map.contains(30040050060).print()
  map.remove(30040050060)?.print() // retorna o value removido
  map.clear()
  map.isEmpty().print()
}
