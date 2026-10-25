fun main() {
    // el if y demás funciona como cualquiera esperaría EXCEPTO
    // POR QUE PUEDEN SER EXPRESIONES

    // Sentencia
    // Instrucción que no tiene un valor como tal que se pueda calcular
    // ejemplo
    println("picha")



    // Expresión
    // Evalúa a algo. Las más comunes son aritméticas y lógicas

    println(2 + 2)
    // Eso no muestra "2 + 2", muestra "4" porque se evalúa antes


    // IF COMO EXPRESIÓN: Poner un if en un sitio donde iría una expresión

    val cosilla = if (true) 1 else 2

    println(cosilla)

    // EL WHEN ES UN SWITCH MÁS POTENTE

    println(when (cosilla) {
        1 -> "Mi número favorito omg!!!"
        67 -> "Este le mola a Yamete"
        69 -> "Este le mola a Daniel"
        else -> "Ni idea"
    })

    val miCosaFavorita: Any = true

    when (miCosaFavorita) {
        is String -> println("$miCosaFavorita is a String")
        is Int -> println("$miCosaFavorita is a Int")
        else -> println("$miCosaFavorita is whatever it wants to be")
    }



}