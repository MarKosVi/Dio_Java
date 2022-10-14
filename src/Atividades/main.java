package Atividades;

import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		int temp = 0;
		int media = 0;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Informe o "+i+" valor");
			arr[i] = scan.nextInt();
			media += arr[i];
			
			if(i == 0) {
				temp = arr[i];
			}
			
			if(temp < arr[i]) {
				temp = arr[i];
			}
		}
		media /=arr.length;
		
		System.out.println(" maior nota e: "+temp+" e a media e: "+media);
	}		
		
}
