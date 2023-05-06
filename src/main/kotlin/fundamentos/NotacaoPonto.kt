package fundamentos

fun main()  {
    val a: Int = 33.dec()
    var b: String = a.toString()

    println("Int: $a")
//    println("Int: ${a}") redundante
    println("Primeiro char da string b é: ${b.first()}")
    println("Primeiro char da string b é: $b.first()") //Não reconhece quando tenta acessar algo dentro da variavel
//    a = 31  val cannot be reassigned
    b = "Yuri"
}
