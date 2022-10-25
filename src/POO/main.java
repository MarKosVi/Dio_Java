package POO;

public class main {

	public static void main(String[] args) {
		
		Carro a = new Carro("preto", "Uno", 20);
		Carro b = new Carro();
		
		b.setCor("Azul");
		b.setModelo("Punto");
		b.setCapacidadeTanque(35);
		
		System.out.println(a.getCusto(1.50));
		
		System.out.println(b.getModelo());
		System.out.println(b.getCor());
		System.out.println(b.getCapacidadeTanque());
		System.out.println(b.getCusto(2.75));
	}

}
