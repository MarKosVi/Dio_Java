package Atividades;


import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int[][] matriz = new int[4][4];
		
		for(int i = 0; i<4; i++ ) {
			for(int j = 0; j<4; j++ ) {
				matriz[i][j] = random.nextInt(9);
			}
		}
		
		
		for(int i = 0; i<4; i++ ) {
			System.out.print(matriz[0][i]);
		}
		System.out.print("\n");
		for(int i = 0; i<4; i++ ) {
			System.out.print(matriz[1][i]);
		}
		System.out.print("\n");
		for(int i = 0; i<4; i++ ) {
			System.out.print(matriz[2][i]);
		}
		System.out.print("\n");
		for(int i = 0; i<4; i++ ) {
			System.out.print(matriz[3][i]);
		}
		
	}
}
