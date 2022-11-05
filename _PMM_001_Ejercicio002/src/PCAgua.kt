class PCAgua (no: String, fCDate: Int, l: Int, fEDate: Int, tM: Double, pO: String, var sa: Double): Producto (no, fCDate, l, fEDate, tM, pO) {
    companion object {
        lateinit var pCAgua: Producto
    }
	fun getSalinidad(): Double {return sa}
    fun setSalinidad(d:Double) {sa = d}
    override fun toString(): String = "CONGELADO-AGUA: "+ no +" - "+ fCDate +" - "+ l +" - "+ fEDate +" - "+ tM +" - "+ pO +" - "+ sa
	override fun equals(other: Any?): Boolean{
        if (this === other) return true
        if (other?.javaClass != javaClass) return false
        other as Producto
        if (!no.equals(other.no)) return false
        return true
    }
}
