package one.digitalinovation.extendsfunctions

fun main(){
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "3000".toBigDecimal(),
        "5000".toBigDecimal())

    println(salarios.somatoria())

    println(salarios.media())
}