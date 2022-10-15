package metodos;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(Soma(10,20));
	System.out.println(Subtracao(30,5));
	System.out.println(Multi(5,7));
	System.out.printf("%.2f \n", Div(20,3));
	System.out.println(Saudacoes(8));
	System.out.println(Emprestimo(1000, 7));
	
	}
	
	
	public static int Soma(int primeiroNum, int segundoNum) {
		
		return primeiroNum + segundoNum;
	}
	
	public static int Subtracao(int primeiroNum, int segundoNum) {
		
		return primeiroNum - segundoNum;
	}
	
	public static float Multi (float primeiroNum, float segundoNum) {
		return primeiroNum*segundoNum;
	}

	public static float Div (float primeiroNum, float segundoNum) {
		return primeiroNum/segundoNum;
	}
	
	public static String Saudacoes(int hora) {
		
		String saudacao = "";
		
		if(hora >= 0 && hora <=  11) saudacao = " Bom Dia ";
		if(hora >= 12 && hora <=  17) saudacao = " Boa Tarde ";
		if(hora >= 18 && hora <=  23) saudacao = " Boa Noite ";
		
		return saudacao;
	}
	
	
	public static String Emprestimo (float valorEmprestimo, int qtdParcelas) {
		
		float taxaJuros = 20;
		float totalPagar = 0;
		
		if (qtdParcelas > 5) {
			taxaJuros = 30;
		}
		
		totalPagar = valorEmprestimo + (Multi(valorEmprestimo,taxaJuros)/100);
		
		return "Emprestimo de R$"+valorEmprestimo+" - Taxa de juros de "+taxaJuros+"% Valor total pago = "+totalPagar; 
		
	}
	

}
