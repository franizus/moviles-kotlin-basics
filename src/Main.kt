import javax.print.attribute.IntegerSyntax

fun sumarDosNumeros(numeroUno: Int, numeroDos: Int): Int {
    return numeroUno + numeroDos
}

fun main(args: Array<String>) {
    println("Hola, mundo!")
    println(sumarDosNumeros(1, 2))
    var nombre: String? = "Francisco"
    var edad: Int = 23
    val edadActual = 23
    var casado = false

    when (casado) {
        true -> {
            println("Esta casado")
        }
        else -> {
            println("No esta casado")
        }
    }

    val superHeroe = if (casado) {
        "SuperMandarina"
    } else {
        "Superman"
    }
    // template strings
    println("Superheroe: ${superHeroe}")
}

class Persona {
    lateinit var edadActual: Integer
    var nNombre: String

    //constructor(edad: Any
    //ctrl + a
    //ctrl + alt + l
    constructor(edad: Integer, nombre: String) {
        edadActual = edad
        nNombre = nombre
    }

    fun iniciar(edad: Integer) {
        edadActual = edad
    }
}

class PersonaDos(edad: Integer, nombre: String) {
    var nEad = edad
    var nNombre = nombre
    var nCedula: String? = null

    constructor(edad2: Integer, nombre2: String, cedula: String) : this(edad2, nombre2) {
        nCedula = cedula
    }
}