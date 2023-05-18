package funcoes


//fun <E> List<E>.secondOrNull() : E?  = if (this.size >=2) this.get(1) else null
fun <E> List<E>.secondOrNull() : E?  = if (this.size >=2) this[1] else null

fun main() {
  val list = listOf("João", "Maria", "Walda")
  val list2 = listOf("Yuri")
  println(list.secondOrNull())
  println(list2.secondOrNull())
}
