package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Analista

fun main() {
    val joao = Analista(nome = "Jão", cpf = "125.325.369-98", salario = 2000.0)
    ImprimirRelatorioFuncionario.imprimir(joao)
}