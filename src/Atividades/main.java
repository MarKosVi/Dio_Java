package Atividades;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		imprimir(scan);
		
	}
	
	public static void imprimir(Scanner scan) {
		
		String nome;
		int idade;
		
		while(true) {
			System.out.println("Informe o Nome");
			nome = scan.next();
			if(nome.equals("0"))break;
			System.out.println("Informe a idade");
			idade = scan.nextInt();
			System.out.println("Nome: "+nome+" idade: "+idade+"");
		}
		System.out.println("Programa finalizado");
	}
}
