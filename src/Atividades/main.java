package Atividades;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();    
		
		int[] num = new int[20];
		
		for(int i = 0; i<20; i++) {
			num[i] = random.nextInt(100);
		}
		
		for(int i = 0; i<20; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("\n Seus sucessores sao: ");
		for(int i = 0; i<20; i++) {
			System.out.print((++num[i])+" ");
		}			
	}
}
