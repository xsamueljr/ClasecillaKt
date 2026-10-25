fun main() {
    // NO HAY FOR CLÁSICO PORQUE SE RESUELVE CON RANGOS
    // <start>..<end>
    // <start>..<end> step <step>
    // <start> downTo <end> (si se quiere ir al revés e.g. 10 downTo 2)

    for (i in (2..10).reversed().step(2)) {
        println(i)
    }

    // TAMPOCO HACE FALTA USAR ESTO PARA RECORRER COLECCIONES
    // PORQUE SE FAVORECE EL FOREACH Y SE ESCRIBE MU FÁCIL

    val pichas = listOf(1, 2, 3, 4, 5)

    for (picha in pichas) {
        println(picha)
    }

    // EL WHILE ES NORMAL
    while (Math.random() > 0.5) {
        println("Esto entra, o no, o lo hace varias veces o ninguna. MAGIA")
    }
}