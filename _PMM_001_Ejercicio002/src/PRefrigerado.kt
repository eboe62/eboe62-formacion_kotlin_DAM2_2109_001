class PRefrigerado (no: String, fCDate: Int, l: Int, fEDate: Int, tM: Double, pO: String, var idO: Int): Producto (no, fCDate, l, fEDate, tM, pO) {
    companion object {
        lateinit var pRefrigerado: Producto
    }
	fun getIdOrganismo(): Int {return idO}
    fun setIdOrganismo(d:Int) {idO = d}
    override fun toString(): String = "REFRIGERADO: "+ no +" - "+ fCDate +" - "+ l +" - "+ fEDate +" - "+ tM +" - "+ pO +" - "+ idO
	override fun equals(other: Any?): Boolean{
        if (this === other) return true
        if (other?.javaClass != javaClass) return false
        other as Producto
        if (!no.equals(other.no)) return false
        return true
    }
}
