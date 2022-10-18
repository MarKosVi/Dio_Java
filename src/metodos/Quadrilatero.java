package metodos;

public class Quadrilatero {
	
	public static String Area(double lado) {
		return "Area do quadrado: "+(lado*lado);
	}
	
	public static String Area(double lado1, double lado2) {
		return "Area do retangulo: "+(lado1*lado2);
	}
	
	public static String Area(double baseMaior, double baseMenor, double altura) {
		return "Area do trapezio: "+(((baseMaior*baseMenor)*altura)/2);
	}
	
	
}
