package Atividades;

import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[6];
		
		for(int i = 0; i<6; i++) {
			System.out.println("Informe o "+(i+1)+" valor");
			arr[i] = scan.nextInt();
		}
		System.out.println("Os itens do array são: ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n Os itens do array invertidos: ");
		for(int i = (arr.length - 1); i>=0; i--){
			System.out.print(" "+arr[i]);
		}
	}		
}
