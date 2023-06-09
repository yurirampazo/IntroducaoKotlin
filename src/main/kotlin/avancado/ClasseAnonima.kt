package avancado

interface Event {
  fun onSuccess()
}

class Programa {
  fun salvar(e: Event) {
    println("Abrindo Conexão...")
    println("Salvando Valores!!!")
    println("SUCESSO.")
    println("CONEXÃO FECHADA")
    e.onSuccess()
  }
}

//class Evento: Event {
//  override fun onSuccess() {
//    println("SOLUÇAO CRIANDO CLASSE")
//  }
//}

fun main() {
  val p = Programa()
//  val e = Evento()
//  p.salvar(e)
  p.salvar(object : Event {
    override fun onSuccess() {
      println("finalizou processamento!")
//      TODO("not yet implemented")
    }
  })
}