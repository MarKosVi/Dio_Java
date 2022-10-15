package Atividades;

import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] palavra = new String[6];
		String[] vogais = {"a", "e", "i", "o", "u"};
		int qtdConsoantes = 0;
		
		for (int i = 0; i<palavra.length; i++) {
			System.out.println("Informe o "+(i+1)+" numero");
			palavra[i] = scan.next();	
			
			if (!(palavra[i].equalsIgnoreCase("a") || palavra[i].equalsIgnoreCase("e") || palavra[i].equalsIgnoreCase("i") 
					|| palavra[i].equalsIgnoreCase("o") || palavra[i].equalsIgnoreCase("u"))) {
				qtdConsoantes++;
			}
			
		}
		
		System.out.print(qtdConsoantes+" ");	
	}
}
