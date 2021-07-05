package one.digitaltest

class Pessoa {
    var name: String  = "Danilo"

    var cpf: String = "123.123.112-81"
    private set
    }


fun main (){
    val danilo = Pessoa()

    println(danilo)
    println(danilo.name)
    println(danilo.cpf)
    }