package one.digitaltest.login

import one.digitaltest.ClienteTipo

fun main () {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} ~ ${elemento.descricao}")

    }
    ClienteTipo.values().forEach {
        println("${it.name} ~ ${it.descricao}")

    }
    val pf = ClienteTipo.pf
    println(">>${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.pj
    println(">>>${pj.name} - ${pj.descricao}")

}
