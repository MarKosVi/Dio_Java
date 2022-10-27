package Funcionario;

public class Gerente extends Funcionario {
	
	private int bonus = 10;

	public Gerente(String nome, float salario) {
		super(nome, salario);
	}
	
	@Override
	public float getBeneficios () {
		return this.getSalario()+((this.getSalario()*bonus)/100);
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}
