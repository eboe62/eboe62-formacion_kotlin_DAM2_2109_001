// https://stackoverflow.com/questions/43857824/kotlin-static-methods-and-variables
class Service () {
    companion object {
        fun altaSujeto(i: Int, producto: Producto): HashMap<Int, Producto>{
            SujetosLista.cola.put(i, producto)
            return SujetosLista.cola
        }
// https://stackoverflow.com/questions/47204146/how-to-iterate-over-hashmap-in-kotlin
// https://kotlinlang.org/docs/iterators.html        
        fun listarSujetos(cola: HashMap<Int, Producto>){
            if(cola.isEmpty()){
                println("No hay ningún producto dado de alta")
            }else{
                for(key in cola.keys){
                    println("PRODUCTO: $key"+" - "+"${cola[key]}")
                }
            }
        }
// https://turreta.com/2017/06/20/kotlin-check-if-key-exists-in-map/
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/contains-value.html        
        fun consultaSujeto (producto: Producto): Boolean {
            return SujetosLista.cola.containsValue(producto as Producto)
        }
    }
}
