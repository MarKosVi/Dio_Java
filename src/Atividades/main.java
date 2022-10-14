package Atividades;

import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, mult = 1;
		
		System.out.println("Calculo de fatorial \n");
		num = scan.nextInt();
		for(int i = num; i> 1; i--) {
			mult *= i;
			System.out.println(i+" x "+(i-1)+ " = "+mult );
		}
		System.out.println("O valor do fatorial  de "+num+"! e "+mult );
	
	}		
}
