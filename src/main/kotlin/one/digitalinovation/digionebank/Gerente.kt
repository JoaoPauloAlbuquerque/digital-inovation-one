package one.digitalinovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario), Logavel {
    override fun calcularAuxilio() = salario * 0.4

    override fun login(): Boolean = "1234" == senha

    override fun toString(): String {
        return "Nome: $nome\nCPF: $cpf\nSalario: $salario\nAuxílio: ${calcularAuxilio()}"
    }
}