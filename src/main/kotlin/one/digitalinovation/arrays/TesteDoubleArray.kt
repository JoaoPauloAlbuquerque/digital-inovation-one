package one.digitalinovation.arrays

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 2000.0

    salarios.forEach{salario ->
        println(salario)
    }

    salarios.forEachIndexed{index, salario ->
        println("Salario: $salario\nIndex: $index")
    }
}