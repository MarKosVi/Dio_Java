package Set;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;


public class main {

	public static void main(String[] args) {
		
		Set <Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		Set <Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		Set <Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas);
		
		
		System.out.println(notas.contains(5d));
		System.out.println(Collections.max(notas));
		System.out.println(Collections.min(notas));
		
		Iterator i = notas.iterator();
		
		Double soma = 0d;
		
		while(i.hasNext()) {
			Double next = (Double) i.next();
			soma += next;
		}
		
		System.out.println(soma);
		System.out.println(soma/notas.size());
		notas.remove(0d);
		System.out.println(notas);
		
		Iterator i1 = notas.iterator();
		while(i1.hasNext()) {
			Double next = (Double) i1.next();
			if(next < 7)
				i1.remove();
		}
		System.out.println(notas2);
		
		System.out.println(notas3);
		notas.clear();
		System.out.println(notas);
	}

}
