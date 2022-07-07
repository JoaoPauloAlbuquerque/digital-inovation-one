package one.digitalinovation.mutable

import one.digitalinovation.arrays.Funcionario
import one.digitalinovation.arrays.TipoContratacao

fun main(){
    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = TipoContratacao.CLT)
    val maria = Funcionario(nome = "Maria", salario = 1500.0, tipoContratacao = TipoContratacao.CONTRATO)
    val pedro = Funcionario(nome = "Pedro", salario = 3000.0, tipoContratacao = TipoContratacao.CLT)
    val jose = Funcionario(nome = "Jose", salario = 5000.0, tipoContratacao = TipoContratacao.PJ)

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it) }

    println("----------List-------------")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }

    println("-----------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println("-----------Set------------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{ println(it) }

    funcionariosSet.add(pedro)
    funcionariosSet.add(jose)
}