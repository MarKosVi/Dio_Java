package Map_Atividades;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		
		Map <String, Livros> meusLivros = new HashMap<>() {{
			put("Hawking, Stephen", new Livros("Uma breve historia do tempo", 290));
			put("Quhigg, Charles", new Livros("O poder do Habito", 320));
			put("Harari, Yuvel Noah", new Livros("21 licoes para o seculo 21", 180));
		}};
		
		Map <String, Livros> meusLivros2 = new LinkedHashMap<>() {{
			put("Hawking, Stephen", new Livros("Uma breve historia do tempo", 290));
			put("Quhigg, Charles", new Livros("O poder do Habito", 320));
			put("Harari, Yuvel Noah", new Livros("As 21 licoes para o seculo 21", 180));
		}};
		
		System.out.println(meusLivros);
		System.out.println(meusLivros2);
		
		for(Map.Entry<String, Livros> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey()+" - "+livro.getValue().getPaginas());
		}
		
		for(Map.Entry<String, Livros> livro : meusLivros2.entrySet()) {
			System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
		}
		
	}

}
