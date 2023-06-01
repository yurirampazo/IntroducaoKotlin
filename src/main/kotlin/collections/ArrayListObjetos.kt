package collections

data class Fruta(var nome: String, var preco: Double)

fun main() {
  var frutas = arrayListOf(Fruta("Banana", 1.50), Fruta("Morango", 3.50))

  for (fruta in frutas) {
    println("${fruta.nome} - R$ ${fruta.preco}")
  }

  /**
   * Apesar de ser outra instância do objeto, por ser data class
   * o método equals está implementado, então o retorno será 'true'
   * */
  println(frutas.contains(Fruta("Banana", 1.50)))

  //O equals verifica igualdade entre os atributos, nesse caso o nome tem case diferente, deve retornar false
  println(frutas.contains(Fruta("banana", 1.50)))
  println("LAST: ${frutas.last()}")
  println("Distinct1: ${frutas.distinctBy { it.preco }}") //Imprime os dois pois tem preços distintos
  frutas[1].preco = 1.50
  println("Distinct2: ${frutas.distinctBy { it.preco }}") // Imprime somente objetos distintos pelo predicado passado
  //nesse caso só o primeiro com o preco 1.50
}