package one.digitalinovation.arrays

fun main(){
    val salarios = doubleArrayOf(1000.0, 3000.0, 2000.0)

    for (salario in salarios){
        println(salario)
    }

    println("-------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")

    println("-------------------")
    // Filtrando os salários e colocando dentro de outra lista
    val novoSalario = salarios.filter{ it > 2000}
    novoSalario.forEach{println(it)}

    println("-------------------")
    // Contando os valores dentro de um intervalo
    println(salarios.count{ valor ->
        valor in 1000.0 .. 3000.0
    })

    println("-------------------")
    // Imprime/retorna a primeira ocorrencia do valor se encontrado,
    // caso não encontre, ele imprime/retorna null
    println(salarios.find{ valor ->
        valor == 2000.0
    })

    println("-------------------")
    // Imprime/retorna verdadeiro se encontrar pelo menos um elelmento
    println(salarios.any{ valor ->
        valor == 3000.0
    })
}