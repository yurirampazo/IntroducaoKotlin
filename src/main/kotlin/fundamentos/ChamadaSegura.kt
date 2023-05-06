package fundamentos
/**
*  ? precedido de um valor nulo representa que a variavel pode vir a assumir esse valor.
 *  (? == SafeCallOperator)
* */
fun main() {
    var a: Int? = null

    // Código abaixo não compila pois obriga a usar o safe call operator
//    println(a.dec())

    println(a?.dec())  //Não estoura NullPointer mas retorna null
}