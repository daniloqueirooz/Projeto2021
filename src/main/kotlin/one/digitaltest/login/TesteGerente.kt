package one.digitaltest.login

import one.digitaltest.Funcionario
import one.digitaltest.Gerente
import one.digitaltest.ImprimeRelatorioFuncionario
import java.math.BigDecimal

fun main () {
    val danilo = Gerente(nome = "danilo queiroz", cpf = "862078569874", salario = 2000.0)
   ImprimeRelatorioFuncionario.imprime(danilo)

}
