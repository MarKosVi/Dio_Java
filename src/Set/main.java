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
		
		Set <Series> minhasSeries = new HashSet<>() {{
			add(new Series("Game of Thrones", "Fantasia", 60));
			add(new Series("Supernatural", "Misterio", 60));
			add(new Series("Rick and Morty", "Comedia", 40 ));
			add(new Series("She Hulk", "Comedia", 30 ));
		}};
		
		System.out.println(minhasSeries);
		
		
		Set <Series> minhasSeriesOrdem = new LinkedHashSet<>(){{
			add(new Series("Game of Thrones", "Fantasia", 60));
			add(new Series("Supernatural", "Misterio", 50));
			add(new Series("Rick and Morty", "Comedia", 40 ));
		}};
		System.out.println(minhasSeriesOrdem);
		
		Set <Series> minhasSeriesTree = new TreeSet<>(minhasSeries);
		System.out.println(minhasSeriesTree);
		
		
		
		
	}

}
