package one.digitalinovation.arrays

fun main() {
    val array = Array(3) { "" }
    array[0] = "João"
    array[1] = "Pedro"
    array[2] = "Ana"

    for (nome in array) {
        println(nome)
    }

    array.sort()
    array.forEach{nome ->
        println(nome)
    }
}