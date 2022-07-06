package one.digitalinovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "12345" == senha

    override fun toString(): String {
        return "Nome: $nome\nCPF: $cpf\nTipo conta: ${clienteTipo.name} - ${clienteTipo.descricao}"
    }
}