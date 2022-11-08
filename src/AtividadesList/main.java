package AtividadesList;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<temperatura> temp = new ArrayList<>();
		String[] meses = {"Janeiro", "Fevereiro", "Maio", "Abril", "Marco", "Junho"}; 
		
		int soma = 0;
		for (int i = 1; i<= 6; i++) {
			System.out.println("Informe a temperatura e o mês");
			temp.add(new temperatura(scan.nextInt(), meses[i-1]));
		}
		
		
		for (int i = 0; i< 6; i++) {
			soma += temp.get(i).getValorTemperatura();
		}
		
		System.out.println("A media da temperatura é: "+soma/temp.size());
		for (int i = 0; i< 6; i++) {
			if(temp.get(i).getValorTemperatura() >= soma/temp.size()) {
				System.out.println(temp.get(i).toString());
			}
		}
		
		

		
		
		
	}

}
