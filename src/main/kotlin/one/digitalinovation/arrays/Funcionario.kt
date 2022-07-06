package one.digitalinovation.arrays

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: TipoContratacao
) {
    override fun toString(): String {
        return "Nome: $nome\nSalário: $salario\nContrato: $tipoContratacao\n"
    }
}