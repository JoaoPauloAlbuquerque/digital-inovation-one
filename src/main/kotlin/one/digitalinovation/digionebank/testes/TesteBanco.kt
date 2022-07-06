package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco(nome = "Digi", numero = 12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)
}