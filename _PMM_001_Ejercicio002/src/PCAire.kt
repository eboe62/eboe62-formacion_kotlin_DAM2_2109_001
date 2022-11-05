class PCAire (no: String, fCDate: Int, l: Int, fEDate: Int, tM: Double, pO: String, var pNi: Double, var pOx: Double, var pDC: Double, var pVA: Double): Producto (no, fCDate, l, fEDate, tM, pO) {
    companion object {
        lateinit var pCAire: Producto
    }
	fun getPorcentajeNitrogeno(): Double {return pNi}
	fun getPorcentajeOxigeno(): Double {return pOx}
	fun getPorcentajeDioxidoCarbono(): Double {return pDC}
	fun getPorcentajeVaporAgua(): Double {return pVA}
    fun setPorcentajeNitrogeno(d:Double) {pNi = d}
    fun setPorcentajeOxigeno(d:Double) {pOx = d}
    fun setPorcentajeDioxidoCarbono(d:Double) {pDC = d}
    fun setPorcentajeVaporAgua(d:Double) {pVA = d}
    override fun toString(): String = "CONGELADO-AIRE: "+ no +" - "+ fCDate +" - "+ l +" - "+ fEDate +" - "+ tM +" - "+ pO +" - "+ pNi +" - "+ pOx +" - "+ pDC +" - "+ pVA
	override fun equals(other: Any?): Boolean{
        if (this === other) return true
        if (other?.javaClass != javaClass) return false
        other as Producto
        if (!no.equals(other.no)) return false
        return true
    }
}
