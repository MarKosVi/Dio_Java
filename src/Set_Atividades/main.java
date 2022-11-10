package Set_Atividades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		Set <String> arcoIris = new LinkedHashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
		
		for(String cores: arcoIris ) {
			System.out.println(cores);
		}
		System.out.println(arcoIris.size());

		
		List<String> list = new ArrayList<>(arcoIris);
		Collections.reverse(list);
		System.out.println(arcoIris);
		System.out.println(list);
		
		Iterator it = arcoIris.iterator();
		
		while(it.hasNext()) {
			String next = (String) it.next();
			if(next.substring(0,1).equalsIgnoreCase("v")) {
				System.out.println(next);
			}
		}
		System.out.println(arcoIris);
		Iterator it1 = arcoIris.iterator();
		while(it1.hasNext()) {
			String next = (String) it1.next();
			if(!next.substring(0,1).equalsIgnoreCase("v")) {
				it1.remove();
			}
		}
		
		System.out.println(arcoIris);
		arcoIris.clear();
		System.out.println(arcoIris.isEmpty());
		

	}

}
