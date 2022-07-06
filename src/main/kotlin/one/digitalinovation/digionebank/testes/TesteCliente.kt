package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Cliente
import one.digitalinovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente("Jose Palmito", "123.123.123-12", ClienteTipo.PF, "12345")
    println(jose.toString())

    Autenticacao().autenticar(jose)
}