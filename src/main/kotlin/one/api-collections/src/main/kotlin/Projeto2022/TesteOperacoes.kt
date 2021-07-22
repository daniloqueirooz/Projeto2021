package Projeto2022

fun main () {
    val salarios = doubleArrayOf(1000.0, 1500.0, 3000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("-----------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    println("-------------------------------")

    val salarioMaiorQue2500 = salarios.filter { it > 2500 }
    println("--------------------------")
    salarioMaiorQue2500.forEach { println(it) }

    println("-------------------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("-------------------------------")
    println(salarios.find { it == 1500.0 })


}