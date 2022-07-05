package one.digitalinovation.digionebank

class Pessoa {
    var nome: String = "pedro"
    private set // Define privado para a propriedade set da variavel acima
    var cpf: String = "123.456.789-00"
    private set
    constructor()

    public fun getNomeAndCpf() = "$nome + $cpf"
}

fun main() {
    val pessoa = Pessoa()
    println(pessoa.getNomeAndCpf())
}