package fundamentos

fun main() {
    val a : Int? = null
    println(a?.inc())

    println("Momento do erro...")
    println(a!!.inc())  // !! significa que o programador assume o risco de receber KotlinNullPointerException
}