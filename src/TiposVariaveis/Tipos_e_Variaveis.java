package TiposVariaveis;

public class Tipos_e_Variaveis {

	public static void main(String[] args) {
		
		imprimir(String.valueOf(somar(10, 50)));

	}
	
	public static double somar (int num1, int num2) {
		return num1+num2;
	}
	
	public static void imprimir(String text) {
		System.out.println(text);
	}

}
