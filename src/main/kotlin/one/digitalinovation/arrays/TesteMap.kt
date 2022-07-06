package one.digitalinovation.arrays

fun main(){
    val pair: Pair< String, Double> = Pair("João", 1000.0)
    val mapa1 = mapOf(pair)

    mapa1.forEach{ (x, v) ->
        println("Chave: $x - Valor: $v")
    }

    val mapa2 = mapOf("Pedro" to 2000.0, "Maria" to 3000.0)
    mapa2.forEach{ (x, v) ->
        println("Chave: $x - Valor: $v")
    }

}