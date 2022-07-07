package one.digitalinovation.mutable

import one.digitalinovation.arrays.Funcionario
import one.digitalinovation.arrays.TipoContratacao

fun main(){
    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = TipoContratacao.CLT)
    val maria = Funcionario(nome = "Maria", salario = 1500.0, tipoContratacao = TipoContratacao.CONTRATO)
    val pedro = Funcionario(nome = "Pedro", salario = 3000.0, tipoContratacao = TipoContratacao.CLT)
    val jose = Funcionario(nome = "Jose", salario = 5000.0, tipoContratacao = TipoContratacao.PJ)

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(jose.nome, jose)

    println(repositorio.findById(joao.nome))

    println("-----------------------------")
    repositorio.findAll().forEach{ println(it) }

    println("-----------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{ println(it) }
}