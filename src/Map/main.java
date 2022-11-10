package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		
		Map <String, Double> carrosPopulares = new HashMap<>() {{
			put("Gol", 14.4);
			put("Uno", 15.6);
			put("Mobi", 16d);
			put("Hb20", 15.6);
			put("Kwid", 14.4);
		}};
		
		Map <String, Double> carrosPopulares1 = new LinkedHashMap<>(carrosPopulares);
		Map <String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);
	
	System.out.println(carrosPopulares);
	//carrosPopulares.put("Gol", 15.2);
	System.out.println(carrosPopulares);
	System.out.println(carrosPopulares.containsKey("Tucson"));
	System.out.println(carrosPopulares.containsKey("Uno"));
	System.out.println(carrosPopulares.get("Uno"));
	System.out.println(carrosPopulares.keySet());
	System.out.println(carrosPopulares.values());
	
	System.out.println(Collections.max(carrosPopulares.values()));
	System.out.println(Collections.min(carrosPopulares.values()));
	Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
	
	String modeloMaisEficiente = "";
	String modeloMenosEficiente = "";
	
	for(Map.Entry<String, Double> entry : entries) {
		if(entry.getValue().equals(Collections.max(carrosPopulares.values()))) {
			modeloMaisEficiente = entry.getKey();
			System.out.println("Modelo mais eficiente: "+modeloMaisEficiente + " - "+entry.getValue());
		}
	}
	
	for(Map.Entry<String, Double> entry : entries) {
		if(entry.getValue().equals(Collections.min(carrosPopulares.values()))) {
			modeloMenosEficiente = entry.getKey();
			System.out.println("Modelo Menos Eficiente: "+modeloMenosEficiente + " - "+entry.getValue());
		}
	}
	
	
	Iterator <Double> it = carrosPopulares.values().iterator();
	Double soma = 0d;
	while(it.hasNext()) {
		Double next = it.next();
		soma += next;
	}
	System.out.println(soma);	
	
	System.out.println(carrosPopulares);
	Iterator <Double> it1 = carrosPopulares.values().iterator();
	while(it1.hasNext()) {
		Double next = it1.next();
		if(next == 15.6 )
			it1.remove();
	}
	System.out.println(carrosPopulares);	
	System.out.println(carrosPopulares1);
	System.out.println(carrosPopulares2);
	carrosPopulares1.clear();
	System.out.println(carrosPopulares1.isEmpty());
	
	}
}
