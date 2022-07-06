package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Gerente

fun main() {
    val maria = Gerente(nome = "Maria", cpf = "125.325.369-98", salario = 4000.0, senha = "1234")
    ImprimirRelatorioFuncionario.imprimir(maria)

    Autenticacao().autenticar(maria)
}