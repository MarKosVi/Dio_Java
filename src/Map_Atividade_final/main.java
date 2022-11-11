package Map_Atividade_final;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		
		Map <String, Integer> populacao = new HashMap<>() {{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
		
		for(Map.Entry<String, Integer> p : populacao.entrySet()) {
			System.out.println("Estado = "+p.getKey()+" - "+"Populacao = "+p.getValue());
		}
		System.out.println("\n");
		populacao.put("RN", 3534165);
		
		for(Map.Entry<String, Integer> p : populacao.entrySet()) {
			System.out.println("Estado = "+p.getKey()+" - "+"Populacao = "+p.getValue());
		}
		
		System.out.println("\n");
		if(!populacao.containsKey("PB")) {
			populacao.put("PB", 4039277);
		}
		
		for(Map.Entry<String, Integer> p : populacao.entrySet()) {
			System.out.println("Estado = "+p.getKey()+" - "+"Populacao = "+p.getValue());
		}
		
		Map <String, Integer> populacao2 = new LinkedHashMap<>() {{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
		
		System.out.println("\n"+populacao2+"\n");
		
		Map <String, Integer> populacao3 = new TreeMap<>(populacao2);
		System.out.println("\n"+populacao3+"\n");
		
		System.out.println(Collections.min(populacao3.keySet())+" - "+Collections.min(populacao3.values()));
		System.out.println(Collections.max(populacao3.keySet())+" - "+Collections.max(populacao3.values()));
		
		Iterator <Integer> it = populacao3.values().iterator();
		Integer soma = 0;
		while(it.hasNext()) {
			Integer next = it.next();
			soma += next;
		};
		System.out.println("Soma da populacao total: "+soma);
		System.out.println("Media da populacao total: "+soma/populacao3.size());
		
		System.out.println(populacao3);
		Iterator <Integer> it2 = populacao3.values().iterator();
		
		while(it2.hasNext()) {
			Integer next = it2.next();
			if(next < 4000000) 
				it2.remove();
		}
		
		System.out.println(populacao3);
		populacao3.clear();
		System.out.println(populacao3.isEmpty());
		
		
	}

}
