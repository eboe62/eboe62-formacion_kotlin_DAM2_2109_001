class PCongelado (no: String, fCDate: Int, l: Int, fEDate: Int, tM: Double, pO: String): Producto (no, fCDate, l, fEDate, tM, pO) {
    companion object {
        lateinit var pCongelado: Producto
    }
    override fun toString(): String = "CONGELADO-GENERICO: "+ no +" - "+ fCDate +" - "+ l +" - "+ fEDate +" - "+ tM +" - "+ pO
	override fun equals(other: Any?): Boolean{
        if (this === other) return true
        if (other?.javaClass != javaClass) return false
        other as Producto
        if (!no.equals(other.no)) return false
        return true
    }
}
