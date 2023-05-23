package classes

//Erro!! Kotlin: Val cannot be reassigned
//fun porReferencia(velocidade: Int) {
//  velocidade++
//}

data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0)

/**
 * Passagens de parâmetros são por referência e portanto eles são constantes.
 * */
fun porReferencia(carro: Carro) {
  carro.velocidade++
}

fun main() {
  var carro1 = Carro("Ford", "Fusion")

  var carro2 = carro1
  carro2.modelo = "Edge"
  println(carro1)

  carro1 = Carro("Audi", "A5")

  porReferencia(carro1)
  porReferencia(carro2)

  println(carro1)
  println(carro2)


  //Nem sempre isso é verdade, exemplo com tipos básicos:
  var a = 1
  var b = a

  println(a === b)
  b++ //Mudando referencia de B
  println(a === b)
  println(a)
  println(b)

  a++
  println(a === b)
  a++
  println(a === b)
}