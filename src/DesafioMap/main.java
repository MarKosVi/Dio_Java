package DesafioMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int min = 1;
		int max = 6;
		Map <Integer, Integer> dados = new HashMap<>() {{
			put(1, 0);
			put(2, 0);
			put(3, 0);
			put(4, 0);
			put(5, 0);
			put(6, 0);
		}};
		
		for (int i = 1; i<=100; i++) {
			int num = (int)Math.floor(Math.random()*(max-min+1)+min);
			Collection<Integer> o = dados.values();
			dados.put(num, o);
		}
		

	}

}
