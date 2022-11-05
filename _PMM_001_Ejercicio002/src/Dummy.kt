class Dummy () {
    companion object {
        fun generarNombre(): String  {
            val colorLista = arrayOf("Pera", "Limon", "Fresa", "Melon", "Sandia", "Naranja", "Uva", "Chirimolla", "Aguacate", "Ciruela", "Mango", "Niscalos", "Pepino", "Pimiento")
            var dummy: String = (colorLista[Utilidades.numeroAleatorio(0, 13)])
            return dummy
        }

        fun generarLote(): Int  {
            var lote: Int = Utilidades.numeroAleatorio(100, 300)
            return lote
        }

        fun generarPorcentaje(): Double  {
            var porcentaje: Double = Utilidades.numeroAleatorio(20, 30).toDouble()
            return porcentaje
        }

        fun generarPais(): String  {
            val colorLista = arrayOf("España", "Alemania", "Francia", "Marruecos", "Argentina", "Irlanda", "Italia", "Colombia")
            var dummy: String = (colorLista[Utilidades.numeroAleatorio(0, 7)])
            return dummy
        } 

        fun generarMetodo(): String  {
            val colorLista = arrayOf("Extrusion", "Intrusion")
            var dummy: String = (colorLista[Utilidades.numeroAleatorio(0, 1)])
            return dummy
        }
    }
}    
