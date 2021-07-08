package one.digitaltest.login

import one.digitaltest.ImprimeRelatorioFuncionario

fun main () {
    val davi = Analista(nome = "davi queiroz", cpf = "862078569874", salario = 5000.0)
    ImprimeRelatorioFuncionario.imprime(davi)

}
