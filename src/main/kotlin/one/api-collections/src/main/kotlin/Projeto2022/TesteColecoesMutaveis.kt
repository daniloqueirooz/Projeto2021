package Projeto2022

fun main () {
    val Danilo = Funcionario("Danilo", 1000.0)
    val Lara = Funcionario("Lara", 2000.0)
    val Davi = Funcionario("Davi", 3000.0)

    val funcionarios = mutableListOf(Danilo, Davi)
    funcionarios.forEach{ println(it)}

    println("-------------------LIST-----------------------------")
    funcionarios.add(Lara)
    funcionarios.forEach{ println(it)}

    println("---------ADD-----------")

    funcionarios.add(Davi)
    funcionarios.forEach{ println(it)}

    println("------REMOVE---------")
    funcionarios.remove(Davi)
    funcionarios.forEach { println(it)}


}

