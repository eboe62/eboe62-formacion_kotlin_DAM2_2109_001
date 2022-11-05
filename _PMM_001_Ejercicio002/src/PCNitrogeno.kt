class PCNitrogeno (no: String, fCDate: Int, l: Int, fEDate: Int, tM: Double, pO: String, var mN: String, var tN: Double): Producto (no, fCDate, l, fEDate, tM, pO) {
    companion object {
        lateinit var pCNitrogeno: Producto
    }
	fun getMetodoNitrogeno(): String {return mN}
	fun getTiempoNitrogeno(): Double {return tN}
    fun setMetodoNitrogeno(d:String) {this.mN = d}
    fun setTiempoNitrogeno(d:Double) {tN = d}
    override fun toString(): String = "CONGELADO-NITROGENO: "+ no +" - "+ fCDate +" - "+ l +" - "+ fEDate +" - "+ tM +" - "+ pO +" - "+ mN +" - "+ tN
	override fun equals(other: Any?): Boolean{
        if (this === other) return true
        if (other?.javaClass != javaClass) return false
        other as Producto
        if (!no.equals(other.no)) return false
        return true
    }
}
