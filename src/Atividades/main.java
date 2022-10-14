package Atividades;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Informe o valor da nota ");
		nota = scan.nextInt();
		while(nota < 0 || nota > 10) {
			System.out.println("Valor "+nota+" Invalido, informe uma nota valida");
			nota = scan.nextInt();
		}
		System.out.println("Nota: "+nota);
	}
}
