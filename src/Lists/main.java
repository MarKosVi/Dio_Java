package Lists;

import java.util.*;

public class main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		List<Integer> list = Arrays.asList(7, 8, 9, 5, 7, 0, 3);
		ArrayList<Integer> listaNotas = new ArrayList<>();
		
			System.out.println(list);	
			
		for(Integer l :  list) {
			listaNotas.add(l);
		}
			
		System.out.println(listaNotas);	
		System.out.println(listaNotas.get(5));	
		System.out.println(listaNotas.indexOf(5));	
		listaNotas.set(4, 8);
		System.out.println(listaNotas);	
		listaNotas.set(listaNotas.indexOf(5), 6);
		System.out.println(listaNotas);	
		System.out.println(listaNotas.contains(5));
		System.out.println(listaNotas.get(2));
		System.out.println(Collections.min(listaNotas, null));
		System.out.println(Collections.max(listaNotas, null));
		
		Integer soma = 0;
		for (Integer l : listaNotas) {
			soma += l;
		}
	
		System.out.println(soma);	
		
		/*Iterator notas = listaNotas.iterator();
		
		while(notas.hasNext()) {
			Integer next = (Integer) notas.next();
			soma += next;
		}*/
		System.out.println(soma/listaNotas.size());	
		listaNotas.remove(listaNotas.indexOf(0));
		System.out.println(listaNotas);	
		listaNotas.remove(0);
		System.out.println(listaNotas);	
		
		Iterator it = listaNotas.iterator();
		while(it.hasNext()) {
			Integer next = (Integer) it.next();
			if (next < 7) it.remove();
			
		}
		System.out.println(listaNotas);
		listaNotas.clear();
		System.out.println(listaNotas);
		System.out.println(listaNotas.isEmpty());
		}
}
