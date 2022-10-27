package Funcionario;

public class main {

	public static void main(String[] args) {
		
		
		Funcionario[] funcionarios = new Funcionario[] {new Funcionario("Paulo", 1500), new Gerente("Maria", 1800), new Vendedor("Ana", 1500),  new Faxineiro("Jose", 1200)};
		
		
		for (Funcionario f: funcionarios ) {
			System.out.println(f.getNome());
			System.out.println(f.getSalario());
			System.out.println(f.getBeneficios());
			System.out.println("\n");
		}

	}

}
