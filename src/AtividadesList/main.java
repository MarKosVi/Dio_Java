package AtividadesList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Lists.Gato;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Questoes> temp = new ArrayList<>();
		
		temp.add(new Questoes("Telefonou para a vitima ?"));
		temp.add(new Questoes("Esteve no local do crime ?"));
		temp.add(new Questoes("Mora perto da vítima ?"));
		temp.add(new Questoes("Devia para a vítima ?"));
		temp.add(new Questoes("Já trabalhou com a vítima ?"));
		int count = 0;
		
		
		for(int i = 0; i< temp.size(); i++) {
			System.out.println(temp.get(i));
			System.out.println("S - para sim e N para não");		
			if(scan.next().equalsIgnoreCase("s")) {
				temp.get(i).setResp(true);
				count++;
			}
		}
		
		
		if(count == 2 ) { 
			System.out.println("Suspeita");
		}
		else if(count > 2 && count <= 4) {
			System.out.println("Cúmplice");	
		}
		else if(count > 4) {
			System.out.println("Assassina");	
		}else {
			System.out.println("Inocente");	
		}
	
		
		
	}

}
