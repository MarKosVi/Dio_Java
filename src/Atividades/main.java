package Atividades;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean temp = true;
		
		while(temp) {
			System.out.println("Informe o Nome");
			nome = scan.next();
			if(nome.equals("0")) {
				System.out.println("Programa finalizado");
				temp = false;
				break;
			}
			System.out.println("Informe a idade");
			idade = scan.nextInt();
			imprimir(nome, idade);	
		}
		
		
	}
	
	public static void imprimir(String nome, int idade) {
		System.out.println("Nome: "+nome+" idade: "+idade+"");
	}
}
