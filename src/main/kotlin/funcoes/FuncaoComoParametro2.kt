package funcoes

fun <E> filtrar(lista: List<E>, filtro:(E) -> Boolean): List<E> {
  val listaFiltrada = ArrayList<E>()
  for (e in lista) {
    if(filtro(e)) {
      listaFiltrada.add(e)
    }
  }
  return listaFiltrada
}

fun com3letras(nome:String): Boolean {
  return nome.length == 3
}

fun main(args: Array<String>) {
  val nomes = listOf("Ana", "Pedro", "Gui", "Rebbeca", "Bia")
  println(filtrar(nomes, ::com3letras))
}