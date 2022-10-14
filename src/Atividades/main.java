package Atividades;

import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Informe o numero");
		num = scan.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.println(num+" X "+ i+" = "+(num*i) );
		}
	
	}		
		
}
