package fundamentos

import java.util.*

fun souEsperto(x: Any) {
  if (x is String) {
    println(x.uppercase())
  } else if (x is Int) {
    println(x.plus(3))
  }
}
fun souEsperto2(x: Any) {
  when (x) {
    is String -> println(x.uppercase())
    is Int -> println(x.inc())
    else -> println("Repense sua vida") //else é o default mas deve ser o ultimo item
  }
}

fun main() {
  souEsperto("Ola")
  souEsperto(9)

  souEsperto2("Opa")
  souEsperto2(7)
  souEsperto2(listOf("ola"))
  souEsperto2(true)
}