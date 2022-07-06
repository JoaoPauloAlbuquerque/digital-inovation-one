package one.digitalinovation.digionebank

import java.math.BigDecimal

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calcularAuxilio() = salario * 0.1

    override fun toString(): String {
        return "Nome: $nome\nCPF: $cpf\nSalario: $salario\nAuxílio: ${calcularAuxilio()}"
    }
}