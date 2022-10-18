package metodos;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Quadrilatero q = new Quadrilatero();
		
		System.out.println("Informe o valor dos lados");
		System.out.println(q.Area(scan.nextDouble(), scan.nextDouble(), scan.nextDouble()));
		
		
	}
	

}
