package Lists;


import java.util.*;

public class main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		ArrayList<Gato> gatos = new ArrayList<>();
		
		gatos.add(new Gato("John", 18, "Preto"));
		gatos.add(new Gato("Bob", 6, "Tigrado"));
		gatos.add(new Gato("Ale", 12, "Laranja"));
		
		System.out.println(gatos);
		
		Collections.shuffle(gatos);
		System.out.println(gatos);
		Collections.sort(gatos);
		System.out.println(gatos);
		Collections.sort(gatos, new ComparatorGatosIdade());
		System.out.println(gatos);
		Collections.sort(gatos, new ComparatorGatosCor());
		System.out.println(gatos);
		Collections.sort(gatos, new ComparatorGatosNome());
		
	}
	

}



