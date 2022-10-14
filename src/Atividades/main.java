package Atividades;

import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, qtdNum, par = 0, impar = 0, soma = 0;
		
		System.out.println("Informe a quantidade de numeros a serem informados ");
		qtdNum = scan.nextInt();
		
		for(int i = 0; i < qtdNum; i++) {
			System.out.println("Informe o "+(i+1)+" Numero");
			num = scan.nextInt();
			soma += num;
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("Foram identificados "+par+" numeros par e "+impar+" impar");
	
	}		
		
}
