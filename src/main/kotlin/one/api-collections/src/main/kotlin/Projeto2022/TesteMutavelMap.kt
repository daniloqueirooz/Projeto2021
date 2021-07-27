package Projeto2022

fun main () {
    val Danilo = Funcionario("Danilo", 1000.0)
    val Lara = Funcionario("Lara", 2000.0)
    val Davi = Funcionario("Davi", 3000.0)

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(Danilo.nome, Danilo)
    repositorio.create(Lara.nome, Lara)
    repositorio.create(Davi.nome, Davi)

    println(repositorio.findByID(Danilo.nome))

    println("------------------------------------------")
    repositorio.findAll().forEach{ println(it) }
}