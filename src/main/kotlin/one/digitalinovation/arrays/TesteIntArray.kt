package one.digitalinovation.arrays

fun main(){
    val values = IntArray(5)

    values[0] = 2
    values[1] = 4
    values[2] = 1
    values[3] = 3
    values[4] = 5

    println("For")
    for(valor in values){
        println(valor)
    }

    println("ForEach")
    values.forEach { valor ->
        println(valor)
    }

    println("Indices")
    for(index in values.indices){
        println(index)
    }

    println("Ordenando o array")
    values.sort()
    for (valor in values){
        println(valor)
    }
}