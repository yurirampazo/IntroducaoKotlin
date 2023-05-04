package fundamentos

fun main(args: Array<String>) {
    //Tipos Numéricos Inteiros
    val num1: Byte = 127  // Byte.MAX_VALUE
    val num2: Short = Short.MIN_VALUE  // -32768
    println("SHORT MIN VALUE: " + num2)
    val num3: Int = 2_147_483_647  // -> Limite positivo de Int
    val num4: Int = -2_147_483_648  // -> Int.MIN_VALUE
    val num5: Long = 9_223_372_036_854_775_807 // -> Long.MAX_VALUE
    val num6 = Long.MAX_VALUE
//    if (num5 == num6) {
//        println("Limites são iguais")
//    }

//    val num7: Float = 3.14 //The floating-point literal does not conform to the expected type Float
    val num7: Float = 3.14F
    val num8: Double = 3.14

    //Tipo Caractere
    val char: Char = '?'  // Outros exemplos... '1', 'g', ' '

    //Tipo Booleano
    val boolean: Boolean = true

    println(listOf(num1, num2, num3, num6, num7, num8, char, boolean))
    println(2 is Int)  /* 2 cabe em byte e em short mas um literal declarado inteiro sempre será Int
    OBS: a menos que ultrapasse a capacidade de um Int
    */
    println(1.0 is Double)


    //Tudo em Kotlin é objeto. Basta tentar acessar o método de qualquer val ou var declarada numérica
    println(1.0.minus(2.0))
    println(10.dec())

}