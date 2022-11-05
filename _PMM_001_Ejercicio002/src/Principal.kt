import java.util.Scanner

    fun main(args: Array<String>) {
        var tipoSujeto: String = "producto"
        println("Cuantos $tipoSujeto"+"s están entrando?");
        val entrada: Int = 10
    // https://www.kotlin.thiyagaraaj.com/kotlin-basics/kotlin-input-and-output/read-data-input-using-scanner-in-kotlin    
    // https://stackoverflow.com/questions/32798803/understanding-scanners-nextline-next-and-nextint-methods
    //	val entrada = scanner_variable.nextInt()
    //    val entrada = scan.nextLine().trim().toInt()
    //    val entrada = Scanner(System.`in`)
    //    val sujetosLista = SujetosLista()
        println (entrada)
    // https://beginnersbook.com/2019/02/kotlin-for-loop/
        for (i in 0..entrada-1) {
            do {
                // Producto
                var nombre: String = Dummy.generarNombre()  
                var	fechaCaducidad: Int = Dummy.generarLote()
                var lote: Int = Dummy.generarLote()
                var	fechaEnvasado: Int = Dummy.generarLote()
                var	temperaturaMantenimiento: Double = Dummy.generarPorcentaje()
                var	paisOrigen: String = Dummy.generarPais()
                // Producto Refrigerado
                var idOrganismo: Int = Dummy.generarLote()
                // Producto Fresco
                // Producto Congelado
                // Producto Congelado Agua
                var	salinidad: Double = Dummy.generarPorcentaje()
                // Producto Congelado Aire
                var	porcentajeNitrogeno: Double = Dummy.generarPorcentaje()
                var	porcentajeOxigeno: Double = Dummy.generarPorcentaje()
                var	porcentajeDioxidoCarbono: Double = Dummy.generarPorcentaje()
                var	porcentajeVaporAgua: Double = Dummy.generarPorcentaje()
                // Producto Congelado Nitrogeno
                var	metodoNitrogeno: String = Dummy.generarMetodo()
                var	tiempoNitrogeno: Double = Dummy.generarPorcentaje()
				
                Producto.producto = Producto(nombre, fechaCaducidad, lote, fechaEnvasado, temperaturaMantenimiento, paisOrigen)
                PFresco.pFresco = Producto(nombre, fechaCaducidad, lote, fechaEnvasado, temperaturaMantenimiento, paisOrigen)
                PRefrigerado.pRefrigerado = PRefrigerado(nombre, fechaCaducidad, lote, fechaEnvasado, temperaturaMantenimiento, paisOrigen, idOrganismo)
                PCAgua.pCAgua = PCAgua(nombre, fechaCaducidad, lote, fechaEnvasado, temperaturaMantenimiento, paisOrigen, salinidad)
                PCAire.pCAire = PCAire(nombre, fechaCaducidad, lote, fechaEnvasado, temperaturaMantenimiento, paisOrigen, porcentajeNitrogeno, porcentajeOxigeno, porcentajeDioxidoCarbono, porcentajeVaporAgua)
                PCNitrogeno.pCNitrogeno = PCNitrogeno(nombre, fechaCaducidad, lote, fechaEnvasado, temperaturaMantenimiento, paisOrigen, metodoNitrogeno, tiempoNitrogeno)
//                println ("PRODUCTO FRESCO: $Producto.producto")
//                println (Service.consultaSujeto(Producto.producto))
            } while (Service.consultaSujeto(Producto.producto))
            
        when (i) {
            0, 1 -> 
                Service.altaSujeto(i, PFresco.pFresco)
//                println ("PRODUCTO FRESCO: ${producto.getNombre()} - ${producto.getFechaCaducidad()} - ${producto.getLote()} - ${producto.getFechaEnvasado()} - ${producto.getTemperaturaMantenimiento()} - ${producto.getPaisOrigen()}")
            2, 3, 4 -> 
                Service.altaSujeto(i, PRefrigerado.pRefrigerado)
//                println ("PRODUCTO REFRIGERADO: ${pRefrigerado.getNombre()} - ${pRefrigerado.getFechaCaducidad()} - ${pRefrigerado.getLote()} - ${pRefrigerado.getFechaEnvasado()} - ${pRefrigerado.getTemperaturaMantenimiento()} - ${pRefrigerado.getPaisOrigen()} - ${pRefrigerado.getIdOrganismo()}")
            5, 6 -> 
                Service.altaSujeto(i, PCAgua.pCAgua)
//                println ("PRODUCTO CONGELADO - AGUA: ${pCAgua.getNombre()} - ${pCAgua.getFechaCaducidad()} - ${pCAgua.getLote()} - ${pCAgua.getFechaEnvasado()} - ${pCAgua.getTemperaturaMantenimiento()} - ${pCAgua.getPaisOrigen()} - ${pCAgua.getSalinidad()}")
            7, 8 ->
                Service.altaSujeto(i, PCAire.pCAire)
//                println ("PRODUCTO CONGELADO - AIRE: ${pCAire.getNombre()} - ${pCAire.getFechaCaducidad()} - ${pCAire.getLote()} - ${pCAire.getFechaEnvasado()} - ${pCAire.getTemperaturaMantenimiento()} - ${pCAire.getPaisOrigen()} - ${pCAire.getPorcentajeNitrogeno()} - ${pCAire.getPorcentajeOxigeno()} - ${pCAire.getPorcentajeDioxidoCarbono()} - ${pCAire.getPorcentajeVaporAgua()}")
            9 -> 
                Service.altaSujeto(i, PCNitrogeno.pCNitrogeno)
//                println ("PRODUCTO CONGELADO - NITROGENO: ${pCNitrogeno.getNombre()} - ${pCNitrogeno.getFechaCaducidad()} - ${pCNitrogeno.getLote()} - ${pCNitrogeno.getFechaEnvasado()} - ${pCNitrogeno.getTemperaturaMantenimiento()} - ${pCNitrogeno.getPaisOrigen()} - ${pCNitrogeno.getMetodoNitrogeno()} - ${pCNitrogeno.getTiempoNitrogeno()}")
            else -> {print("No definido")
            }
            
    /*        
    // https://beginnersbook.com/2019/03/kotlin-data-class/
            println ("Producto: ${producto.getNombre()} - ${producto.getFechaCaducidad()} - ${producto.getLote()} - ${producto.getFechaEnvasado()} - ${producto.getTemperaturaMantenimiento()} - ${producto.getPaisOrigen()}")
            var pCongelado: pCongelado = pCongelado(nombre, fechaCaducidad, lote, fechaEnvasado, temperaturaMantenimiento, paisOrigen)
            println ("pCongelado: ${producto.getNombre()} - ${producto.getFechaCaducidad()} - ${producto.getLote()} - ${producto.getFechaEnvasado()} - ${producto.getTemperaturaMantenimiento()} - ${producto.getPaisOrigen()}")
    */
        }
        //printing the non-Empty hashMap
    }
    Service.listarSujetos(SujetosLista.cola)
}
