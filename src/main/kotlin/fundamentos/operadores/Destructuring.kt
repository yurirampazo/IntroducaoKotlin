package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)
/**
 * Destructing extrai atributos ou intens de lista
 * e os coloca em variaveis ou constantes.
 * */
fun main(args: Array<String>) {
  val (marca, modelo) = Carro("Ford", "Fusion")
  println("$marca $modelo")

  val(marido, mulher) = listOf("João", "Maria")
  println("$marido e $mulher")

  val(_,_,terceiroLugar) = listOf("Hamilton", "Wettel", "Verstapen")
  println("O terceiro colocado foi $terceiroLugar")
}