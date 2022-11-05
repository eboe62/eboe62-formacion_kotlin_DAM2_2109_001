class Cuadrado {
	open class Rectangulo(var alto: Double, var largo: Double) {
		var perimetro = (alto + largo) * 2
	}

	class cuadrado(var lado: Double) : Rectangulo(lado, lado) {
	}
}