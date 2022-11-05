// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/
// https://www.geeksforgeeks.org/kotlin-hashmap/
class SujetosLista () {
    companion object {
        var cola: HashMap<Int, Producto> = HashMap<Int, Producto>()
    }
    /*
        var minKeyCola: Int = 0
        var maxKeyCola: Int = 0
// https://stackoverflow.com/questions/49196671/sort-map-in-reverse-order-in-kotlin      
	fun getMinKeyCola(): Int {
		var minKeyCola: Int = getMaxKeyCola()
        cola.toSortedMap(reverseOrder())
		if (cola != null) {
            for ((Int, Producto) in cola) {
                var key: Int = minKeyCola;
                if (key < minKeyCola) {
                    minKeyCola = key; 
                }
			}
			return minKeyCola;
		}
		return minKeyCola;
    }
	fun getMaxKeyCola(): Int {
		if (cola != null) {
            for ((Int, Producto) in cola) {
                var key: Int = 0
                if (key > maxKeyCola) {
                    maxKeyCola = key; 
                }
			}
        	return maxKeyCola;
		}
		return maxKeyCola;
    }
    */
	fun getCola(): HashMap<Int, Producto> {return cola}
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-sorted-map.html    
    fun setCola(d:HashMap<Int, Producto>) {
		var sortedMap = cola.toSortedMap();
            for ((Int, Producto) in sortedMap) {
                var key: Int = 0
				sortedMap.put(key, sortedMap.get(key));
			}
		cola = d;
    }
    /*
    fun setMinKeyCola(d:Int) {minKeyCola = d}
    fun setMaxKeyCola(d:Int) {maxKeyCola = d}
    */
//	fun getCola(): HashMap<Int, Producto> {return cola}
//    fun setCola(d:HashMap<Int, Producto>) {cola = d;}
}
