package Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.Comparator;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Contato> agenda = new HashMap<>() {{ 
			put(1, new Contato("Simba", 5555));
			put(4, new Contato("Cami", 1111));
			put(3, new Contato("John", 2222));
		}};
		
	System.out.println(agenda);	
	
	
	for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
		System.out.println(entry.getKey()+" - "+entry.getValue());
	}
	
	
	Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
		@Override
		public Integer apply(Map.Entry<Integer, Contato> cont) {
			return cont.getValue().getNumero();
		}
	}));
	
	System.out.println(set);
	
	Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
	
	System.out.println(set2);
	
/*	Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
		@Override
		public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
			return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
		}
	});
	
*/
	
	
	
	}

}
