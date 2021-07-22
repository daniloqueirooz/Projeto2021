package Projeto2022

fun main () {
    val salarios = DoubleArray(3)
    salarios [0] = 1000.0
    salarios [1] = 2250.0
    salarios [2] = 3500.0

    salarios.forEach { println(it) }

    println("--------------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("---------------------")
    val salarios2 = doubleArrayOf(1100.0, 2470.0, 3850.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}


