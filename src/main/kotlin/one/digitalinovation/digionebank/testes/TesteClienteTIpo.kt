package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("PF: ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("PJ: ${pj.name} - ${pj.descricao}")
}