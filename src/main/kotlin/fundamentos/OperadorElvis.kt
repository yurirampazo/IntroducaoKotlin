package fundamentos

fun main() {
//    val opcional: String? = ""
    val opcional: String? = null
    val obrigatoria: String = opcional ?: "Valor padrao"

    println(obrigatoria)
}