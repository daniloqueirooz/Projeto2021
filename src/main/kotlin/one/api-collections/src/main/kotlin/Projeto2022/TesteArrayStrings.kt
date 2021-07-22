package Projeto2022

fun main () {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Lara"
    nomes[2] = "Danilo"


    for (nome in nomes) {
        println(nome)

        }
    println("--------------------------------")
    nomes.sort()
    nomes.forEach { println(it) }



}