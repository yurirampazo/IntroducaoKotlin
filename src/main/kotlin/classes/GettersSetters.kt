package classes

class Cliente2 {
  constructor(nome: String) {
    this.nome = nome
  }

  /**A inicialização de uma classe não é procedural.
   * Primeiro são delcarados seus membros e depois atribuidos valores
   * */
  var nome: String
    get() = "Meu nome é ${field}"  //FIELD CONTÉM O VALOR PASSADO PARA O ATRIBUTO
    set(value) {
      field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
    }
}

fun main() {
  val c1 = Cliente2("")
  /**
   * Podemos verificar aqui que Getters e Setters são chamados implicitamente
   * com a notação ponto, por exemplo:
   * Um objeto c1 da Classe cliente, para acessar seu nome em Java faríamos:
   * c1.getNome()
   * O seu equivalente em kotlin é:
   * c1.nome()
   *
   * Só há necessidade de declarar Getters e Setters se formos reescrevê-los.
   * */
  println(c1.nome)

  val c2 = Cliente2("Yuri")
  c2.nome = "Celso"
  println(c2.nome)
}