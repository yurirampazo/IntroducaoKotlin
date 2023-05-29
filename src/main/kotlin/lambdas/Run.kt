package lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main() {
  var casa = Casa()
  casa.run {
    endereco = "Rua Abc"
    num = 2
  }
  println(casa)
}