package Set_exercicios_2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		
		Set<LinguagemFavorita> linguagem = new LinkedHashSet<>() {{
			add(new LinguagemFavorita("Java", 1977, "Eclipse"));
			add(new LinguagemFavorita("JavaScript", 1995, "bScode"));
			add(new LinguagemFavorita("Python", 1991, "PyCharm"));
		}};
		
		System.out.println(linguagem);
		
		Set<LinguagemFavorita> linguagens = new TreeSet<>(linguagem);
		System.out.println(linguagens);
	}

}
