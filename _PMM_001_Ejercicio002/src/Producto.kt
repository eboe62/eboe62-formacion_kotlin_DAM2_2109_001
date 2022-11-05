// https://stackoverflow.com/questions/31847080/how-to-convert-any-object-to-string
// https://kotlinlang.org/docs/basic-syntax.html#comments
// https://stackoverflow.com/questions/37524422/equals-method-for-data-class-in-kotlin
open class Producto (var no: String, var fCDate: Int, var l: Int, var fEDate: Int, var tM: Double, var pO: String) {
    companion object {
        lateinit var producto: Producto
    }
	fun getNombre(): String {return no}
	fun getFechaCaducidad(): Int {return fCDate}
	fun getLote(): Int {return l}
	fun getFechaEnvasado(): Int {return fEDate}
	fun getTemperaturaMantenimiento(): Double {return tM}
	fun getPaisOrigen(): String {return pO}
    fun setNombre(d:String) {this.no = d}
	fun setFechaCaducidad(d:Int) {fCDate = d}   
	fun setLote(d:Int) {l = d}   
	fun setFechaEnvasado(d:Int) {fEDate = d}   
	fun setTemperaturaMantenimiento(d:Double) {tM = d}   
    fun setPaisOrigen(d:String) {this.pO = d}
    override fun toString(): String = "GENERICO: "+ no +" - "+ fCDate +" - "+ l +" - "+ fEDate +" - "+ tM +" - "+ pO
	override fun equals(other: Any?): Boolean{
        if (this === other) return true
        if (other?.javaClass != javaClass) return false
        other as Producto
        if (!no.equals(other.no)) return false
        return true
    }
}
