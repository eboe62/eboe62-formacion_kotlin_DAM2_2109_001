class Utilidades () {
    companion object {
        fun numeroAleatorio(inicio: Int, fin: Int): Int {
            var aleatorio: Int
            do {
                aleatorio = (inicio..fin).random()
            } while (aleatorio < inicio || aleatorio > fin)
            return aleatorio
        }
    }
}