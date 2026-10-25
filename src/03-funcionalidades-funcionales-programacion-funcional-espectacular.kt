import kotlin.random.Random

data class Tio(val nombre: String, val guapo: Boolean)

fun main() {
    // COSILLAS DE PROGRAMACIÓN FUNCIONAL

    /*
    TODO LO QUE SE PUEDE HACER CON MIERDAS DE MAP Y FILTER SE PUEDE CON FOR
    PERO PUEDE QUEDAR MÁS CONCISO SEGÚN LO QUE SE HAGA Y LAS OPERACIONES QUE QUIERAS ANIDAR
    */

    val daniel = Tio("Daniel", true)
    val (nombre, guapo) = daniel // destructuring

    /*
    * Ejercicio 5: Map (bloque 3)
Crea un mapOf de sensor a lectura ("S1" to 22.5, "S2" to 30.1, "S3" to 18.0, "S4" to 36.4).
a) Recórrelo con un for y destructuring (nombre, valor).
b) Muestra solo los sensores con lectura mayor de 25.
c) Busca la lectura de "S9" (no existe) y muestra "Sin datos" con ?:.
    * */

    val sensores = mapOf("S1" to 22.5, "S2" to 30.1, "S3" to 18.0, "S4" to 36.4)

    for ((id, valor) in sensores) {
        if (valor > 25) println(id)
    }

    println(sensores["S9"] ?: "Sin datos")

}

