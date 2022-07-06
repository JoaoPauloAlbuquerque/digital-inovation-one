package one.digitalinovation.arrays

fun main() {
    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = TipoContratacao.CLT)
    val maria = Funcionario(nome = "Maria", salario = 1500.0, tipoContratacao = TipoContratacao.CONTRATO)
    val pedro = Funcionario(nome = "Pedro", salario = 3000.0, tipoContratacao = TipoContratacao.CLT)
    val jose = Funcionario(nome = "Jose", salario = 5000.0, tipoContratacao = TipoContratacao.PJ)

    val funcionarios = listOf(joao, maria, pedro, jose)
    funcionarios.forEach { funcionario ->
        println(funcionario.toString())
    }

    println("------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("------------------")
    // Ordena a lista por salário
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("------------------")
    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
}