package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Funcionario

class ImprimirRelatorioFuncionario {
    companion object{
        fun imprimir(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}