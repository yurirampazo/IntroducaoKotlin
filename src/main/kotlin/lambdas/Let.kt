package lambdas

fun main() {
//  val listWithNulls = listOf<String?>("A", null, "B", null, "C", null)
  val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)

  for (i in listWithNulls) {
    i?.let {
//      println(i)
      println(it)
    }
  }


}