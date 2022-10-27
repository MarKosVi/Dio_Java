package Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<>();
		double soma = 0;
		
		
		for(int i = 1; i<= 7; i++) {
			System.out.println("Informe a "+i+" nota");
			notas.add(in.nextDouble());
		}
		
		System.out.println(notas);
		System.out.println(notas.indexOf(5.0));
		notas.set(4, 8.0);
		System.out.println(notas);
		notas.set(5, notas.get(6));
		System.out.println(notas);
		System.out.println(notas.contains(5.0));
		System.out.println(Collections.min(notas));
		System.out.println(Collections.max(notas));
		System.out.println(notas.get(0) + notas.get(notas.size()-1));
		
		for(double r : notas) {
			soma += r;
		}
		System.out.println(soma);
		System.out.println(soma/notas.size());
		System.out.println(notas);
		System.out.println(notas.remove(0d));
		System.out.println(notas);

	}

}
