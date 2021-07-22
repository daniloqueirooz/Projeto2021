package Projeto2022

fun main () {
 val Danilo = Funcionario("Danilo", 1000.0)
    val Lara = Funcionario("Lara", 2000.0)
    val Davi = Funcionario("Davi", 3000.0)

    val funcionarios = listOf(Danilo, Lara, Davi)

    funcionarios.forEach { println (it) }

    println("-----------------------------------")
    println(funcionarios.find { it.nome == "Davi" })
}

data class Funcionario (
    val nome: String,
    val salario: Double
    ) {
    override fun toString(): String =
    """"
            nome: $nome
            Salario: $salario
            """".trimIndent()
}


