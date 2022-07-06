package one.digitalinovation.arrays

fun main(){
    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = TipoContratacao.CLT)
    val maria = Funcionario(nome = "Maria", salario = 1500.0, tipoContratacao = TipoContratacao.CONTRATO)
    val pedro = Funcionario(nome = "Pedro", salario = 3000.0, tipoContratacao = TipoContratacao.CLT)
    val jose = Funcionario(nome = "Jose", salario = 5000.0, tipoContratacao = TipoContratacao.PJ)

    val funcionarios1 = setOf(joao, maria)
    val funcionarios2 = setOf(pedro, jose)

    val unirFuncionarios = funcionarios1.union(funcionarios2)
    unirFuncionarios.forEach{ println(it) }

    println("-------------------------")
    val funcionarios3 = setOf(joao, maria, pedro)
    val subtrairFuncionarios = funcionarios3.subtract(funcionarios1)
    subtrairFuncionarios.forEach{ println(it) }

    println("-------------------------")
    val intersecaoFuncionarios = funcionarios3.intersect(funcionarios1)
    intersecaoFuncionarios.forEach{ println(it) }
}