package collections

fun Any.print() = println(this)

fun main() {
  val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)

//  conjunto.get(0)

  conjunto.add(3).print() //false pois não aceita repetição
  conjunto.add(10).print()

  conjunto.size.print()
  conjunto.remove("a").print()
  conjunto.remove('a').print()

  conjunto.contains('a').print()
  conjunto.contains("Texto").print()

  val nums = setOf(1, 2, 3) // SOMENTE LEITURA
//  nums.add()

//  conjunto.union(nums)
  (conjunto + nums).print()
  (conjunto - nums).print()

  conjunto.intersect(nums).print() // não altera o conjunto e gera um terceiro conjunto
  conjunto.retainAll(nums)  //Altera a referencia do conjunto
  conjunto.print()

  conjunto.clear()
  conjunto.isEmpty().print()

}